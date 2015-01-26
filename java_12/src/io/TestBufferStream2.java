package io;
import java.io.*;
public class TestBufferStream2 {
	public static void main(String[] args){
		try{
			BufferedWriter bw=new BufferedWriter(new FileWriter("f:\\donghui\\java\\io\\dat.txt"));
			BufferedReader br=new BufferedReader(new FileReader("f:\\donghui\\java\\io\\dat.txt"));
			
			String s=null;
			for(int i=1;i<=100;i++){
				s=String.valueOf(Math.random());//ȡ0��1֮��������ת�����ַ�������
				bw.write(s);//��sд��bw
				bw.newLine();//дһ�����ֻ�һ����
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
