package TestPloy;
abstract class Animal{
	private String name;
	Animal(String name){
		this.name=name;
	}
	public void enjoy(){
		System.out.println("出蕗。。。");
	}
}
 class Cat extends Animal {
	private String eyesColor;
	Cat(String n,String c){
		super(n);
		eyesColor=c;
	}
	public void enjoy(){
		System.out.println("竪出蕗。。。");
	}
}
class Dog extends Animal {
	private String furColor;
	Dog(String n,String c){
		super(n);
		furColor=c;
	}
	public void enjoy(){
		System.out.println("昂出蕗。。。");
	}
}
class Bird extends Animal{
	Bird(){
		super("bird");
	}
	public void enjoy(){
		System.out.println("抵出蕗。。。");
	}
}
class Lady{
	private String name;
	private Animal pet;
	Lady(String name,Animal pet){
		this.name=name;
		this.pet=pet;
	}
	public void myPetEnjoy(){
		pet.enjoy();
	}
}
public class Test {
	public static void main(String args[]){
		Cat c=new Cat("catname","blue");
		Dog d=new Dog("dogname","black");
		Bird b=new Bird();
		
		Lady l1=new Lady("11",c);
		Lady l2=new Lady("12",d);
		Lady l3=new Lady("13",b);
		l1.myPetEnjoy();
		l2.myPetEnjoy();
		l3.myPetEnjoy();
		
	}

}
