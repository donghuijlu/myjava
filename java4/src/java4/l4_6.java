package java4;
import java.util.*;
class Ls{
	private String mingcheng;
	private float jiage;
	Ls(String mingcheng,float jiage){
		this.mingcheng=mingcheng;
		this.jiage=jiage;
	}
}
class Yl{
	private String mingcheng;
	private float jiage;
	private String yanse;
	
	Yl(String migncheng,float jiage,String yanse){
		this.mingcheng=mingcheng;
		this.jiage=jiage;
		this.yanse=yanse;
	}
}
public class l4_6 {

	public static void main(String[] args){
		ArrayList<Ls> ff=new ArrayList<Ls>();
		Ls ls1=new Ls(" Ì∆¨",5f);
		ff.add(ls1);
		Ls cls=(Ls)ff.get(0);
		//Yl hyl=(Y1)ff.get(0);
		
	}

}
