package java5;
import java.awt.*;
import javax.swing.*;
public class l5_12 extends JFrame{
	
	JLabel bq1;  //����
	JButton an1,an2,an3;	JPanel mb1; //�ϲ�
	JTabbedPane xxk;         //�в���ѡ�
	JPanel mb2,mb3,mb4;
	JLabel bq2,bq3,bq4,bq5;
	JTextField wbk;   //�ı���
	JPasswordField mmk;  //�����
	JButton an4;
	JCheckBox fxk1,fxk2;  //��ѡ��
	
	public static void main(String[] args){
		l5_12 lx=new l5_12();
	}
	public l5_12(){
		bq2=new JLabel("qq����",JLabel.CENTER);
		bq3=new JLabel("qq����",JLabel.CENTER);
		bq4=new JLabel("��������",JLabel.CENTER);
		bq4.setFont(new Font("����",Font.PLAIN,15));//��������
		bq4.setForeground(Color.BLUE); //������ɫ
		bq5=new JLabel("<html><a href='www.qq.com'>�������뱣��</a>");
		//bq5��setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//��������ʾ����״
		
		wbk=new JTextField();
		mmk=new JPasswordField();
		an4=new JButton("ע��");
		an4.setPreferredSize(new Dimension(80,50));
		fxk1=new JCheckBox("�����½");
		fxk2=new JCheckBox("��ס����");
		
		bq1=new JLabel(new ImageIcon("image/qqq.jpg"));
		mb1=new JPanel();
		an1=new JButton("��½");
		an2=new JButton("ȡ��");
		an3=new JButton(new ImageIcon("image/an4.jpg"));
		an1.setPreferredSize(new Dimension(80,35));
		an2.setPreferredSize(new Dimension(80,35));
		an3.setPreferredSize(new Dimension(80,35));
		xxk=new JTabbedPane();      //ѡ�
		mb2=new JPanel();	mb3=new JPanel();
		mb3.setBackground(Color.GREEN);
		bq1.setPreferredSize(new Dimension(80,60));
		xxk.add("��ͨ�û�",mb2);	xxk.add("QQ��Ա",mb3);	xxk.add("����Ա",mb4);
		
		mb2.setLayout(new GridLayout(3,3));
		
		mb1.add(an1);	mb1.add(an2);	mb1.add(an3);
		mb2.add(bq2);	mb2.add(wbk);	mb2.add(an4);	mb2.add(bq3);	mb2.add(mmk);
		mb2.add(bq4);	mb2.add(fxk1);	mb2.add(fxk2);	mb2.add(bq5);
		
		this.add(mb1,BorderLayout.SOUTH);
		this.add(bq1,BorderLayout.NORTH);
		this.add(xxk,BorderLayout.CENTER);
		
		ImageIcon tp1=new ImageIcon("image/qq.jpg");
		this.setIconImage(tp1.getImage());
		this.setTitle("�û���¼");
		this.setSize(340,270);
		this.setLocation(300,280);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		

	}

}
