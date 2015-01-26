package Thread;
import java.util.concurrent.*;
public class AccountWithoutSync {
	private static Account account=new Account();
	public static void main(String[] args){
		ExecutorService executor=Executors.newCachedThreadPool();
		class AddAPennyTask implements Runnable{
			public void run(){
				account.deposit(1);
			}
		}
		private static class Account{
			private int balance=0;
			public int getBlance(){
				return balance;
			}
			public void deposit(int amount){
				int newBalance=balance+amount;
				//this delay is deliberately added to magnify the data-corruption problem and make it easy to see
				try{
					Thread.sleep(5);
				}catch(InterruptedException ex){
					
				}
				balance=newBalance;
			}
		}
		//create and launch 100 threads
		for(int i=0;i<100;i++){
			excutor.excute(new AddAPennyTask());
		}
		
	}

}
