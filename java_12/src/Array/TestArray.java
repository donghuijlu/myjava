package Array;
import java.util.Scanner;
public class TestArray {
	public static void main(String[] args){
		int [] Array=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.print("please in put the numbers:");
		for(int i=0;i<Array.length;i++){
			Array[i]=sc.nextInt();
		}
		selectionSort(Array);
		print(Array);
		
		
		
	}
	private static void selectionSort(int[] Array){
		int k,t;
		for(int i=0;i<Array.length;i++){
			k=i;
			for(int j=k+1;j<Array.length;j++){
				if(Array[j]<Array[k]){
					k=j;
				}
			}
			if(k!=i){//比较位置再交换
				t=Array[i];
				Array[i]=Array[k];
				Array[k]=t;
			}
		}
		
	}
	private static void print(int[] Array){
		for(int i=0;i<Array.length;i++){
			System.out.print(" "+Array[i]);
		}
	}
}