package com.jap.dayfinder;

public class DayFinder {
	//The current day of week is taken in int (For Sunday 1, Monday 2, Tuesday 3....Saturday 7)
	    public String predictDay(int currentDay, int noOfDaysFromToday)
	    { 
			int sum= currentDay+noOfDaysFromToday;
			sum=sum%7;
			if(currentDay<0 || noOfDaysFromToday<0)
			sum+=7;
			String result="";
			switch(sum)
			{
				case 0: result="Saturday";
					break;
				case 1: result="Sunday";
					break;
				case 2: result="Monday";
					break;
				case 3: result="Tuesday";
					break;
				case 4: result="Wednesday";
					break;
				case 5: result="Thursday";
					break;
				case 6: result="Friday";
					break;
				default: result="Saturday";
					break;
			}
	       return result;
	    }

	    public static void main(String[] args){
	        DayFinder dayFinder = new DayFinder();
	        // Accept input of medicine taken day and the next dose to be taken in how many days
	        int medicineTakenOn = 7;
	        int daysToNextDose = 4;

	        // call the method to predict the day the next dose must be taken
	        String nextDoseToBeTakenOn = dayFinder.predictDay(medicineTakenOn, daysToNextDose);
	        // display the day
	        System.out.println("Your next dose should be taken on :  "+nextDoseToBeTakenOn);
	    }

	}
                             