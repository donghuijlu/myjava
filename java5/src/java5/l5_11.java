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
		String[] lt={"���","�˽�","ɳɮ","С����"};
		xlk=new JComboBox(lt); //������
		wbk=new JTextField(10); //�ı���
		an=new JButton("����");  //��ť
		gd=new JScrollPane(wby); //������
		
		mb.add(xlk);	mb.add(wbk);	mb.add(an);
		this.add(gd);	this.add(mb,BorderLayout.SOUTH);
		
		this.setTitle("���촰��");
		this.setSize(300,200);
		this.setIconImage(new ImageIcon("image/Koala.jpg").getImage());
		this.setLocation(300,280);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}