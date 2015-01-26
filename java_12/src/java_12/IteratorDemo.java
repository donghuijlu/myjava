package java_12;
import java.util.*;
public class IteratorDemo {
	public static void main(String args[]){
		//����һ��ArrayList����
		ArrayList al=new ArrayList();
		//����Ԫ�ص�ArrayList��
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		//ʹ��iterator��ʾal�е�����
		System.out.print("al��ԭʼ�����ǣ�");
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			Object element=itr.next();
			System.out.println(element+"+");
		}
		System.out.println();
		//��ListIterator���޸�����
		ListIterator litr=al.listIterator();
		while(litr.hasNext()){
			Object element=litr.next();
			//��set�����޸�������
			litr.set(element+"+");
		}
		System.out.print("al ���޸�֮�������:");
		itr=al.iterator();
		while(itr.hasNext()){
			Object element =itr.next();
			System.out.print(element+" ");
		}
		System.out.println();
		//�����ǽ��б��е����ݷ������
		System.out.print("���б��������");
		//hasPrevious�ɺ���ǰ���
		while(litr.hasPrevious()){
			Object element=litr.previous();
			System.out.print(element +" ");
		}
		System.out.println();
	}

}
