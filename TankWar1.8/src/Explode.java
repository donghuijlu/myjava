import java.awt.*;
public class Explode {
	
	int x;
	int y;
	private boolean live=true;
	
	private TankClient tc;
	
	int [] diameter={4,7,13,18,50,40,20,13,6};
	int step=0;
	
	public Explode(int x, int y, TankClient tc) {
		super();
		this.x = x;
		this.y = y;
		this.tc = tc;
	}
	
	public void draw(Graphics g){
		if(!live){
			tc.explodes.remove(this);
			return;
		}
		
		if(step==diameter.length){
			live=false;
			step=0;
			return;
		}
		
		Color c=g.getColor();
		g.setColor(Color.BLACK);
		g.fillOval(x, y, diameter[step], diameter[step]);
		g.setColor(c);
		step++;
	}

}
