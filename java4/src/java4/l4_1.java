package java4;
import java.util.*;
public class l4_1  {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args){
		ArrayList aa1=new ArrayList();
		System.out.println("��СΪ"+aa1.size());
		Xs xs1=new Xs("���",15,90);
		Xs xs2=new Xs("�˽�",13,79);
		Xs xs3=new Xs("ɳɮ",14,75);
		Xs xs4=new Xs("С����",16,86);
		
		aa1.add(xs1);             //���ѧ��
		aa1.add(xs2);
		aa1.add(xs3);
		System.out.println("��СΪ"+aa1.size());
		//aa1.remove(1);             //ɾ��
		aa1.add(xs4);
		for(int i=0;i<aa1.size();i++){//����
			Xs tv=(Xs)aa1.get(i);
			System.out.println("��"+(i+1)+"��ѧ��������"+tv.getXingming());
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