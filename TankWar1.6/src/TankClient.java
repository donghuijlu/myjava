import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.event.*;

public class TankClient extends Frame{
	public static final int GAME_WIDTH=800;
	public static final int GAME_HEIGHT=600;
	
	
	Tank myTank=new Tank(50,50,true,this);
	Tank enemyTank=new Tank(50,50,false,this);
	List<Missile> missiles=new ArrayList<Missile>();

	
	
	Image offScreenImage=null;//定义一个虚拟图片
	
	public void paint(Graphics g) {
		g.drawString("missiles count:"+missiles.size(), 10, 50);
		
		for(int i=0;i<missiles.size();i++){
			Missile m=missiles.get(i);
			m.draw(g);
/*			if(!m.isLive()){
				missiles.remove(m);
			}else{
				m.draw(g);
			}
			*/
		}
		
		myTank.draw(g);
		
		enemyTank.draw(g);
		
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
					Thread.sleep(50);
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
