package java5;
import java.awt.*;
import javax.swing.*;
public class l5_1 {
	public static void main(String[] args){
		JFrame aa=new JFrame();
		aa.setTitle("�û�����");
		JButton an1=new JButton("һ����ť");
		aa.setSize(350,180);//����������
		aa.setLocation(100,260);
		aa.add(an1);
		aa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aa.setVisible(true);
	}

}