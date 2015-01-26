package java5;
import java.awt.*;
import javax.swing.*;
public class l5_9 extends JFrame{
	JPanel mb1,mb2;
	JLabel bq1,bq2;
	JComboBox xlk;
	JList lb;
	JScrollPane gd;
	
	public static void main(String[] args){
		l5_9 lx=new l5_9();
	}
	
	public l5_9(){
		mb1=new JPanel();
		mb2=new JPanel();
		
		bq1=new JLabel("籍贯");
		bq2=new JLabel("学历");
		
		String[] jg={"北京","天津","上海","重庆"};
		xlk=new JComboBox(jg);      //下拉框
		
		String[] xl={"高中","大专","本科","硕士","博士"};
		lb=new JList(xl);       //列表
		lb.setVisibleRowCount(1);   //当前可见个数
		gd=new JScrollPane(lb);      //滚动条
		
		this.setLayout(new GridLayout(2,1));
		
		mb1.add(bq1);	mb1.add(xlk);
		mb2.add(bq2);	mb2.add(gd);
		
		this.add(mb1);	this.add(mb2);
		
		this.setTitle("用户调查");
		this.setSize(200,190);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
