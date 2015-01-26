package Interface;
interface TakeCare{
	public void feed();
	public void playwith();
}
class Worker implements TakeCare{
	private String name;
	Worker(String name){
		this.name=name;
	}
	public void  work(){
		System.out.println("I'm a worker");
	}
	public void feed(){
		System.out.println("worker is feeding the pet");
		
	}
	public void playwith(){
		System.out.println("worker is palying with the pet");
	}
	
}
class Famer implements TakeCare{
	private String name;
	Famer(String name){
		this.name=name;
	}
	public void fame(){
		System.out.println("I'm a famer");
	}
	public void feed(){
		System.out.println("famer is feeding the pet");
	}
	public void playwith(){
		System.out.println("famer is playing with the pet");
	}
}
public class Test1 {
	public static void main(String args[]){
		TakeCare w=new Worker("A");
		TakeCare f=new Famer("B");
		Worker r=(Worker)w; 
		w.feed();
		w.playwith();
		r.work();
		f.feed();
		f.playwith();
		//f.fame();
	}

}
