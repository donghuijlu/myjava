package java_12;

/*class BirthDate{
	private int day;
	private int month;
	private int year;
	
	public BirthDate(int d,int m,int y){//构造方法
		day=d;
		month=m;
		year=y;
		
	}
	public void setDay(int d){
		day=d;
	}
	public void setMonth(int m){
		month=m;
	}
	public void setYear(int y){
		year=y;
	}
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	public void display(){
		System.out.println(day+"-"+month+"-"+year);
	}
}

public class Test {
	public static void main(String args[]){
		Test test =new Test();//在栈内存为test局部变量分配内存空间
		int date=9;
		BirthDate d1=new BirthDate(7,7,1970);
		BirthDate d2=new BirthDate(1,1,2000);
		test.change1(date);
		test.change2(d1);
		test.change3(d2);
		System.out.println("date="+date);
		d1.display();
		d2.display();
		
		
	}
	public void change1(int i){//调用时把date copy给i
		i=1234;
	}
	public void change2(BirthDate b){
		b=new BirthDate(22,2,2004);
	}
	public void change3(BirthDate b){
		b.setDay(22);
	}

}*/
import java.io.*;
public class Test {
  public static void main(String[] args) {
    FileReader fr = null; 
    int c = 0;
    try {
      fr = new FileReader("*.java");
      int ln = 0;
      while ((c = fr.read()) != -1) {
        System.out.print((char)c);
      }
      fr.close();
    } catch (IOException e) {
    }

  }
}
