package java5;
import java.awt.*;
import javax.swing.*;
public class l5_2 extends JFrame{
	JButton an1=null;//����Ҫ�����ȫ������������
	public static void main(String[] args){
		l5_2 lxl=new l5_2();  //������ֱ�ӵ��ü���
	}
	public l5_2(){
		this.setTitle("�û�����");
		this.setSize(350,180);
		this.setLocation(100,260);;
		an1=new JButton("һ����ť");
		this.add(an1);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
