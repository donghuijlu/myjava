package java5;
import java.awt.*;
import javax.swing.*;

public class l5_3 extends JFrame {
	JButton an1,an2,an3,an4,an5;
	public static void main(String[] args){
		l5_3 lx=new l5_3();
	}
	public l5_3(){
		an1=new JButton("����");
		an2=new JButton("����");
		an3=new JButton("�Ϸ�");
		an4=new JButton("����");
		an5=new JButton("�в�");
		
		this.add(an1,BorderLayout.EAST);   //�����еĲ������ǹ̶���
		this.add(an2,BorderLayout.WEST); //ǰ���Ƕ��󣬺����ǲ��ֹ�����
		this.add(an3,BorderLayout.SOUTH);
		this.add(an4,BorderLayout.NORTH);
		this.add(an5,BorderLayout.CENTER);
		//������������ťȫ����ӣ�����������в�Ϊ��������䣬���в�����
		this.setTitle("�߽粼��BorderLayout");
		this.setSize(380,320);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
/*�ܽ� 1.�̳�JFrame��
 * 2.�����Ϸ��������
 * 3.�ڹ��췽���д������
 * 4.�ڹ��췽����������
 */
