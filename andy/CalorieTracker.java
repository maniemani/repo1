package com.jap.calorietracker;


public class CalorieTracker {

    //This function takes the calories burnt by the activities and the calorie intake in a day
    // and returns the weight lost by Anne

    public int weightLostInAMonth(int cycling,int running,int swimming,int calorieIntake)
    {
        int pounds=((cycling+running+swimming)*4+10*calorieIntake)/1000;
		if(cycling<0&&running<0&&swimming<0)
		return 0;
        return pounds;
    }


    public static void main(String[] args) {
        CalorieTracker ct = new CalorieTracker();
        System.out.println("Weight lost by Anne in a month is : "+ct.weightLostInAMonth(300,200,500,2000)+" pounds");

    }
}
