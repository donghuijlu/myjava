package java6;

public class l6_12 {
	public static void main(String[] args){
		Ck ck=new Ck();
		Sc sc=new Sc(ck);
		Xf xf=new Xf(ck);
		Thread xc1=new Thread(sc);
		xc1.start();
		
		Thread xc2=new Thread(xf);
		xc2.start();
	}

}
class Ck{
	private char[] rl=new char[8];
	private int wt=0;
	
	public synchronized void shengchan(char aa){
		while(wt==rl.length){
			try{
				this.wait();
			}catch(Exception e){}
		}
		this.notify();
		rl[wt]=aa;
		wt++;
		System.out.println("在生产第"+wt+"个产品"+aa);
		
	}
	public synchronized void xiaofei(){
		char aa;
		while(wt==0){
			try{
				this.wait();
			}catch(Exception e){}
		}
		this.notify();
		aa=rl[wt-1];
		System.out.println("消费第"+wt+"个产品"+aa);
		--wt;
	}
}

class Sc implements Runnable{
	private Ck xc=null;
	public Sc(Ck xc){
		this.xc=xc;
	}
	public void run(){
		char aa;
		for(int i=0;i<26;i++){
			aa=(char)('A'+i);
			xc.shengchan(aa);
		}
	}
}
class Xf implements Runnable{
	private Ck xc=null;
	public Xf(Ck xc){
		this.xc=xc;
	}
	public void run(){

		for(int i=0;i<26;i++){
			
			xc.xiaofei();
		}
	}
}