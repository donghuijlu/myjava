package Thread;
public class ProducerConsumer {
	public static void main(String[] args){
		SyncStack ss=new SyncStack();
		Producer p=new Producer(ss);
		Consumer c=new Consumer(ss);
		
		new Thread(p).start();
		new Thread(c).start();
	}

}
class WoTou{
	int id;
	WoTou(int id){
		this.id=id;
	}
	public String toString(){
		return "WoTou:"+id;
	}
}
class SyncStack{
	int index=0;
	WoTou[] arrWT=new WoTou[6];
	
	public synchronized void push(WoTou wt) throws InterruptedException{
		if(index==arrWT.length){
			this.wait();
		}
		this.notifyAll();
		arrWT[index]=wt;
		index++;
	}
	public synchronized WoTou pop() throws InterruptedException{
		if(index==0){
			try{
				this.wait(); //wait 的时候锁不归我所有
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notifyAll(); //叫醒一个wait的线程
		index--;
		return arrWT[index];
	}
}

class Producer implements Runnable{
	SyncStack ss=null;
	Producer(SyncStack ss){
		this.ss=ss;
	}
	public void run(){
		for(int i=0;i<20;i++){
			WoTou wt=new WoTou(i);
				try {
					ss.push(wt);
					System.out.println("生产了："+wt);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try{
					Thread.sleep((int)(Math.random()*2000));
				
				}catch(InterruptedException e){
					e.printStackTrace();
				}
		}
	}
}
class Consumer implements Runnable{
	SyncStack ss=null;
	Consumer(SyncStack ss){
		
		this.ss=ss;
	}
	public void run(){
		for(int i=0;i<20;i++){
			WoTou wt = null;
			try {
				wt = ss.pop();
				System.out.println("消费了"+wt);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try{
				Thread.sleep((int)(Math.random()*200));
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}