/*Name: Madeleine Clore
Date: 5 October, 2018
Assignment: Spaceneedle.java
Description: Print space needle using for loops and class constant to make it different sizes*/

public class SpaceNeedle {
   public static final int SIZE = 7;
   public static void main(String[] args) {
      drawEntireTop();
      drawEntireBottom();
   }
   
   //prints the vertical line at top of needle
   public static void drawVerticalLine() {
      for (int i = 1; i <= SIZE; i++){//prints SIZE rows
         for (int j = 1; j <= SIZE * 3; j++) {//prints spaces before line
            System.out.print(" ");
         }
         System.out.print("||");
         System.out.println();
      }
   }
   
   //prints the top half of the needle  
   public static void drawTopHalf() { 
      for (int i = 1; i <= SIZE; i++) {//creates SIZE rows
         for (int j = 1; j <= -3 * i + (SIZE * 3); j++) {//creates spaces before top
            System.out.print(" ");
         }
         System.out.print("__/");
         for (int j = 1; j <= 3 * i - 3; j++) {//makes : increase by 3 each time
            System.out.print(":");
         }
         System.out.print("||");
         for (int j = 1; j <= 3 * i - 3; j++) {//makes : increase by 3 on other side
            System.out.print(":");
         }
         System.out.print("\\__");
         System.out.println();
      }
      System.out.print("|");
      for (int i = 1; i <= SIZE * 6; i ++) {//prints quotation mark line
      System.out.print("\"");
      }
      System.out.print("|");
      System.out.println();
   }
   
   //prints the bottom half of the needle
   public static void drawBottomHalf() {
      for (int i = 1; i <= SIZE; i++) {//creates SIZE rows
         for (int j = 1; j <= 2 * i - 2; j++) {//makes spaces increase by 2
            System.out.print(" ");
         }
         System.out.print("\\_");
         for (int j = 1; j <= -2 * i + (SIZE * 3 + 1); j++) {//makes /\ pattern decrease by 2
            System.out.print("/\\");
         }
         System.out.print("_/");
         System.out.println();
      }  
   }
   
   //prints the middle section
   public static void drawMiddleSection() {
      for (int i = 1; i <= SIZE * SIZE; i++) {//creates SIZE rows
         for (int j = 1; j <= 2 * SIZE + 1; j++) {//creates spaces before middle section
            System.out.print(" ");
         }
         System.out.print("|");
         for (int j = 1; j <= SIZE - 2; j++) {//makes % in middle section scaleable
            System.out.print("%");
         }
         System.out.print("||");
         for (int j = 1; j <= SIZE - 2; j++) {//makes % scaleable
            System.out.print("%");
         }
         System.out.print("|");
         System.out.println();
      }    
   }
   
   //prints the entire top
   public static void drawEntireTop() {
      drawVerticalLine();
      drawTopHalf();
      drawBottomHalf();
   }
   
   //prints entire bottom
   public static void drawEntireBottom() {
      drawVerticalLine();
      drawMiddleSection();
      drawTopHalf(); 
   }
}
   