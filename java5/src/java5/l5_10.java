package java5;
import java.awt.*;
import javax.swing.*;
public class l5_10 extends JFrame {
	JSplitPane cf;
    JList lb;
    JLabel bq;
    
	public static void main(String[] args) 
    {
		l5_10 lx=new l5_10();
	}
	
	l5_10()
	{
		String[] jsj={"�������","��Ϸ����","ƽ�����","��������","�������"};
		lb=new JList(jsj);
		
		bq=new JLabel(new ImageIcon("image/Koala.jpg"));
		
		cf=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,lb,bq);
		
		cf.setOneTouchExpandable(true);//�����۵����ر�ǩ
		
		this.add(cf);
		
		this.setTitle("�����ѧ�Ʒ���");
		this.setSize(640,480);
		this.setLocation(300,200);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
