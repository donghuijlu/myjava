package Array;

public class Test3 {
	public static void main(String[] args){
		Integer i=new Integer(100);//newһ��int���Ͷ������ڴ��еĶ���
		Double d=new Double("123.456");
		int j=i.intValue()+d.intValue();
		float f=i.floatValue()+d.floatValue();
		System.out.println(j);
		System.out.println(f);
		double pi=Double.parseDouble("3.14159267");
		double r=Double.valueOf("2.0").doubleValue();//��2.0ת����double���� ������value
		double s=pi*r*r;
		System.out.println(s);
		try{
			int k=Integer.parseInt("1.25");
		}catch(NumberFormatException e){
			System.out.println("���ݸ�ʽ����");
		}
		System.out.println(Integer.toBinaryString(123)+"B");
		System.out.println(Integer.toHexString(123)+"H");
		System.out.println(Integer.toOctalString(123)+"O");
	}

}
