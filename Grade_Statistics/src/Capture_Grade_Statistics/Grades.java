/*
 This Java application is designed to capture Students grades entered by the
 user and to provide important statistics for the grades in a class. The application will
 Total the entered grades, segregate the maximum & minimum grade in the class and finally provide 
 an average for the grades. 
  
  Author: Sam G. Nissan
  Date  : 09/06/2024
  
  Revision: V1
  
 */

package Capture_Grade_Statistics;

import java.util.Scanner;

public class Grades {
	
	public static void main(String [] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); // creating "input: as an object Scanner to get user input
		
		double   tot = 0;          //total variable. This variable is needed to compute the average
		double   max = 0;         //maximum variable 
		double   min = 1000;     // minimum variable 
		double   ave = 0;       // average variable 

	    int stuNum;           // a variable for number of student. This variable is needed to compute the average and to limit the max iteration for FOR-LOOP. 
	    double grade;        //  a variable for store student's grade
	    char userYes;       //   a variable to decide whether to continue or to exit 
	    
	    
		System.out.println("This application will ask the teacher to enter number of students and their grades in the class.\r\n"
				+ "The application will provide important statistics for the grades of students in the class ");
		
		System.out.println("The application will average the entered grades, segregate the maximum & minimum grade in\r\n"
				+ "the class and finally provide total number of all grades.");
		
		System.out.println(""); //for spacing 
		
		System.out.print("Do you want to continue? Type Yes or No to exit: ");
		userYes = input.next().charAt(0);
		
		System.out.println(""); //for spacing
		
		if(userYes =='y' || userYes == 'Y'){
			System.out.print("Please enter the number of studnets in the class: ");
            stuNum = input.nextInt();
            
            System.out.println(" "); //Spacing
            
          //Starting For-loop
            for(int i = 1; i <= stuNum;) {   
            	          	
              System.out.print(" Enter grad for student number " + i + " :");
              grade = input.nextDouble();
              
              tot = tot + grade;  //to sum the total grades
              
            //If Statement for Max
              if(max < grade) {
            	  
            	  max = grade;  //assign grade to max
            	  
              } // End of If statement for Max
              
              //If Statement for Min
              if(min > grade) {
            	  
            	  min = grade;  //assign grade to Min 
            	  
              } //End of If statement for Min
              
              ave = tot /stuNum; // This line to calculate the average grade in the class.
                             
              ++i; //Loop Control (increment) to prevent infinite looping. 
              
            }//End of For-loop
                                 
            
            System.out.println(" "); //Spacing 	
    		System.out.println("------------------------------------------------------------------ ");
    		System.out.println("The Average grade for the class  is: "  + String.format("%.2f", ave));     //Average
    		System.out.println("The Maximum grade in the  class  is: "   + String.format("%.2f", max));    //Maximum
    		System.out.println("The Minimum grade in the  class  is: "   + String.format("%.2f", min));   //Minimum
    		System.out.println(" "); //Spacing
    		System.out.println("------------------------------------------------------------------ "); 
    		System.out.println("The total grades for all students is: " + String.format("%.2f", tot));  //Total
            
		} //End of IF Statement. 
  
		
		else {   System.out.println("You selected No. The program will exit.\r\n"
		   		+ "..Good Bye"); 
		} // End of Else Statement 	
		
	} //End of main method;	
} //End of Grades Class

