package Socket;
import java.net.*;
public class TestUDPServer {
	public static void main(String[] args) throws Exception{
		byte buf[]=new byte[1024];//分配字节空间
		DatagramPacket dp=new DatagramPacket(buf,buf.length); //小包袱占据整个数组
		DatagramSocket ds=new DatagramSocket(5678);
		while(true){
			ds.receive(dp); //有人发数据扔进包袱，阻塞式方法
			System.out.println(new String(buf,0,dp.getLength())); //包袱实际收到的数据
		}
	}
}
