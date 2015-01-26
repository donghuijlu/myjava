package io;
import java.io.*;
public class TestBufferStream1 {
	public static void main(String[] args){
		try{
			FileInputStream fis=new FileInputStream("f:\\donghui\\java\\HelloWorld.java");
			BufferedInputStream bis=new BufferedInputStream(fis);
			int c=0;
			System.out.println(fis.read());
			System.out.println(bis.read());
			bis.mark(100);  //100��λ�ÿ�ʼ��ǣ����λ�ÿ�ʼ��
			for(int i=0;i<=10 && (c=bis.read())!=-1;i++){
				System.out.print((char)c+" ");
			}
			System.out.println();
			bis.reset(); //λ�������»ص���Ǵ�
			for(int i=0;i<=10 && (c=bis.read())!=-1;i++){
				System.out.print((char)c+" ");
			}
			bis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
