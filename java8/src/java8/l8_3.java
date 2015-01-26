package java8;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class l8_3 extends JFrame implements ActionListener{
	Wdmb3 mb=null; JButton an1,an2;
	public static void main(String[] args){
		l8_3 lx=new l8_3();
	}
	public l8_3(){
		mb=new Wdmb3();
		an1=new JButton("红色");
		an2=new JButton("蓝色");
		Jtz jt1=new Jtz();
		
		this.add(an1,BorderLayout.NORTH);
		this.add(an2,BorderLayout.SOUTH);
		mb.setBackground(Color.yellow);
		this.add(mb);
		an1.addActionListener(this);
		an1.addActionListener(jt1);
		an1.setActionCommand("111");
		an2.addActionListener(this);
		an2.addActionListener(jt1);
		an2.setActionCommand("222");
		
		this.setSize(300,260);
		this.setLocation(300,280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("111")){
			mb.setBackground(Color.red);
		}else if(e.getActionCommand().equals("222")){
			mb.setBackground(Color.blue);
		}
	}
}
class Wdmb3 extends JPanel{
	public void paint(Graphics g){
		super.paint(g);
	}
}
class Jtz implements ActionListener{

	public void actionPerformed(ActionEvent aa){
		if(aa.getActionCommand().equals("111")){
			System.out.println("监听者在监听，按下红色");
		}else if(aa.getActionCommand().equals("222")){
			System.out.println("按下蓝色");
		}
	}
	
}