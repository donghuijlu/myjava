package java5;
import java.awt.*;
import javax.swing.*;
public class l5_1 {
	public static void main(String[] args){
		JFrame aa=new JFrame();
		aa.setTitle("用户界面");
		JButton an1=new JButton("一个按钮");
		aa.setSize(350,180);//括号是像素
		aa.setLocation(100,260);
		aa.add(an1);
		aa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aa.setVisible(true);
	}

}
