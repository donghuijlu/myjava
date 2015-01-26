package Socket;
import java.net.*;
public class TestUDPClient {
	public static void main(String[] args) throws Exception{
		byte[] buf=(new String("Hello")).getBytes(); //将字符串解析成字节数组
		DatagramPacket dp=new DatagramPacket(buf,buf.length,
				new InetSocketAddress("127.0.0.1",5678) );//InetSocketAddress继承了SocketAddress 父类引用指向子类对象
		//每一包要告诉发到哪个地方
		DatagramSocket ds=new DatagramSocket(9999); //在UDP的9999端口位置向5678端口发数据
		ds.send(dp);//发送数据
		ds.close();
	}

}
