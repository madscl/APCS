import java.util.*;

public class FencePostAndWhileLoop {
   public static void main(String[] args) {
      
      Scanner console = new Scanner(System.in);
      
      //printLetters("");
      
      //printAverage(console);
      
      makeGuesses();
      
   }
   
   //5.12 Practice-It
   public static void printLetters(String text) {
      if(text.equals("")) {
         System.out.print("");
      } else {
         System.out.print(text.substring(0, 1));
         for(int i = 1; i < text.length(); i++) {
            System.out.print("-" + text.charAt(i));
         }
      }
      System.out.println();
   } 
   
   //5.12 Practice-It
   public static void printAverage(Scanner console) {
      double sum = 0;
      System.out.print("Type a number: ");
      int number = console.nextInt();
      int divisor = 0;
      if(number >= 0) {
         while(number >= 0) {
            sum += number;
            divisor += 1;
            System.out.print("Type a number: ");
            number = console.nextInt();
         }
         System.out.print("Average was " + (double) (sum / divisor));
      }
   }
   
   //5.6 Practice-It
   public static void makeGuesses() {
      int guess = (int) Math.random() * 40;
      System.out.print("guess = " + guess);
      while(guess < 48) {
         guess = (int) Math.random() * 40;
         System.out.print("guess = " + guess);
      }
   }
}