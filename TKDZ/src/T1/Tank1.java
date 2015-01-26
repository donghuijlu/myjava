package T1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Tank1 extends JFrame{
	MyPanel mp=null;
	
	public static void main(String[] args){
		Tank1 t1=new Tank1();
	}
	public Tank1(){//构造方法
		mp=new MyPanel();
		this.add(mp);
		
		
		this.setSize(400,300);
		this.setLocation(300,280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

class MyPanel extends JPanel implements KeyListener,Runnable{
	MyTank mt=null;
	Vector<DiTank> dtk=new Vector<DiTank>();
	int tks1=3;
	public MyPanel(){
		mt=new MyTank(140,232);//构造方法，坦克的位置
		
		for(int i=0;i<tks1;i++){
			DiTank dt=new DiTank((i)*181+5,0);
			dtk.add(dt);
			
		}
	}
	public void paint(Graphics g){//画坦克的程序
		super.paint(g);
		g.fillRect(0, 0, 400, 300);//画的画布
		this.drawTank(mt.getX(), mt.getY(),g,mt.fangxiang,0);
		for(int i=0;i<dtk.size();i++){
			this.drawTank(dtk.get(i).getX(),dtk.get(i).getY(), g, 2, 1);
		}
		for(int i=0;i<mt.aa.size();i++){
			
			Zidan zd=mt.aa.get(i);
			
			if(mt.zd!=null && mt.zd.shengming==true){
				g.setColor(Color.white);
				g.fill3DRect(mt.zd.x,mt.zd.y, 3,3,false);
			}
			if(zd.shengming==false){
				mt.aa.remove(zd);
			}
		}
		
		
		//g.setColor(Color.yellow);//坦克颜色
		//g.fill3DRect(mt.getX(), mt.getY(),5,30,false);
		//g.fill3DRect(mt.getX()+15,mt.getY(),5, 30, false);
		//g.fill3DRect(mt.getX()+5,mt.getY()+5,10, 20, false);
		//g.fillOval(mt.getX()+10,mt.getY()+10,10,10);
		//g.drawLine(mt.getX()+10,mt.getY()+15,mt.getX()+10,mt.getY()-3);
	}
	//将画坦克封装
	public void drawTank(int x,int y,Graphics g,int fangxiang,int leixing){
		switch(leixing){
		case 0:  //我的坦克
			g.setColor(Color.yellow);
			break;
		case 1://敌人坦克
			g.setColor(Color.green);
			break;
			
		}
		switch(fangxiang){
		case 0://上
			g.fill3DRect(x, y,5,30,false);
			g.fill3DRect(x+15,y,5, 30, false);
			g.fill3DRect(x+5,y+5,10, 20, false);
			g.fillOval(x+5,y+10,10,10);
			g.drawLine(x+10,y+15,x+10,y-3);
			break;
		case 1://左
			g.fill3DRect(x, y,30,5,false);
			g.fill3DRect(x,y+15,30, 5, false);
			g.fill3DRect(x+5,y+5,20, 10, false);
			g.fillOval(x+10,y+5,10,10);
			g.drawLine(x+15,y+10,x-3,y+10);
			break;
		case 2://下
			g.fill3DRect(x, y,5,30,false);
			g.fill3DRect(x+15,y,5, 30, false);
			g.fill3DRect(x+5,y+5,10, 20, false);
			g.fillOval(x+5,y+10,10,10);
			g.drawLine(x+10,y+15,x+10,y+33);
			break;
			
		case 3://右
			g.fill3DRect(x, y,30,5,false);
			g.fill3DRect(x,y+15,30, 5, false);
			g.fill3DRect(x+5,y+5,20, 10, false);
			g.fillOval(x+10,y+5,10,10);
			g.drawLine(x+15,y+10,x+33,y+10);
			break;	
		}
	}
	public void keyTyped(KeyEvent e){}
	public void keyReleased(KeyEvent e){}
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode()==KeyEvent.VK_W){
			this.mt.setFangxiang(0);
			this.mt.xiangshang();
		}else if(e.getKeyCode()==KeyEvent.VK_A){
			this.mt.setFangxiang(1);
			this.mt.xiangzuo();
		}else if(e.getKeyCode()==KeyEvent.VK_S){
			this.mt.setFangxiang(2);
			this.mt.xiangxia();
		}else if(e.getKeyCode()==KeyEvent.VK_D){
			this.mt.setFangxiang(3);
			this.mt.xiangyou();
		}
		if(e.getKeyCode()==KeyEvent.VK_J){
			if(this.mt.aa.size()<8){
				this.mt.fszd();
			}
		}
		this.repaint();
	}
	public void run(){
		while(true){
			try{
				Thread.sleep(100);
			}catch(Exception e){}
			
			for(int i=0;i<mt.aa.size();i++){
				Zidan zd=mt.aa.get(i);
				if(zd.shengming){
					for(int j=0;j<dtk.size();j++){
						DiTank dt=dtk.get(j);
						
						if(dt.shengming){
							this.jzdf(zd,dt);
						}
					}
				}
			}
			this.repaint();
		}
	}
}
