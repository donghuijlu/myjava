package Socket;
import java.net.*;
public class TestUDPClient {
	public static void main(String[] args) throws Exception{
		byte[] buf=(new String("Hello")).getBytes(); //���ַ����������ֽ�����
		DatagramPacket dp=new DatagramPacket(buf,buf.length,
				new InetSocketAddress("127.0.0.1",5678) );//InetSocketAddress�̳���SocketAddress ��������ָ���������
		//ÿһ��Ҫ���߷����ĸ��ط�
		DatagramSocket ds=new DatagramSocket(9999); //��UDP��9999�˿�λ����5678�˿ڷ�����
		ds.send(dp);//��������
		ds.close();
	}

}
