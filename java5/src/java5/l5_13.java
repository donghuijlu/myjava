package java5;
import java.awt.*;
import javax.swing.*;
import java.awt.Event.*; //�˵���
public class l5_13 extends JFrame{
	JMenuBar cd; //�˵����
	JMenu cd1,cd2,cd3,cd4,cd5; //�˵�
	JMenuItem cdx2,cdx3,cdx4,cdx5,cdx6,cdx7;//�ռ��˵���
	JMenuItem cdx8,cdx9,cdx10,cdx11,cdx12,cdx13,cdx14,cdx15,cdx16,cdx17,cdx18,cdx19;
	JMenu ej;	JMenuItem ej1,ej2;
	
	JToolBar gjt; //������
	JButton an1,an2,an3,an4,an5,an6;
	
	JTextArea wby;
	JScrollPane gdt;
	
	public static void main(String[] args){
		l5_13 lx=new l5_13();
	}
	
	l5_13(){
		gjt=new JToolBar();
		an1=new JButton(new ImageIcon("image/xj.jpg"));
		an1.setToolTipText("�½�"); //ͣ��ʱ��ʾ����Ϣ
		an2=new JButton(new ImageIcon("image/dk.jpg"));
		an2.setToolTipText("��");
		an3=new JButton(new ImageIcon("image/bc.jpg"));
		an3.setToolTipText("����");
		an4=new JButton(new ImageIcon("image/jq.jpg"));
		an4.setToolTipText("����");
		an5=new JButton(new ImageIcon("image/fz.jpg"));
		an5.setToolTipText("����");
		an6=new JButton(new ImageIcon("image/zt.jpg"));
		an6.setToolTipText("ճ��");
		
		cd=new JMenuBar();  
		cd1=new JMenu("�ļ�(F)");
		cd1.setMnemonic('F'); //�����ַ�����
		cd2=new JMenu("�༭(E)");
		cd2.setMnemonic('E');
		cd3=new JMenu("��ʽ(O)");
		cd3.setMnemonic('O');
		cd4=new JMenu("�鿴(V)");
		cd4.setMnemonic('V');
		cd5=new JMenu("����(H)");
		cd5.setMnemonic('H');
		
		ej=new JMenu("�½�(N)");
		ej1=new JMenuItem("�ļ�",new ImageIcon("image/xj.jpg"));
		ej2=new JMenuItem("ģ��");
		
		cdx2=new JMenuItem("��(O)",new ImageIcon("image/dk.jpg"));
		cdx3=new JMenuItem("����(s)",new ImageIcon("image/bc.jpg"));	
		cdx3.setMnemonic('S');
		cdx4=new JMenuItem("���Ϊ(A)");
		cdx5=new JMenuItem("ҳ������(U)...");
		cdx6=new JMenuItem("��ӡ(P)...");
		cdx7=new JMenuItem("�˳�(X)");
		
		cdx8=new JMenuItem("����(U)");
		cdx9=new JMenuItem("����(T)");
		cdx10=new JMenuItem("����(C)");
		cdx11=new JMenuItem("ճ��(P)");
		cdx12=new JMenuItem("ɾ��(L)");
		cdx13=new JMenuItem("����(F)...");
		cdx14=new JMenuItem("������һ��(N)");
		cdx15=new JMenuItem("�滻(R)");
		cdx16=new JMenuItem("ת��(G)");
		cdx17=new JMenuItem("ȫѡ(U)");
		cdx18=new JMenuItem("����(A)");
		cdx19=new JMenuItem("ʱ��/����(D)");
		
		wby=new JTextArea();
		gdt=new JScrollPane(wby);
		
		gjt.add(an1); gjt.add(an2); gjt.add(an3); 
		gjt.add(an4); gjt.add(an5); gjt.add(an6);
		
		ej.add(ej1);  ej.add(ej2);
		
		cd1.add(ej);  cd1.add(cdx2);  cd1.add(cdx3);  cd1.add(cdx4);
		cd1.addSeparator(); //�Ӻ���
		cd1.add(cdx5);  cd1.add(cdx6);
		cd1.addSeparator();
		cd1.add(cdx7);
		
		cd2.add(cdx8);	cd2.addSeparator();	cd2.add(cdx9);	cd2.add(cdx10);	cd2.add(cdx11);
		cd2.add(cdx12);	cd2.addSeparator(); cd2.add(cdx13);	cd2.add(cdx14);	cd2.add(cdx15);
		cd2.add(cdx16);	cd2.addSeparator(); cd2.add(cdx17);	cd2.add(cdx18);	cd2.add(cdx19);
		
		cd.add(cd1);  cd.add(cd2);  cd.add(cd3);
		cd.add(cd4);  cd.add(cd5);
		
		this.setJMenuBar(cd);		
		this.add(gjt,BorderLayout.NORTH);		
		this.add(gdt);
		
		ImageIcon tp1=new ImageIcon("image/jsb.jpg");
		this.setIconImage(tp1.getImage());
		this.setTitle("���±�");
		this.setSize(570,370);
		this.setLocation(300,280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);		
	}

}
