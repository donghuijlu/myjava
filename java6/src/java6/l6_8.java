package java6;

class Xc8 implements Runnable{
	public static int chepiao=100;
	String aa=new String("1");
	
	//synchronized �������ǣ���������Ͻ�Ĵ��벿�֣�Ҫôȫ��ִ�У�Ҫôȫ����ִ��
	
	public void run(){ //synchronized���κ�������Ҫ�ַ������൱��Ĭ����this����Ϊ����ѭ�����ܷ������λ��
		while(true){
			synchronized(aa){//���������δ���飬�ֿ������κ���
				if(chepiao>0){
					System.out.println("��"+Thread.currentThread().getName()+"����վ��������"+(101-chepiao)+"�ų�Ʊ");
					--chepiao;
				}else{
					break;
				}
			}
		}
	}
}
public class l6_8 {
	public static void main(String[] args){
		Xc8 xc81=new Xc8();
		Thread ee=new Thread(xc81);
		ee.start();
		
		Xc8 xc82=new Xc8();
		Thread ff=new Thread(xc82);
		ff.start();
	}

}
