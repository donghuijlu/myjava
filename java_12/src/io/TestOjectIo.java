package io;
import java.io.*;
public class TestOjectIo {
	public static void main(String[] args) throws Exception{
		T t=new T();
		t.k=8;
		FileOutputStream fos=new FileOutputStream("f:/donghui/java/io/testobjio.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.flush();
		oos.close();
		
		FileInputStream fis=new FileInputStream("f:/donghui/java/io/testobjio.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		T tReaded=(T)ois.readObject();
		System.out.println(tReaded.i+" "+tReaded.j+" "+tReaded.d+" "+tReaded.k);
	}

}
class T implements Serializable {
	int i=10;
	int j=9;
	double d=2.3;
	transient int k=15;
}