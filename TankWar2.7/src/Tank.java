import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
/**
 * 坦克类及其事件处理
 * @author donghui
 *
 */
public class Tank {
	/**
	 * 坦克行进速度
	 */
	public static final int XSPEED=5,YSPEED=5;
	/**
	 * 坦克的尺寸
	 */
	public static final int WIDTH=30;
	public static final int HEIGHT=30;
	
	/**
	 * 持有对象的引用tc
	 */
	
	TankClient tc;
	/**
	 * 当前位置
	 */
	private int x,y;
	/**
	 * 前一时刻位置
	 */
	private int oldX,oldY;
	
	/**
	 * 坦克的生命值
	 */
	private  int life=100;
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	
	/**
	 * 坦克生命进度条
	 */
	
	private BloodBar bb=new BloodBar();
	
	
	/**
	 * 记录按键状态的布尔量
	 */
	private boolean bL=false,bU=false,bR=false,bD=false;
	
	/**
	 * 指示当前是我方坦克还是敌方坦克，true时为我方，false时为敌方
	 */
	private boolean good;
	public boolean isGood() {
		return good;
	}

/**
 * 引入一个类生成随机量
 */
	private static Random r=new Random();
	
/**
 * 添加坦克运行方向的枚举量
 * @author donghui
 *
 */
	enum Direction{//添加方向的枚举量
		L,LU,U,RU,R,RD,D,LD,STOP
	}
	
	private Direction dir=Direction.STOP;
	
	private Direction ptDir=Direction.D;
	
	private int step=r.nextInt(12)+3;
	/**
	 * 坦克的构造方法
	 * @param x 
	 * @param y
	 * @param good true表示我方坦克
	 */
	public Tank(int x, int y,boolean good) {
		this.x = x;
		this.y = y;
		this.good=good;
		this.oldX=x;
		this.oldY=y;
	}
	/**
	 * 重写构造方法
	 * @param x
	 * @param y
	 * @param good
	 * @param dir 当前运行方向
	 * @param tc 持有对象的引用
	 */
	public Tank(int x,int y,boolean good,Direction dir,TankClient tc){
		this(x,y,good);
		this.dir=dir;
		this.tc=tc;
		
	}
	
	/**
	 * 坦克的生命状态
	 */
	private boolean live=true;
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	
/**
 * 坦克根据方向运行的函数
 */
	void move(){//根据方向进行移动
		
		this.oldX=x;
		this.oldY=y;
		
		switch(dir){
		case L:
			x-=XSPEED;
			break;
		case LU:
			x-=XSPEED;
			y-=YSPEED;
			break;
		case U:
			y -= YSPEED;
			break;
		case RU:
			x+=XSPEED;
			y-=YSPEED;
			break;
		case R:
			x+=XSPEED;
			break;
		case RD:
			x+=XSPEED;
			y+=YSPEED;
			break;
		case D:
			y+=YSPEED;
			break;
		case LD:
			x-=XSPEED;
			y+=YSPEED;
			break;
		case STOP:
			break;
			
		}
		//如果坦克不停，则其炮筒方向和其运行方向一致
		if(this.dir !=Direction.STOP){
			this.ptDir=this.dir;
		}
		
		//控制坦克出界
		if(x<0) x=0;
		if(y<30) y=30;
		if(x+Tank.WIDTH>TankClient.GAME_WIDTH) x=TankClient.GAME_WIDTH-Tank.WIDTH;
		if(y+Tank.HEIGHT>TankClient.GAME_HEIGHT) y=TankClient.GAME_HEIGHT-Tank.HEIGHT;
		
		//控制敌方坦克按步骤移动
		if(!good){
			
			Direction[] dirs= Direction.values();//定义方向数组
			
			if(step==0){
				step=r.nextInt(12)+3;
				int rn=r.nextInt(dirs.length);
				dir=dirs[rn];
			}
			
			step--;
			if(r.nextInt(40)>35) this.fire();//生成的随机数大于35，则敌方坦克开火
		}
	}
	/**
	 * 此方法用来讲坦克位置退回到上一步
	 */
	private void stay(){
		x=oldX;
		y=oldY;	
	}
	
