package Socket;
import java.net.*;
public class TestUDPServer {
	public static void main(String[] args) throws Exception{
		byte buf[]=new byte[1024];//�����ֽڿռ�
		DatagramPacket dp=new DatagramPacket(buf,buf.length); //С����ռ����������
		DatagramSocket ds=new DatagramSocket(5678);
		while(true){
			ds.receive(dp); //���˷������ӽ�����������ʽ����
			System.out.println(new String(buf,0,dp.getLength())); //����ʵ���յ�������
		}
	}
}
