package java5;
import java.awt.*;
import javax.swing.*;
public class l5_12 extends JFrame{
	
	JLabel bq1;  //北部
	JButton an1,an2,an3;	JPanel mb1; //南部
	JTabbedPane xxk;         //中部，选项卡
	JPanel mb2,mb3,mb4;
	JLabel bq2,bq3,bq4,bq5;
	JTextField wbk;   //文本框
	JPasswordField mmk;  //密码框
	JButton an4;
	JCheckBox fxk1,fxk2;  //复选框
	
	public static void main(String[] args){
		l5_12 lx=new l5_12();
	}
	public l5_12(){
		bq2=new JLabel("qq号码",JLabel.CENTER);
		bq3=new JLabel("qq密码",JLabel.CENTER);
		bq4=new JLabel("忘记密码",JLabel.CENTER);
		bq4.setFont(new Font("宋体",Font.PLAIN,15));//设置字体
		bq4.setForeground(Color.BLUE); //设置颜色
		bq5=new JLabel("<html><a href='www.qq.com'>申请密码保护</a>");
		//bq5。setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//鼠标放入显示手形状
		
		wbk=new JTextField();
		mmk=new JPasswordField();
		an4=new JButton("注册");
		an4.setPreferredSize(new Dimension(80,50));
		fxk1=new JCheckBox("隐身登陆");
		fxk2=new JCheckBox("记住密码");
		
		bq1=new JLabel(new ImageIcon("image/qqq.jpg"));
		mb1=new JPanel();
		an1=new JButton("登陆");
		an2=new JButton("取消");
		an3=new JButton(new ImageIcon("image/an4.jpg"));
		an1.setPreferredSize(new Dimension(80,35));
		an2.setPreferredSize(new Dimension(80,35));
		an3.setPreferredSize(new Dimension(80,35));
		xxk=new JTabbedPane();      //选项卡
		mb2=new JPanel();	mb3=new JPanel();
		mb3.setBackground(Color.GREEN);
		bq1.setPreferredSize(new Dimension(80,60));
		xxk.add("普通用户",mb2);	xxk.add("QQ会员",mb3);	xxk.add("管理员",mb4);
		
		mb2.setLayout(new GridLayout(3,3));
		
		mb1.add(an1);	mb1.add(an2);	mb1.add(an3);
		mb2.add(bq2);	mb2.add(wbk);	mb2.add(an4);	mb2.add(bq3);	mb2.add(mmk);
		mb2.add(bq4);	mb2.add(fxk1);	mb2.add(fxk2);	mb2.add(bq5);
		
		this.add(mb1,BorderLayout.SOUTH);
		this.add(bq1,BorderLayout.NORTH);
		this.add(xxk,BorderLayout.CENTER);
		
		ImageIcon tp1=new ImageIcon("image/qq.jpg");
		this.setIconImage(tp1.getImage());
		this.setTitle("用户登录");
		this.setSize(340,270);
		this.setLocation(300,280);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		

	}

}
