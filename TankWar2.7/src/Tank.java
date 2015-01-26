import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
/**
 * ̹���༰���¼�����
 * @author donghui
 *
 */
public class Tank {
	/**
	 * ̹���н��ٶ�
	 */
	public static final int XSPEED=5,YSPEED=5;
	/**
	 * ̹�˵ĳߴ�
	 */
	public static final int WIDTH=30;
	public static final int HEIGHT=30;
	
	/**
	 * ���ж��������tc
	 */
	
	TankClient tc;
	/**
	 * ��ǰλ��
	 */
	private int x,y;
	/**
	 * ǰһʱ��λ��
	 */
	private int oldX,oldY;
	
	/**
	 * ̹�˵�����ֵ
	 */
	private  int life=100;
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	
	/**
	 * ̹������������
	 */
	
	private BloodBar bb=new BloodBar();
	
	
	/**
	 * ��¼����״̬�Ĳ�����
	 */
	private boolean bL=false,bU=false,bR=false,bD=false;
	
	/**
	 * ָʾ��ǰ���ҷ�̹�˻��ǵз�̹�ˣ�trueʱΪ�ҷ���falseʱΪ�з�
	 */
	private boolean good;
	public boolean isGood() {
		return good;
	}

/**
 * ����һ�������������
 */
	private static Random r=new Random();
	
/**
 * ���̹�����з����ö����
 * @author donghui
 *
 */
	enum Direction{//��ӷ����ö����
		L,LU,U,RU,R,RD,D,LD,STOP
	}
	
	private Direction dir=Direction.STOP;
	
	private Direction ptDir=Direction.D;
	
	private int step=r.nextInt(12)+3;
	/**
	 * ̹�˵Ĺ��췽��
	 * @param x 
	 * @param y
	 * @param good true��ʾ�ҷ�̹��
	 */
	public Tank(int x, int y,boolean good) {
		this.x = x;
		this.y = y;
		this.good=good;
		this.oldX=x;
		this.oldY=y;
	}
	/**
	 * ��д���췽��
	 * @param x
	 * @param y
	 * @param good
	 * @param dir ��ǰ���з���
	 * @param tc ���ж��������
	 */
	public Tank(int x,int y,boolean good,Direction dir,TankClient tc){
		this(x,y,good);
		this.dir=dir;
		this.tc=tc;
		
	}
	
	/**
	 * ̹�˵�����״̬
	 */
	private boolean live=true;
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	
/**
 * ̹�˸��ݷ������еĺ���
 */
	void move(){//���ݷ�������ƶ�
		
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
		//���̹�˲�ͣ��������Ͳ����������з���һ��
		if(this.dir !=Direction.STOP){
			this.ptDir=this.dir;
		}
		
		//����̹�˳���
		if(x<0) x=0;
		if(y<30) y=30;
		if(x+Tank.WIDTH>TankClient.GAME_WIDTH) x=TankClient.GAME_WIDTH-Tank.WIDTH;
		if(y+Tank.HEIGHT>TankClient.GAME_HEIGHT) y=TankClient.GAME_HEIGHT-Tank.HEIGHT;
		
		//���Ƶз�̹�˰������ƶ�
		if(!good){
			
			Direction[] dirs= Direction.values();//���巽������
			
			if(step==0){
				step=r.nextInt(12)+3;
				int rn=r.nextInt(dirs.length);
				dir=dirs[rn];
			}
			
			step--;
			if(r.nextInt(40)>35) this.fire();//���ɵ����������35����з�̹�˿���
		}
	}
	/**
	 * �˷���������̹��λ���˻ص���һ��
	 */
	private void stay(){
		x=oldX;
		y=oldY;	
	}
	
	/**
	 * ��̹�˵ķ���
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
		
		if(this.good) bb.draw(g); //�ҷ�̹�˻�����������
		
		switch(ptDir){//����Ͳ
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
	 * ���¼��̵��¼�
	 * @param e
	 */
	public void keyPressed(KeyEvent e){
		int key=e.getKeyCode();//���������
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
	 * ˫��������̹�˰˸������н�
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
 * �����ɿ����¼�����
 * @param e
 */
	public void keyReleased(KeyEvent e) {
		int key=e.getKeyCode();//���������
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
	 * �����ӵ��ķ���
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
	 * ����ײ���
	 * @return
	 */
	public Rectangle getRect(){
		return new Rectangle(x,y,WIDTH,HEIGHT);
	}
	/**
	 * �Ƿ�ײ��ǽ
	 * @param w ����ǽ�Ĳ���
	 * @return ����ֵΪ��������
	 */
	public boolean collidesWithWall(Wall w){
		if(this.live && this.getRect().intersects(w.getRect())){
			this.stay();
			return true;
		}
		return false;
		
	}
	/**
	 * �ط�̹��֮����ײ���
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
	 * �ҷ�̹�����⼼�ܣ��˸�����ͬʱ�����ӵ�
	 */
	public void superFire(){
		Direction[] dir=Direction.values();
		for(int i=0;i<8;i++){
			fire(dir[i]);
		}
	}
	/**
	 * ̹������ֵ������
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
	 * ̹�˼�Ѫ����
	 * @param b 
	 * @return ��������
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
