package java5;
import java.awt.*;
import javax.swing.*;
public class l5_6 extends JFrame {
	JPanel mb1,mb2;
	JButton an1,an2,an3,an4,an5;
	
	public static void main(String[] args){
		l5_6 lx=new l5_6();
	}
	l5_6(){
		mb1=new JPanel();
		mb2=new JPanel();
		
		an1=new JButton("可乐");
		an2=new JButton("红茶");
		an3=new JButton("绿茶");
		an4=new JButton("啤酒");
		an5=new JButton("矿泉水");
		
		//添加组件时先将panel上的组件添加完毕，再添加JFrame上的组件
		mb1.add(an1);	mb1.add(an2);
		mb2.add(an3);	mb2.add(an4);
		
		this.add(mb1,BorderLayout.SOUTH);
		this.add(mb2,BorderLayout.NORTH);
		this.add(an5);
		
		this.setTitle("布局综合应用");
		this.setSize(380,220);
		this.setLocation(200,200);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
