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
		
		bq1=new JLabel("����");
		bq2=new JLabel("ѧ��");
		
		String[] jg={"����","���","�Ϻ�","����"};
		xlk=new JComboBox(jg);      //������
		
		String[] xl={"����","��ר","����","˶ʿ","��ʿ"};
		lb=new JList(xl);       //�б�
		lb.setVisibleRowCount(1);   //��ǰ�ɼ�����
		gd=new JScrollPane(lb);      //������
		
		this.setLayout(new GridLayout(2,1));
		
		mb1.add(bq1);	mb1.add(xlk);
		mb2.add(bq2);	mb2.add(gd);
		
		this.add(mb1);	this.add(mb2);
		
		this.setTitle("�û�����");
		this.setSize(200,190);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}