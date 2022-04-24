package com.jap.weightedaveragecalculator;

import java.util.Scanner;

public class WeightedAverageCalculation {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int assignmentScore,projectScore,quizScore,midTermScore,finalExamScore;
       assignmentScore=sc.nextInt();
       projectScore=sc.nextInt();
       quizScore=sc.nextInt();
       midTermScore=sc.nextInt();
       finalExamScore=sc.nextInt();
       float percentage =averageCalculation(assignmentScore,projectScore,quizScore,midTermScore,finalExamScore);
    System.out.println("assignmentScore"+"\t"+assignmentScore+"\n projectScore"+"\t"+projectScore+"\n quizScore"+"\t"+quizScore+"\n midterm score"+"\t"+midTermScore+"\n finalexam score"+"\t"+finalExamScore+"\n overall percentage"+"\t" + percentage );     
    
    }
  public static float averageCalculation(int assignmentScore, int projectScore, int quizScore, int midTermScore, int finalExamScore) {
    float overallPercentage;
    overallPercentage=((assignmentScore*(10.0f/100.0f))+(projectScore*(35.0f/100.0f))+(quizScore*(10.0f/100.0f))+(midTermScore*(15.0f/100.0f))+(finalExamScore*(30.0f/100.0f)));
      return overallPercentage;
      
  }

}
