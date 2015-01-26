package java5;
import java.awt.*;
import javax.swing.*;
import java.awt.Event.*; //菜单项
public class l5_13 extends JFrame{
	JMenuBar cd; //菜单面板
	JMenu cd1,cd2,cd3,cd4,cd5; //菜单
	JMenuItem cdx2,cdx3,cdx4,cdx5,cdx6,cdx7;//终极菜单项
	JMenuItem cdx8,cdx9,cdx10,cdx11,cdx12,cdx13,cdx14,cdx15,cdx16,cdx17,cdx18,cdx19;
	JMenu ej;	JMenuItem ej1,ej2;
	
	JToolBar gjt; //工具条
	JButton an1,an2,an3,an4,an5,an6;
	
	JTextArea wby;
	JScrollPane gdt;
	
	public static void main(String[] args){
		l5_13 lx=new l5_13();
	}
	
	l5_13(){
		gjt=new JToolBar();
		an1=new JButton(new ImageIcon("image/xj.jpg"));
		an1.setToolTipText("新建"); //停留时显示的信息
		an2=new JButton(new ImageIcon("image/dk.jpg"));
		an2.setToolTipText("打开");
		an3=new JButton(new ImageIcon("image/bc.jpg"));
		an3.setToolTipText("保存");
		an4=new JButton(new ImageIcon("image/jq.jpg"));
		an4.setToolTipText("剪切");
		an5=new JButton(new ImageIcon("image/fz.jpg"));
		an5.setToolTipText("复制");
		an6=new JButton(new ImageIcon("image/zt.jpg"));
		an6.setToolTipText("粘贴");
		
		cd=new JMenuBar();  
		cd1=new JMenu("文件(F)");
		cd1.setMnemonic('F'); //接受字符类型
		cd2=new JMenu("编辑(E)");
		cd2.setMnemonic('E');
		cd3=new JMenu("格式(O)");
		cd3.setMnemonic('O');
		cd4=new JMenu("查看(V)");
		cd4.setMnemonic('V');
		cd5=new JMenu("帮助(H)");
		cd5.setMnemonic('H');
		
		ej=new JMenu("新建(N)");
		ej1=new JMenuItem("文件",new ImageIcon("image/xj.jpg"));
		ej2=new JMenuItem("模板");
		
		cdx2=new JMenuItem("打开(O)",new ImageIcon("image/dk.jpg"));
		cdx3=new JMenuItem("保存(s)",new ImageIcon("image/bc.jpg"));	
		cdx3.setMnemonic('S');
		cdx4=new JMenuItem("另存为(A)");
		cdx5=new JMenuItem("页面设置(U)...");
		cdx6=new JMenuItem("打印(P)...");
		cdx7=new JMenuItem("退出(X)");
		
		cdx8=new JMenuItem("撤销(U)");
		cdx9=new JMenuItem("剪切(T)");
		cdx10=new JMenuItem("复制(C)");
		cdx11=new JMenuItem("粘贴(P)");
		cdx12=new JMenuItem("删除(L)");
		cdx13=new JMenuItem("查找(F)...");
		cdx14=new JMenuItem("查找下一个(N)");
		cdx15=new JMenuItem("替换(R)");
		cdx16=new JMenuItem("转到(G)");
		cdx17=new JMenuItem("全选(U)");
		cdx18=new JMenuItem("撤销(A)");
		cdx19=new JMenuItem("时间/日期(D)");
		
		wby=new JTextArea();
		gdt=new JScrollPane(wby);
		
		gjt.add(an1); gjt.add(an2); gjt.add(an3); 
		gjt.add(an4); gjt.add(an5); gjt.add(an6);
		
		ej.add(ej1);  ej.add(ej2);
		
		cd1.add(ej);  cd1.add(cdx2);  cd1.add(cdx3);  cd1.add(cdx4);
		cd1.addSeparator(); //加横线
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
		this.setTitle("记事本");
		this.setSize(570,370);
		this.setLocation(300,280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);		
	}

}
