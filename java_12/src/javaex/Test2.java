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
			throw new MyException("人数为负值，不合理",3);
		}
		System.out.println("登记人数"+num);
	}
	public void manager(){
		try{
			regist(-7);
		}
		catch(MyException e){
			System.out.println("登记失效，出错类型码="+e.getId());
			e.printStackTrace();
		}
		System.out.print("操作结束");
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
	
