package Array;
class Kid{
	int id;
	Kid right;
	Kid left;
}
class KidCircle{
	int count=0;   //��С����
	Kid first,last; //�����һ��С�������һ��С��
	KidCircle(int n){//���췽��
		for(int i=0;i<n;i++){
			add();
		}
		
	}
	void add(){//��Ȧ�����С���ķ���
		Kid k=new Kid();
		k.id=count;
		if(count<=0){
			first=k;
			last=k;
			k.left=k;
			k.right=k;
		}else{
			last.right=k;
			k.left=last;
			k.right=first;
			first.left=k;
			last=k;
		}
		count++;	
	}
	void delete(Kid k){//С����Ȧ
		if(count<=0){
			System.out.print("Ȧ����û������");
		}else if(count==1){
			first=last=null;
		}else{
			k.left.right=k.right;
			k.right.left=k.left;
			
			if(k==first){
				first=k.right;
			}else if(k==last){
				last=k.left;
			}
		}
		count--;
	}
}
public class Count3Quit_Object {
	public static void main(String[] args){
		KidCircle kc=new KidCircle(500);
		int countNum=0;
		Kid k=kc.first;
		while(kc.count>1){//count�Ǵ�500��ʼ��ɾ��һ��С����ݼ�һ��
			countNum++;
			if(countNum==3){//������3��С����Ȧ
				kc.delete(k);
				countNum=0;
			}
			k=k.right;  //��ǰС����Ȧ��Ų����һ��С������ʱKΪ��ȦС�����ֱߵ���
		}
		System.out.println(kc.first.id);
	}

}
