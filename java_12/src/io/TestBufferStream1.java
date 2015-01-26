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
			bis.mark(100);  //100的位置开始标记，标记位置开始读
			for(int i=0;i<=10 && (c=bis.read())!=-1;i++){
				System.out.print((char)c+" ");
			}
			System.out.println();
			bis.reset(); //位置又重新回到标记处
			for(int i=0;i<=10 && (c=bis.read())!=-1;i++){
				System.out.print((char)c+" ");
			}
			bis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
