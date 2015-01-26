package io;
import java.io.*;
public class TestCopy {
	public static void main(String[] args){
		FileReader fr1=null;
		FileWriter fw2=null;
		int r=0;
		try{
			fr1=new FileReader("f:\\donghui\\java\\cat.java");
			fw2=new FileWriter("f:\\donghui\\java\\io\\ct.java");
			while((r=fr1.read())!=-1){
				fw2.write(r);
			}
			fr1.close();
			fw2.close();
		}catch(FileNotFoundException e5){
			System.out.println("没有找到指定文件");
			System.exit(-1);
		}
		catch(IOException e6){
			System.out.println("文件不能复制");
			System.exit(-1);
		}
		System.out.println("文件复制");
	}

}
