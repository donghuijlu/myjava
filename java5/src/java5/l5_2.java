package java5;
import java.awt.*;
import javax.swing.*;
public class l5_2 extends JFrame{
	JButton an1=null;//把需要的组件全部定义在这里
	public static void main(String[] args){
		l5_2 lxl=new l5_2();  //主函数直接调用即可
	}
	public l5_2(){
		this.setTitle("用户界面");
		this.setSize(350,180);
		this.setLocation(100,260);;
		an1=new JButton("一个按钮");
		this.add(an1);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
