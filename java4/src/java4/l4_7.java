package java4;
import java.util.*;
import java.lang.reflect.*;
class Wj{
	public void wan(){
		System.out.println("正在玩游戏");
	}
	public int jiafa(int a,int b){
		return a+b;
	}
}
class Bh<L>{
	private L l;
	Bh(L l){
		this.l=l;
	}
	public void lxmc(){
		System.out.println("类型是"+l.getClass().getName()); //取类型名
		Method []a=l.getClass().getDeclaredMethods();     //数组接受类中的方法的数量
		for(int i=0;i<a.length;i++){
			System.out.println("函数名为"+a[i].getName());
		}
	}
	
}
public class l4_7 {
	public static void main(String[] args){
		//Bh<String> hw1=new Bh<String>("货物1");
		//Bh<Integer> hw2=new Bh<Integer>(123);
		Bh<Wj> hw3=new Bh<Wj>(new Wj());
		hw3.lxmc();
	}

}
