package java8;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class l8_4 extends JFrame{
	Wdmb4 mb=null;
	
	public static void main(String[] args){
		l8_4 lx=new l8_4();
	}
	public l8_4(){
		mb=new Wdmb4();
		this.add(mb);
		this.addKeyListener(mb);
		this.setSize(400,300);
		this.setLocation(300,280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
class Wdmb4 extends JPanel implements KeyListener{
	int x=50,y=60;
	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(x, y, 30, 30);
	}
	public void keyTyped(KeyEvent e){
		
	}
	public void keyPressed(KeyEvent e){
		System.out.println("¼üÅÌ±»°´ÏÂ");
		System.out.println((char)e.getKeyCode());
		if(e.getKeyCode()==KeyEvent.VK_DOWN){
			y++;
		}
		else if(e.getKeyCode()==KeyEvent.VK_UP){
			y--;
		}
		else if(e.getKeyCode()==KeyEvent.VK_LEFT){
			x--;
		}
		else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			x++;
		}
		this.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}