/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import java.util.Scanner;

/*
Create a Java application called LeapYear to calculate whether a year is a 
leap year (i.e. 366 days).  Usually years that are divisible by 4 are leap years,
for example 1996.  However, years that are divisible by 100 (for example, 1900) 
are not leap years, but years that are divisible by 400 are leap years (for 
example, 2000).  Write a program that asks the user for a year and outputs 
whether the year is a leap year.  


Use a do while loop to get input with a sentinel of 0
*/
public class LeapYear {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //int x;  // store characters  le
       // int y; //store numbers
       // int z; //store capital letters
        int length = 0;						// Stores the number characters in the password
		int numCount = 0;					// Variable used to store numbers in the password
		int capCount = 0;
        getWelcome();
        getLines();
        
        do {
        System.out.println("Enter a year and I will tell you if it is a leap "
                    + "year");
        System.out.println("          Enter 0 to exit the program:");
        getLines();
        x = scnr.nextInt();
        if (int x =0; x < Password.y(); x++) {
        if (getLeapYear(x)) {
        System.out.println("The year " + x + " is a leap year!");
        getLines();
                   // System.out.println("Do you want to continue? ");
                   // System.out.println("Enter 0 to exit the program");
        } else {
        System.out.println(x);
        System.out.println("The year " + x + " is not a leap year");
        getLines();
                }
            }
        } while (x != 0);
        System.out.println("Goodbye!");
        
       /* public static boolean authenticate(String password){
        boolean authenticated = false;
        String actualPassword = "Test1PW";
        authenticated = actualPassword.equals(password);
        return authenticated; */
        
    }
public static boolean getLeapYear(int x) {
    //have to use return since void is not in this method
    return 4 / x == 0;
    }
public static void getWelcome(){
        System.out.println("Welcome to the program");
    }
    
public static void getLines(){
        System.out.println("-----------------------------------------------------");
    }
}
