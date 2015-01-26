package java_12;
public class ProducerCosumer {
	public static void main(String[] args){
	SyncStack ss=new SyncStack();//造一个框
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
	WoTou[] arrWT=new WoTou[60];
	
	public synchronized void push(WoTou wt) {
		while(index==arrWT.length){
			try{
				this.wait(); //当前对象的线程wait
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		this.notify();
		arrWT[index]=wt;
		index ++;
	}
	public synchronized WoTou pop() {
		while(index==0){
			try{
			this.wait();//wait的时候锁不在归我所有
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
		return arrWT[index];
	}
}
class Producer implements Runnable{
	SyncStack ss=null; //窝头框
	Producer (SyncStack ss){ //构造方法
		this.ss=ss;
	}
	public void run(){
		for(int i=1;i<21;i++){
			WoTou wt=new WoTou(i); //生产20个馒头
			ss.push(wt);
			System.out.println("生产了："+ wt);
			/*try{
				Thread.sleep((int)Math.random()*1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}*/
		}
		
	}
}
class Consumer implements Runnable{
		SyncStack ss=null; //窝头框
		Consumer (SyncStack ss){ //构造方法
			this.ss=ss;
		}
		public void run(){
			for(int i=0;i<20;i++){
				WoTou wt=ss.pop(); //生产20个馒头
				System.out.println("消费了:" + wt);
				/*try{
					Thread.sleep((int)Math.random()*1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}*/
			}
			
		}
}