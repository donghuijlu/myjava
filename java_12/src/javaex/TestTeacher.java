package javaex;

class Person{
	private String name;
	private String location;
	
	Person(String name){
		this.name=name;
		location="beijing";
		System.out.println("1");
	}
	Person(String name,String location){
		this.name=name;
		this.location=location;
		System.out.println("2");
	}
	public String info(){
		return "name "+name+" location "+location;
	}
}

class Teacher extends Person{
	
	private String capital;
	Teacher(String name,String capital){
		this(name,"beijing",capital);
	}
	Teacher(String n,String l,String capital ){
		super(n,l);
		this.capital=capital;
	}
	public String info(){
		return super.info()+" capital "+capital;
	}
}
public class TestTeacher {
	public static void main(String[] args){
		Person p1=new Person("A");
		Person p2=new Person("B","shanghai");
		Teacher t1=new Teacher("D","Professor");
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(t1.info());
	}

}
