package java2;
import java.util.*;
public class l2_2 {
	public static void main(String[] args)throws Exception
	{
		A aa=new A();
		aa.a();
		System.out.println("˳�������С�����");
	}

}
class A{
	void a() throws Exception{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a%b;
		System.out.println("����Ϊ"+c);
	}
}