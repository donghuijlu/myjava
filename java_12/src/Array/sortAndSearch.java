package Array;

public class sortAndSearch {
	public static void main(String[] args){
		Date[] days=new Date[6];
		days[0]=new Date(2006,3,4);
		days[1]=new Date(2005,9,8);
		days[2]=new Date(2004,6,7);
		days[3]=new Date(2007,10,4);
		days[4]=new Date(2004,5,7);
		days[5]=new Date(2007,8,10);
		Date day=new Date(2005,9,8);
		bubbleSort(days);
		for(int i=0;i<days.length;i++){
			System.out.println(days[i]);
		}
		System.out.println(search(days,day));
		
	}
	public static Date[] bubbleSort(Date[] a){//≈≈–Ú
		for(int i=a.length-1;i>0;i--){
			for(int j=0;j<i-1;j++){
				if(a[j].compare(a[j+1])>0){
					Date t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		return a;
		
	}
	public static int search(Date[] s,Date d){//≤È’“
		if(s.length==0) return -1;
		int startPos=0;
		int endPos=s.length;
		int mid=(startPos+endPos)/2;
		while(startPos<=endPos){
			if(s[mid].compare(d)==0){
				return mid;
			}
			if(s[mid].compare(d)>0){
				endPos=mid-1;
			}else if(s[mid].compare(d)<0){
				startPos=mid+1;
			}
			mid=(startPos+endPos)/2;
		}
		return -1;
		
	}

}
class Date{
	int year,month,day;
	Date(int y,int m,int d){
		year=y;month=m;day=d;
	}
	public int compare(Date date){
		return year>date.year ? 1
				:year<date.year ? -1
				:month>date.month ? 1
				:month<date.month ? -1
				:day>date.day ? 1
				:day<date.day ? -1:0;	
	}
	public String toString(){
		return "years:month:day--"+year+"-"+month+"-"+day;
	}
}