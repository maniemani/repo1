package com.jap.areacalculator;

import java.util.Scanner;


public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option from list to calculate area of fence");
        System.out.println("1. Square area for the chickens");
        System.out.println("2. Circular area for ducks");
        System.out.println("3. Rectangular area for cows");
        System.out.println();
        // Input choice from user
        int choice = scanner.nextInt();

        // Make a call to calculateAreaOfFence(int choice) and pass the choice made by user to it
		AreaCalculator ob= new AreaCalculator();
		ob.calculateAreaOfFence( choice);
    }

    // Function to calculate area of fence by calling respective methods according to user's choice
    public void calculateAreaOfFence(int choice) {
		AreaCalculator ob=new AreaCalculator();
		Scanner sc= new Scanner(System.in);
		double result;
		if(choice==1){
			System.out.println("Enter side of square :");
			double side= sc.nextDouble();
			result=ob. calculateAreaOfSquare(side);
			System.out.println("Area of square fence for chickens is"+result);
		}
		else if(choice==2){
			System.out.println("Enter radius of circle :");
			double radius=sc.nextDouble();
			result=ob.calculateAreaOfCircle(radius);
			System.out.println("Area of circular fence for ducks is"+radius);
		}
		else if(choice==3){
			System.out.println("Enter length of rectangle");
			double length=sc.nextDouble();
			System.out.println("Enter breadth of rectangle");
			double breadth=sc.nextDouble();
			result=ob.calculateAreaOfRectangle( length, breadth);
			System.out.println("Area of rectangular fence for cows is"+result);
		}
    }

    // Function to calculate area of square
    public double calculateAreaOfSquare(double side) {
        return side*side;
    }

    // Function to calculate area of circle
    public double calculateAreaOfCircle(double radius) {
    	double pi=3.14;
        return pi*radius*radius;
    }

    // Function to calculate area of rectangle
    public double calculateAreaOfRectangle(double length, double breadth) {
        return length*breadth;
    }
}
