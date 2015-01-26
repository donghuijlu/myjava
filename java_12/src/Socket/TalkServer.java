package Socket;
import java.net.*;
import java.io.*;

public class TalkServer {
	public static void main(String[] args){
		InputStream in=null;
		OutputStream out=null;
		try{
			ServerSocket ss=new ServerSocket(9999);
			Socket socket=ss.accept();
			String line;
			in=socket.getInputStream();
			out=socket.getOutputStream();
			BufferedReader is=new BufferedReader(new InputStreamReader(in));
			PrintWriter os=new PrintWriter(out); //д�����ͻ���
			BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client:"+is.readLine());//�ͻ��˵�����
			line=sin.readLine();//��������
			while(!line.equals("bye")){
				os.println(line);//�ڿͻ���д��
				os.flush();
				System.out.println("Server:"+line);
				System.out.println("Client:"+is.readLine());
				line=sin.readLine();
				
			}
			is.close();
			os.close();
			socket.close();
			
		}catch(Exception e){
			System.out.println("errpr:"+e);
		}
	}

}
