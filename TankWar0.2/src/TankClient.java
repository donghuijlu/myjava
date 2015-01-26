import java.awt.*;
import java.awt.event.*;

public class TankClient extends Frame{
	public void launchFrame(){
		this.setLocation(400,300);
		this.setSize(800,600);
		this.setTitle("TankWar");
		this.addWindowListener(new WindowAdapter(){//ƒ‰√˚¿‡ 

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
		});
		setVisible(true);
		this.setResizable(false);
	}
	public static void main(String[] args){
		TankClient tc=new TankClient();
		tc.launchFrame();
	}

}
