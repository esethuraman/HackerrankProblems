package main.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryFine {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String actualDate = in.readLine();
		String expectedDate = in.readLine();
		int aDay=0, aMonth=0, aYear=0, eDay=0, eMonth=0, eYear=0;
		int fine = 0;
		
		String parseddateActual[] = parsetheDate(actualDate);
		aDay = Integer.parseInt(parseddateActual[0]);
		aMonth = Integer.parseInt(parseddateActual[1]);
		aYear = Integer.parseInt(parseddateActual[2]);
		
		String parseddateExpexted[] = parsetheDate(expectedDate);
		eDay = Integer.parseInt(parseddateExpexted[0]);
		eMonth = Integer.parseInt(parseddateExpexted[1]);
		eYear = Integer.parseInt(parseddateExpexted[2]);
		
		if(getYearDiff(aYear, eYear) > 0){
			fine = fine + (getYearDiff(aYear, eYear)*10000);
			
		}
		else if((getMonthDiff(aMonth, eMonth) > 0) && (aYear == eYear)){
			fine = fine + getMonthDiff(aMonth, eMonth)*500;
			
		}
		else if((getDayDiff(aDay, eDay) > 0) && ((aMonth==eMonth)&&(aYear==eYear))){
			fine = fine + getDayDiff(aDay, eDay)*15;
		}
		
		
		System.out.println( fine );
	}

	private static int getDayDiff(int aDay, int eDay) {
		return aDay-eDay;
	}

	private static int getMonthDiff(int aMonth, int eMonth) {
		return aMonth-eMonth;
	}

	private static int getYearDiff(int aYear, int eYear) {
		return aYear-eYear;	
	}

	private static String[] parsetheDate(String date) {
		String parseddate[] = date.split(" ");
		return parseddate;
	}
}
