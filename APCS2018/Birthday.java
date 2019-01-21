/*Name: Madeleine Clore
Date: 21 November, 2018
Assignment: Birthday.java
Description: use if/else statements, returns, Scanners and cumulative sums 
to calculate days until next birthday*/

import java.util.*;

public class Birthday {
   public static void main(String[] args) {
      
      Scanner console = new Scanner(System.in);
      
      printIntro();
                        
      System.out.println("Please enter today's date:");
      int absoluteCurrentDay = askDate(console);
      
      System.out.println("Please enter your birthday:");
      int absoluteBirthdayDay = askDate(console);
      
      calculateDaysUntilBirthday(absoluteCurrentDay, absoluteBirthdayDay);
      
      printFunFact();  
   }
   
   //prints the introduction of the program
   public static void printIntro() {
      System.out.println("This program tells you how many days" +
                         "\nit will be until your next birthday.");
      System.out.println();
   }
   
   //changes prompt for inputting day 
   public static int calculateDaysInMonth(int month) {
      if(month == 2) {
         return 28;
      } else if(month == 4 || month == 6 || month == 9 || month == 11) {
         return 30;
      } else {
         return 31;
      }
   } 
   
   //takes input for month 
   public static int askDate(Scanner console) {
      System.out.print("What is the month (1-12)? ");
      int month = console.nextInt();
            
      int daysInMonth = calculateDaysInMonth(month);
      
      System.out.print("What is the day   (1-" + daysInMonth + ")? ");
      int day = console.nextInt();
      
      int absoluteDate = calculateAbsoluteDate(month, day);
      
      System.out.println(month + "/" + day + " is day #" + absoluteDate + " of 365.");
      System.out.println();
      
      return absoluteDate;
   }
      
   //calculates absolute value of day
   public static int calculateAbsoluteDate(int month, int day) {
      int absoluteDay = 0;
      for(int i = 1; i < month; i++) {//sum of the days in month up to month entered
         if(i == 2) {
            absoluteDay += 28;
         } else if(i == 4 || i == 6 || i == 9 || i == 11) {
            absoluteDay += 30;
         } else {
            absoluteDay += 31;
         }
      }
      absoluteDay += day;
      return absoluteDay;
   } 
   
   //calculates how many days until next birthday
   public static void calculateDaysUntilBirthday(int currentDay, int birthday) {
      int daysUntilBirthday = 0;
      if(birthday > currentDay && birthday - currentDay != 1) {
         daysUntilBirthday = birthday - currentDay;
         System.out.println("Your next birthday is in " + daysUntilBirthday + " days.");
         System.out.println();
      } else if(currentDay > birthday) {
         daysUntilBirthday = (365 - currentDay) + birthday;
         System.out.println("Your next birthday is in " + daysUntilBirthday + " days.");
         System.out.println();
      } else if(birthday - currentDay == 1) {
         System.out.println("Wow, your birthday is tomorrow!");
         System.out.println();
      } else {
         System.out.println("Happy birthday!");
         System.out.println();
      } 
   } 
   
   //prints out birthday fun fact for january 5th
   public static void printFunFact() {
      System.out.print("Did you know that on January 5th, 1933," +
                       "\nthe construction of the Golden Gate Bridge began?");
   }  
}   