	/**
	 * 画坦克的方法
	 * @param g
	 */
	public void draw(Graphics g){
		
		if(!live){
			if(!good){
				tc.tanks.remove(this);
			}
			return;
		}
		
		Color c=g.getColor();
		if(good==true) g.setColor(Color.RED);
		else g.setColor(Color.BLUE);
		g.fillOval(x, y, WIDTH, HEIGHT);
		g.setColor(c);
		
		if(this.good) bb.draw(g); //我方坦克画生命进度条
		
		switch(ptDir){//画炮筒
		case L:
			g.drawLine(x+Tank.WIDTH/2, y+Tank.HEIGHT/2, x,y+Tank.HEIGHT/2);
			break;
		case U:
			g.drawLine(x+Tank.WIDTH/2, y+Tank.HEIGHT/2, x+Tank.WIDTH/2,y);
			break;
		case LU:
			g.drawLine(x+Tank.WIDTH/2, y+Tank.HEIGHT/2, x,y);
			break;
		case RU:
			g.drawLine(x+Tank.WIDTH/2, y+Tank.HEIGHT/2, x+Tank.WIDTH,y);
			break;
		case R:
			g.drawLine(x+Tank.WIDTH/2, y+Tank.HEIGHT/2, x+Tank.WIDTH,y+Tank.HEIGHT/2);
			break;
		case RD:
			g.drawLine(x+Tank.WIDTH/2, y+Tank.HEIGHT/2, x+Tank.WIDTH,y+Tank.HEIGHT);
			break;
		case D:
			g.drawLine(x+Tank.WIDTH/2, y+Tank.HEIGHT/2, x+Tank.WIDTH/2,y+Tank.HEIGHT);
			break;
		case LD:
			g.drawLine(x+Tank.WIDTH/2, y+Tank.HEIGHT/2, x,y+Tank.HEIGHT);
			break;
				
		}
		move();
	}
	/**
	 * 按下键盘的事件
	 * @param e
	 */
	public void keyPressed(KeyEvent e){
		int key=e.getKeyCode();//获得虚拟码
		switch(key){
		
		case
			KeyEvent.VK_F2:
				if(!this.live){
					this.live=true;
					this.life=100;
				}
				break;
		case
			KeyEvent.VK_LEFT:
				bL=true;
				break;
		case 
			KeyEvent.VK_UP:
				bU=true;
				break;
		case 
			KeyEvent.VK_RIGHT:
				bR=true;
				break;
		case
			KeyEvent.VK_DOWN:
				bD=true;
				break;
			
		}
		locateDirection();
	}
	
	/**
	 * 双按键控制坦克八个方向行进
	 */
	void locateDirection(){
		if(bL && !bU && !bR && !bD) dir=Direction.L;
		else if(bL && bU && !bR && !bD) dir=Direction.LU;
		else if(!bL && bU && !bR && !bD) dir=Direction.U;
		else if(!bL && bU && bR && !bD) dir=Direction.RU;
		else if(!bL && !bU && bR && !bD) dir=Direction.R;
		else if(!bL && !bU && bR && bD) dir=Direction.RD;
		else if(!bL && !bU && !bR && bD) dir=Direction.D;
		else if(bL && !bU && !bR && bD) dir=Direction.LD;
		else if(!bL && !bU && !bR && !bD) dir=Direction.STOP;
		
	}
/**
 * 键盘松开的事件处理
 * @param e
 */
	public void keyReleased(KeyEvent e) {
		int key=e.getKeyCode();//获得虚拟码
		switch(key){
		case
		KeyEvent.VK_CONTROL:
			fire();
			break;
		case
			KeyEvent.VK_LEFT:
				bL=false;
				break;
		case 
			KeyEvent.VK_UP:
				bU=false;
				break;
		case 
			KeyEvent.VK_RIGHT:
				bR=false;
				break;
		case
			KeyEvent.VK_DOWN:
				bD=false;
				break;
		case 
			KeyEvent.VK_A:
				this.superFire();
				break;
			
		}
		locateDirection();
		
	}
	/**
	 * 发射子弹的方法
	 * @return
	 */
	public Missile fire(){
		if(!live) return null ;
		int x=this.x+Tank.WIDTH/2-Missile.WIDTH/2;
		int y=this.y+Tank.HEIGHT/2-Missile.HEIGHT/2;
		Missile m=new Missile(x,y,good,ptDir,this.tc);
		tc.missiles.add(m);
		return m;
	}
	
	public Missile fire(Direction dir){
		if(!live) return null ;
		int x=this.x+Tank.WIDTH/2-Missile.WIDTH/2;
		int y=this.y+Tank.HEIGHT/2-Missile.HEIGHT/2;
		Missile m=new Missile(x,y,good,dir,this.tc);
		tc.missiles.add(m);
		return m;
	}
	
	/**
	 * 做碰撞检测
	 * @return
	 */
	public Rectangle getRect(){
		return new Rectangle(x,y,WIDTH,HEIGHT);
	}
	/**
	 * 是否撞到墙
	 * @param w 传进墙的参数
	 * @return 返回值为布尔类型
	 */
	public boolean collidesWithWall(Wall w){
		if(this.live && this.getRect().intersects(w.getRect())){
			this.stay();
			return true;
		}
		return false;
		
	}
	/**
	 * 地方坦克之间碰撞检测
	 * @param tanks
	 * @return
	 */
	public boolean collidesWithTanks(java.util.List<Tank> tanks){
		for(int i=0;i<tanks.size();i++){
			Tank t=tanks.get(i);
			if(this !=t){
				if(this.live && t.isLive() && this.getRect().intersects(t.getRect())){
					this.stay();
					t.stay();
					return true;
				}
				
			}
		}
		return false;
		
	}
	/**
	 * 我方坦克特殊技能，八个方向同时发射子弹
	 */
	public void superFire(){
		Direction[] dir=Direction.values();
		for(int i=0;i<8;i++){
			fire(dir[i]);
		}
	}
	/**
	 * 坦克生命值进度条
	 * @author donghui
	 *
	 */
	private class BloodBar{
		public void draw(Graphics g){
			Color c=g.getColor();
			g.setColor(Color.RED);
			g.drawRect(x, y-10, WIDTH, 10);
			int w=WIDTH*life/100;
			g.fillRect(x, y-10, w, 10);
			g.setColor(c);
			
		}

		
	}
	/**
	 * 坦克加血方法
	 * @param b 
	 * @return 布尔类型
	 */
	public boolean eat(Blood b){
		if(this.live && b.isLive() && this.getRect().intersects(b.getRect())){
			this.life=100;
			b.setLive(false);
			return true;
			
		}
		return false;
	}


}
