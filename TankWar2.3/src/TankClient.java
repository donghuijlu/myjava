import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.event.*;

public class TankClient extends Frame{
	public static final int GAME_WIDTH=800;
	public static final int GAME_HEIGHT=600;
	
	
	Tank myTank=new Tank(50,50,true,Tank.Direction.STOP,this);
	
	Explode e=new Explode(70,70,this);
	Wall w1=new Wall(150,200,20,300,this),w2=new Wall(300,100,300,20,this);
	
	
	List<Explode> explodes=new ArrayList<Explode>();
	List<Missile> missiles=new ArrayList<Missile>();
	List<Tank> tanks=new ArrayList<Tank>();

	Image offScreenImage=null;//定义一个虚拟图片
	
	public void paint(Graphics g) {
		g.drawString("missiles count:"+missiles.size(), 10, 50);
		g.drawString("Explodes,count:"+explodes.size(),10,70);
		g.drawString("Tanks,count:"+tanks.size(),10,90);
		
		for(int i=0;i<missiles.size();i++){
			Missile m=missiles.get(i);
			m.hitTanks(tanks);
			m.hitTank(myTank);
			m.hitWall(w1);
			m.hitWall(w2);
			m.draw(g);
/*			if(!m.isLive()){
				missiles.remove(m);
			}else{
				m.draw(g);
			}
			*/
		}
		for(int i=0;i<tanks.size();i++){
			Tank t=tanks.get(i);
			t.collidesWithWall(w1);
			t.collidesWithWall(w2);
			t.collidesWithTanks(tanks);
			t.draw(g);
		}
		for(int i=0;i<explodes.size();i++){
			Explode e=explodes.get(i);
			e.draw(g);
		}
		
		myTank.draw(g);
		
		w1.draw(g);
		w2.draw(g);
			
	}
	
	@Override
	public void update(Graphics g) {
		if(offScreenImage==null){
			offScreenImage=this.createImage(GAME_WIDTH, GAME_HEIGHT);
		}
		Graphics gOffScreen=offScreenImage.getGraphics();//拿到画笔
		Color c=gOffScreen.getColor();
		gOffScreen.setColor(Color.GREEN);
		gOffScreen.fillRect(0,0,GAME_WIDTH,GAME_HEIGHT);
		gOffScreen.setColor(c);
		paint(gOffScreen);
		g.drawImage(offScreenImage, 0,0, null);
		
	}

	public void launchFrame(){
		
		for(int i=0;i<10;i++){
			tanks.add(new Tank(50+40*(i+1),50,false,Tank.Direction.D,this));
		}
		
		this.setLocation(400,300);
		this.setSize(GAME_WIDTH,GAME_HEIGHT);
		this.setTitle("TankWar");
		this.addWindowListener(new WindowAdapter(){//匿名类 

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
		});
		this.setResizable(false);
		this.setBackground(Color.GREEN);
		this.addKeyListener(new KeyMonitor());
		
		setVisible(true);
		
		new Thread(new PaintThread()).start();
		
	}
	public static void main(String[] args){
		TankClient tc=new TankClient();
		tc.launchFrame();
	}
	
	private class PaintThread implements Runnable{
		
		public void run(){
			while(true){
				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	private class KeyMonitor extends KeyAdapter{//键盘事件

		

		@Override
		public void keyReleased(KeyEvent e) {
			myTank.keyReleased(e);
		}

		@Override
		public void keyPressed(KeyEvent e) {
			myTank.keyPressed(e);

		}
		
	}

}
