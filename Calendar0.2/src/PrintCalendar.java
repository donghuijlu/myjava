import javax.swing.JOptionPane;


public class PrintCalendar {
	//main method
	public static void main(String[] args){
		//prompt the user to enter year
		String yearString=JOptionPane.showInputDialog("enter full year(e.g.,2011):");
		
		//convert string into integer
		int year=Integer.parseInt(yearString);
		
		//prompt the user to enter month
		String monthString=JOptionPane.showInputDialog("enter month in number between 1 and 12");
		
		//convert string into integer
		int month=Integer.parseInt(monthString);
		
		//print calendar for the month of year
		if(year<1800 || month>12){
			System.out.println("输入的时间有误！");
		}else{
			printMonth(year,month);
		}
	}

	 static void printMonth(int year, int month) {
		printMonthTitle(year,month);
		printMonthBody(year,month);
		
	}


	 static void printMonthTitle(int year,int month){
		System.out.println("         "+getMonthName(month)+" "+year);
		System.out.println("----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	
	 static String getMonthName(int month){
		String monthName=null;
		switch(month){
		case 1:monthName="January";break;
		case 2:monthName="February";break;
		case 3:monthName="March";break;
		case 4:monthName="April";break;
		case 5:monthName="May";break;
		case 6:monthName="June";break;
		case 7:monthName="July";break;
		case 8:monthName="August";break;
		case 9:monthName="September";break;
		case 10:monthName="October";break;
		case 11:monthName="Novemeber";break;
		case 12:monthName="December";break;
		}
		return monthName;
	}
	
	 static void printMonthBody(int year, int month) {
		int startDay=getStartDay(year,month);//这个月的一号是星期几
		
		int numberOfDaysInMonth=getNumberOfDaysInMonth(year,month);//这个月有多少天
		
		int i=0;
		for(i=0;i<startDay;i++){
			System.out.print("    ");
		}
		for(i=1;i<=numberOfDaysInMonth;i++){
			if(i<10){
				System.out.print("   "+i);
			}else{
				System.out.print("  "+i);
			}
			if((i+startDay)%7==0){
				System.out.println();
			}
		}
		System.out.println();
	}
	 static int getStartDay(int year,int month){
		 int startDay1800=3;//1800年的一月一号是星期三
		 int totalNumberOfDays=getTotalNumberOfDays(year,month);
		 
		return (totalNumberOfDays+startDay1800)%7;
	}

	 static int getTotalNumberOfDays(int year,int month){
		 int total=0;
		 for(int i=1800;i<year;i++){
			 if(isLeapYear(i)){
				 total=total+366;
			 }else{
				 total=total+365;
			 }
		 }
		 for(int i=1;i<month;i++){
			 total=total+getNumberOfDaysInMonth(year,i);
		 }
		return total;
	}
	 static int getNumberOfDaysInMonth(int year,int month){
		 if(month==1 || month==3 || month==5 || month==7 || month==8
				 || month==10 || month==12)
			return 31;
		 if(month==4 || month==6 || month==9 || month==11)
			return 30;
		 if(month==2) return isLeapYear(year) ? 29:28;
		 return 0;
	}
	 static boolean isLeapYear(int year){
		 
		return year%400==0 || (year%4==0 && year%100!=0);
	}

}
