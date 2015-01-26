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
		printMonth(year,month);
	}

	private static void printMonth(int year, int month) {
		System.out.print(month+ " "+year);
		
	}
	public static void printMonthTitle(int year,int month){
		
	}
	public static String getMonthName(int month){
		return "January";
	}
	public static int getStartDay(int year,int month){
		return 1;
	}
	public static int getNumberOfDaysInMonth(int year,int month){
		return 31;
	}
	public static int getTotalNumberOfDays(int year,int month){
		return 10000;
	}
	public static boolean isLeapYear(int year){
		return true;
	}

}
