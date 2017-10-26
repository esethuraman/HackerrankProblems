package main.Implementation;
import java.util.Scanner;

public class DayOfTheProgrammer {

    static String solve(int year){
    	int n = 256;
//    	Determine if it is Gregorian Calendar
    	boolean isGregorianCalendar = (year>=1919);
    	
    	int[] daysInMonths = initializeMonthDaysArray();

//    	for february month, find the number of days
    	daysInMonths[1] = getDaysForFebruary(year, isGregorianCalendar);
    	
    	String nthDay = getNthDayofYear(n, daysInMonths, year);
    	
    	return nthDay;
    }

    private static int[] initializeMonthDaysArray() {
    	int[] arr = {31, 0 , 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		return arr;
	}

	private static String getNthDayofYear(int n, int[] daysInMonths, int year) {
		int month = 0;
		int noOfMonths = 12;
    	int totalDays = 0;
    	boolean partialDaysFlag = false;
    	int partialDays = 0;
    	String dayOfProgrammer = "";
		for(month=0; month<noOfMonths ; month++){
			totalDays += daysInMonths[month];
			if (totalDays >= n){
				int extraDays = totalDays - n;
				partialDays = daysInMonths[month] - extraDays;
				partialDaysFlag = true;
				break;
			}
    	}
		
		dayOfProgrammer = computeTheDay(partialDays, month, year);
		
		return dayOfProgrammer;
	}

	private static String computeTheDay(int partialDays, int month, int year) {
//		for output purpose increment the month by 1 (since arrays are indexed from 0)
		month += 1;
		String dayOfProgrammer = (partialDays > 9) ? 
				String.valueOf(partialDays) : 
				"0" + String.valueOf(partialDays);
		dayOfProgrammer += "." + ((month > 9) ? 
				String.valueOf(month) : 
				"0" + String.valueOf(month));
		dayOfProgrammer += "." + String.valueOf(year);
		return dayOfProgrammer;
	}

	private static int getDaysForFebruary(int year, boolean isGregorianCalendar) {
    	int days = 28;
		
//    	this is when the calendar transition happened
    	if(year == 1918){
    		days = 15;
    	}
    	
    	else if (year%4 == 0){
//    		for a non gregorian calendar, every year divisible by 4 is a leap year
    		if(!isGregorianCalendar){
    			days++;
    		}
    		else if((year % 100) == 0){
				if(year%400 == 0){
					days++;
				}
			}
			else{
				days++;
			}
		}
    	return days;
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}

