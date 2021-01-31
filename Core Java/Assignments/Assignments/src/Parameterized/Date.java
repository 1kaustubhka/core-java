package Parameterized;

public class Date {
	int day;
	int month;
	int year;
	
	Date()
	{
		day=1;
		month=1;
		year=2000;
	}
	
	Date(int d, int m, int y)
	{
		day=d;
		month=m;
		year=y;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(12,8,1998);
		
		System.out.println("Non Parameterized: "+d1.getDay()+"/"+d1.getMonth()+"/"+d1.getYear());
		System.out.println("Parameterized: "+d2.getDay()+"/"+d2.getMonth()+"/"+d2.getYear());
	}
}
