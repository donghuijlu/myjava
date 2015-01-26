package Array;

public class Search {
	public static void main(String[] args){
		int [] a= {1,2,3,4,5,6,7,8,9};
		int i=3;
		System.out.println(binarySearch(a,i));
		
		
	}
	
	public static int binarySearch(int a[],int num){//’€∞Î≤È’“≥Ã–Ú
		if(a.length==0){
			return -1;
		}
		
			int startPos=0;
			int endPos=a.length-1;
			int mid=(startPos+endPos)/2;
			while(startPos<=endPos){
				if(num==a[mid])	return mid;
				if(a[mid]<num){
					startPos=mid+1;
				}else if(a[mid]>num){
					endPos=mid-1;
				}
				mid=(startPos+endPos)/2;
		}
		return -1;
	}

}
