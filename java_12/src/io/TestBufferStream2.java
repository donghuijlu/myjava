package io;
import java.io.*;
public class TestBufferStream2 {
	public static void main(String[] args){
		try{
			BufferedWriter bw=new BufferedWriter(new FileWriter("f:\\donghui\\java\\io\\dat.txt"));
			BufferedReader br=new BufferedReader(new FileReader("f:\\donghui\\java\\io\\dat.txt"));
			
			String s=null;
			for(int i=1;i<=100;i++){
				s=String.valueOf(Math.random());//取0到1之间的随机数转化成字符串类型
				bw.write(s);//将s写入bw
				bw.newLine();//写一个数字换一次行
			}
			bw.flush();
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
			bw.close();
			br.close();
			
		}catch (IOException e) { e.printStackTrace();}
	}

}
