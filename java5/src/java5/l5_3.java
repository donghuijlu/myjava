package java5;
import java.awt.*;
import javax.swing.*;

public class l5_3 extends JFrame {
	JButton an1,an2,an3,an4,an5;
	public static void main(String[] args){
		l5_3 lx=new l5_3();
	}
	public l5_3(){
		an1=new JButton("东方");
		an2=new JButton("西方");
		an3=new JButton("南方");
		an4=new JButton("北方");
		an5=new JButton("中部");
		
		this.add(an1,BorderLayout.EAST);   //括号中的参数都是固定的
		this.add(an2,BorderLayout.WEST); //前面是对象，后面是布局管理器
		this.add(an3,BorderLayout.SOUTH);
		this.add(an4,BorderLayout.NORTH);
		this.add(an5,BorderLayout.CENTER);
		//如果不是五个按钮全部添加，则会以扩充中部为主进行填充，但中部不会
		this.setTitle("边界布局BorderLayout");
		this.setSize(380,320);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
/*总结 1.继承JFrame类
 * 2.在最上方定义组件
 * 3.在构造方法中创建组件
 * 4.在构造方法中添加组件
 */
