package Array;

public class Test3 {
	public static void main(String[] args){
		Integer i=new Integer(100);//new一个int类型对象，在内存中的堆区
		Double d=new Double("123.456");
		int j=i.intValue()+d.intValue();
		float f=i.floatValue()+d.floatValue();
		System.out.println(j);
		System.out.println(f);
		double pi=Double.parseDouble("3.14159267");
		double r=Double.valueOf("2.0").doubleValue();//将2.0转换成double对象 再求其value
		double s=pi*r*r;
		System.out.println(s);
		try{
			int k=Integer.parseInt("1.25");
		}catch(NumberFormatException e){
			System.out.println("数据格式不对");
		}
		System.out.println(Integer.toBinaryString(123)+"B");
		System.out.println(Integer.toHexString(123)+"H");
		System.out.println(Integer.toOctalString(123)+"O");
	}

}
