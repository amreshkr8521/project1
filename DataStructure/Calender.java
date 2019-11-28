package com.bridgelabz.DataStructure;
/*********************************************************************
 * 
 * To display the calendar in calendar format
 * 
 * 
 * @author amresh kumar
 * @since 26-11-2019
 *
 **********************************************************************
 */
public class Calender {
	/**
	 * To calculate the day of the week
	 * 
	 * @param 	month --> integer
	 * @param 	day	--> integer
	 * @param 	year	-->integer
	 * @return	integer
	 */
	  public static int day(int month, int day, int year) {
	        int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	        return d;
	    }

	    /********************************************************
	     * 
	     * to return true if the given year is a leap year
	     * 
	     * @param 	year -->integer
	     * @return	boolean
	     * 
	     * ******************************************************
	     */
	    public static boolean isLeapYear(int year) {
	        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
	        if  (year % 400 == 0) return true;
	        return false;
	    }

	    /*******************************************************************
	     * To show the calendar 
	     * 
	     * @param 	month -->integer
	     * @param	year  -->integer	
	     * @return 	void
	     * 
	     * *****************************************************************
	     */
	    public static void ShowCalender(int month,int year) {
	       

	        // months[i] = name of month i
	        String[] months = {
	            "",                               // leave empty so that months[1] = "January"
	            "January", "February", "March",
	            "April", "May", "June",
	            "July", "August", "September",
	            "October", "November", "December"
	        };

	        // days[i] = number of days in month i
	        int[] days = {
	            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	        };

	        // check for leap year
	        if (month == 2 && isLeapYear(year)) days[month] = 29;


	        // print calendar header
	        System.out.println("   " + months[month] + " " + year);
	        System.out.println(" S  M Tu  W Th  F  S");

	        // starting day
	        int d = day(month, 1, year);

	        // print the calendar
	        for (int i = 0; i < d; i++)
	            System.out.print("   ");
	        for (int i = 1; i <= days[month]; i++) {
	            System.out.print(" "+i);
	            if (((i + d) % 7 == 0) || (i == days[month])) System.out.println();
	        }

	    }

}
