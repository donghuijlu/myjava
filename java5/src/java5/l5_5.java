package java5;
import java.awt.*;

import javax.swing.*;
public class l5_5  extends JFrame{
	JButton an[]={null,null,null,null,null,null,null,null,null};
	int s=9;
	
	public static void main(String[] args){
		l5_5 lx=new l5_5();
	}
	
	public l5_5(){
		an[0]=new JButton("��Ƭ");
		an[1]=new JButton("����");
		an[2]=new JButton("�ɿ���");
		an[3]=new JButton("ѩ��");
		an[4]=new JButton("����");
		an[5]=new JButton("����");
		an[6]=new JButton("����");
		an[7]=new JButton("����");
		an[8]=new JButton("����");
		
		this.setLayout(new GridLayout(3,3,12,13));
		
		for(int i=0;i<s;i++){
			this.add(an[i]);
		}
		
		this.setTitle("���񲼾�GridLayout");
		this.setSize(380,320);
		this.setLocation(200,200);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
