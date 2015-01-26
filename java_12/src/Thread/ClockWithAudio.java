package Thread;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ClockWithAudio extends JApplet{
	protected AudioClip[] hourAudio=new AudioClip[12];
	protected AudioClip[] minuteAudio=new AudioClip[60];
	//create audio clips for pronouncing am and pm
	protected AudioClip amAudio=
			Applet.newAudioClip(this.getClass().getResource("audio/am.au"));
	protected AudioClip pmAudio=
			Applet.newAudioClip(this.getClass().getResource("audio/pm.au"));
	//create a clock
	private StillClock clock=new StillClock();
	 //create a timer
	private Timer timer=new Timer(1000,new TimerListener());
	
	//create a label to display time   
	private JLabel jlblDigitTime=new JLabel(" ",JLabel.CENTER);
	
	/**Initialize the applet*/
	public void init(){
		//create audio clips for pronouncing hours
		for(int i=0;i<12;i++){
			hourAudio[i]=Applet.newAudioClip(this.getClass().getResource("audio/hour" +i+ ".au"));
				
			}
		//create audio clips for pronouncing minutes
			
		for(int i=0;i<60;i++){
			minuteAudio[i]=Applet.newAudioClip(
					this.getClass().getResource("audio/minute"+ i+".au"));
		}
		//add clock and time label to the content pane of the aplet
		add(clock.BorderLayout.CENTER);
		add(jlblDigitTime,BorderLayout.SOUTH);
	}
	/**override the applet's start method*/
	public void start(){
		timer.start(); //resume clock
	}
	/**override the applet's stop method*/
	public void stop(){
		timer.stop();
	}
	private class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			clock.setCurrentTime();
			clock.repaint();
			jlblDigitTime.setText(clock.getHour()+":"+clock.getMinute()+":"+clock.getSecond());
			if(clock.getSecond()==0){
				announceTime(clock.getHour(),clock.getMinute());
			}
		}	
	}
	/*announce the current time at every minute*/
	public void announceTime(int hour,int minute){
		//announce hour
		hourAudio[hour%12].play();
		try{
			//time delay to allow hourAudio play to finish
			Thread.sleep(1500);
			//announce minute
			minuteAudio[minute].play();
			
			Thread.sleep(1500);
		}catch(InterruptedException ex){
			
		}
		//announce am or pm
		if(hour<12){
			amAudio.play();
		}else{
			pmAudio.play();
		}
			
		
	}

}
