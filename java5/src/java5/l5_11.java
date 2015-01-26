package java5;
import java.awt.*;
import javax.swing.*;

public class l5_11 extends JFrame{
	JTextArea wby;
	JPanel mb;
	JComboBox xlk;
	JButton an;
	JTextField wbk;
	JScrollPane gd;
	
	public static void main(String[] args){
		l5_11 lx=new l5_11();
	}
	
	l5_11(){
		wby=new JTextArea();
		mb=new JPanel();
		String[] lt={"悟空","八戒","沙僧","小白龙"};
		xlk=new JComboBox(lt); //下拉框
		wbk=new JTextField(10); //文本框
		an=new JButton("发送");  //按钮
		gd=new JScrollPane(wby); //滚动条
		
		mb.add(xlk);	mb.add(wbk);	mb.add(an);
		this.add(gd);	this.add(mb,BorderLayout.SOUTH);
		
		this.setTitle("聊天窗口");
		this.setSize(300,200);
		this.setIconImage(new ImageIcon("image/Koala.jpg").getImage());
		this.setLocation(300,280);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}