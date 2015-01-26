package Array;

public class Count3Quit {
	public static void main(String[] args){
		boolean[] array= new boolean [500];
		for(int i=0;i<500;i++){
			array[i]=true;
		}
		int number=array.length;
		int countNumber=0;
		int index=0;
		while(number>1){
			if(array[index]==true){
				countNumber++;
				if(countNumber==3){
				array[index]=false;
				countNumber=0;
				number--;
				}
			}
			index++;
			if(index==array.length){
				index=0;
			}
		}
		for(int i=0;i<array.length;i++){
			if(array[i]){
				System.out.println(i);
			}
		}
	
	}

}
