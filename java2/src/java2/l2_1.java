
package java2;
import java.util.*;
public class l2_1 {
	public static void main(String[] args){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		try{
			a=sc.nextInt();
			b=sc.nextInt();
			c=a%b;
			System.out.println("����Ϊ"+c);
		}
		catch(Exception e)
		{
			System.out.println("��������");
		}
		finally{
			System.out.println("����˳��������");
		}
	}

}
