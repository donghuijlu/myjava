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
			PrintWriter os=new PrintWriter(out); //写出到客户端
			BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client:"+is.readLine());//客户端的输入
			line=sin.readLine();//键盘输入
			while(!line.equals("bye")){
				os.println(line);//在客户端写出
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
