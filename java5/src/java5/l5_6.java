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
		
		an1=new JButton("����");
		an2=new JButton("���");
		an3=new JButton("�̲�");
		an4=new JButton("ơ��");
		an5=new JButton("��Ȫˮ");
		
		//������ʱ�Ƚ�panel�ϵ���������ϣ������JFrame�ϵ����
		mb1.add(an1);	mb1.add(an2);
		mb2.add(an3);	mb2.add(an4);
		
		this.add(mb1,BorderLayout.SOUTH);
		this.add(mb2,BorderLayout.NORTH);
		this.add(an5);
		
		this.setTitle("�����ۺ�Ӧ��");
		this.setSize(380,220);
		this.setLocation(200,200);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
