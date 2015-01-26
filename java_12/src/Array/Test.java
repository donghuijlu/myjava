package Array;
/*class Date{
	int year,month,day;
	Date(int y,int m,int d){
		year=y;
		month=m;
		day=d;
	}
	public int compare(Date date){
		return year>date.year ? 1
				:year<date.year ? -1
				:month>date.month ? 1
				:month<date.month ? -1
				:day > date.day ? 1
				:day < date.day ? -1:0;				
	}
	public String toString(){
		return "Year:Month:Day--"+year+"-"+month+"-"+day;
	}
		
	}
	*/
public class Test {
	public static void main(String[] args){
		Date[] days=new Date[5];
		 days[0]=new Date(2007,4,6);
		 days[1]=new Date(2005,2,6);
		 days[2]=new Date(2008,6,8);
		 days[3]=new Date(2009,8,7);
		 days[4]=new Date(2004,6,7);
		
		 //Date d=new Date(2006,7,4);
		 bubbleSort(days);
		 for(int i=0;i<days.length;i++){
			 System.out.println(days[i]);
		 }
	}
	public static Date[] bubbleSort(Date[] a){
		for(int i=a.length-1;i>0;i--){
			for(int j=0;j<i-1;j++){
				if(a[j].compare(a[j+1])>0){
					Date temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		return a;
	}
	public static Date[] selectionSort(Date[] a){
		int k;
		for(int i=0;i<a.length;i++){
			k=i;
			for(int j=k+1;j<a.length;j++){
				if(a[i].compare(a[j])>0){
					k=j;
				}
			}
			if(k!=i){
				Date t=a[i];
				a[i]=a[k];
				a[k]=a[i];
			}
		}
		return a;
	}
	
	

}
