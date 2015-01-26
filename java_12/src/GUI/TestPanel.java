package GUI;
import java.awt.*;
import javax.swing.*;
public class TestPanel {
		public static void main(String[] args){
			MyNewFrame f=new MyNewFrame("Mypanel",100,100,600,400,Color.BLUE);
		}

	}
	class MyNewFrame extends Frame{
		MyNewFrame(String s,int x,int y,int w,int h,Color color) {
			super(s);
			Panel pan=new Panel();
			pan.setBounds(50,50,300,200);
			pan.setBackground(Color.YELLOW);
			add(pan);
			setBackground(color);
			this.setResizable(false);
			setLayout(null);
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
		}
		
}
