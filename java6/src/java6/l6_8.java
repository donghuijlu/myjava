package java6;

class Xc8 implements Runnable{
	public static int chepiao=100;
	String aa=new String("1");
	
	//synchronized 的作用是，让它所管辖的代码部分，要么全部执行，要么全部不执行
	
	public void run(){ //synchronized修饰函数不需要字符串，相当于默认是this，因为是死循环不能放在这个位置
		while(true){
			synchronized(aa){//即可以修饰代码块，又可以修饰函数
				if(chepiao>0){
					System.out.println("第"+Thread.currentThread().getName()+"个车站正在卖第"+(101-chepiao)+"张车票");
					--chepiao;
				}else{
					break;
				}
			}
		}
	}
}
public class l6_8 {
	public static void main(String[] args){
		Xc8 xc81=new Xc8();
		Thread ee=new Thread(xc81);
		ee.start();
		
		Xc8 xc82=new Xc8();
		Thread ff=new Thread(xc82);
		ff.start();
	}

}
