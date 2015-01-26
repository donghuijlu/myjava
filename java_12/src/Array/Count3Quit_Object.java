package Array;
class Kid{
	int id;
	Kid right;
	Kid left;
}
class KidCircle{
	int count=0;   //计小孩数
	Kid first,last; //定义第一个小孩和最后一个小孩
	KidCircle(int n){//构造方法
		for(int i=0;i<n;i++){
			add();
		}
		
	}
	void add(){//在圈里添加小孩的方法
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
	void delete(Kid k){//小孩出圈
		if(count<=0){
			System.out.print("圈内已没有人在");
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
		while(kc.count>1){//count是从500开始，删除一个小孩后递减一个
			countNum++;
			if(countNum==3){//计数满3，小孩出圈
				kc.delete(k);
				countNum=0;
			}
			k=k.right;  //当前小孩出圈后挪到下一个小孩，此时K为出圈小孩右手边的人
		}
		System.out.println(kc.first.id);
	}

}
