package javaex;

public class Test2 {
		/*Test2 test=new Test2();
		try{
			test.method1();
		}catch(SomeException e){
			e.printStackTrace();
		}
	}
	public void method1()throws SomeException{
		method2();	
	}
	public void method2()throws SomeException{
		method3();	
	}
	public void method3()throws SomeException{
		throw new SomeException ("SomeException occur in method3");
	}*/
		
			
	public void regist(int num) throws MyException{
		if(num<0){
			throw new MyException("����Ϊ��ֵ��������",3);
		}
		System.out.println("�Ǽ�����"+num);
	}
	public void manager(){
		try{
			regist(-7);
		}
		catch(MyException e){
			System.out.println("�Ǽ�ʧЧ������������="+e.getId());
			e.printStackTrace();
		}
		System.out.print("��������");
	}
	public static void main(String[] args){
		Test2 t=new Test2();
		t.manager();
	}

}

class MyException extends Exception{
		private int id;
		public MyException(String message,int id){
			super(message);
			this.id=id;
		}
		public int getId(){
			return id;
		}

}
	
