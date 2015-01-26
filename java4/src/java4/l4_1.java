package java4;
import java.util.*;
public class l4_1  {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args){
		ArrayList aa1=new ArrayList();
		System.out.println("大小为"+aa1.size());
		Xs xs1=new Xs("悟空",15,90);
		Xs xs2=new Xs("八戒",13,79);
		Xs xs3=new Xs("沙僧",14,75);
		Xs xs4=new Xs("小白龙",16,86);
		
		aa1.add(xs1);             //添加学生
		aa1.add(xs2);
		aa1.add(xs3);
		System.out.println("大小为"+aa1.size());
		//aa1.remove(1);             //删除
		aa1.add(xs4);
		for(int i=0;i<aa1.size();i++){//遍历
			Xs tv=(Xs)aa1.get(i);
			System.out.println("第"+(i+1)+"个学生姓名是"+tv.getXingming());
		}
		
	}
}
class Xs{
	private String xingming;
	private int xuehao;
	private int chengji;
	Xs(String xingming,int xuehao,int chengji){
		this.xingming=xingming;
		this.xuehao=xuehao;
		this.chengji=chengji;
	}
	public String getXingming(){
		return xingming;
	}
	public int getXuehao(){
		return xuehao;
	}
	public int getChengji(){
		return chengji;
	}
}