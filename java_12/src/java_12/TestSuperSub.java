package java_12;

class SuperClass{
	private int n;
	/*SuperClass(){
		System.out.println("SuperClass()");
	}
	*/
	SuperClass(int n){
		System.out.println("SuperClass("+n+")");
		this.n=n;
	}
}
class SubClass extends SuperClass{
	private int n;
	
	SubClass(int n){
		super(100);
		System.out.println("SubClass("+n+")");
		this.n=n;
	}
	SubClass(){
		super(300);
		System.out.println("SubClass()");
	}
}
public class TestSuperSub {
	public static void main(String args[]){
		SubClass sc2=new SubClass();
	}

}
