import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.awt.Rectangle;


public class Missile {
	int x,y;
	Tank.Direction dir;
	public static final int XSPEED=10,YSPEED=10;
	public static final int WIDTH=10;
	public static final int HEIGHT=10;
	
	private boolean live=true;
	private TankClient tc;
	public boolean isLive() {
		return live;
	}

	Missile(int x, int y, Tank.Direction dir,TankClient tc) {
		this.x = x;
		this.y = y;
		this.dir=dir;
		this.tc=tc;
	
	}
	
	 void draw(Graphics g){
		if(!live){
			tc.missiles.remove(this);
			return;
		}
		
		Color c=g.getColor();
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, WIDTH, HEIGHT);
		g.setColor(c);
		
		move();
	}

	private void move() {
		
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
		
		if(x<0 || y<0 || x>TankClient.GAME_WIDTH ||y>TankClient.GAME_HEIGHT){
			live=false;
			
		}
		
	}
	public Rectangle getRect(){
		return new Rectangle(x,y,WIDTH,HEIGHT);
	}
	public boolean hitTank(Tank t){
		if(this.getRect().intersects(t.getRect())&& t.isLive()){
			t.setLive(false);
			this.live=false;
			Explode e=new Explode(x,y,tc);
			tc.explodes.add(e);
			return true;
		}
		return false;
	}
	
	public boolean hitTanks(List<Tank> tanks){
		for(int i=0;i<tanks.size();i++){
			if(hitTank(tanks.get(i))){
				return true;
			}
		}
		return false;
	}
	

	

}

