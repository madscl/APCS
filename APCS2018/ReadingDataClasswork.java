import java.util.*;
import java.io.*;


public class ReadingDataClasswork {
   public static void main(String[] args) 
      throws FileNotFoundException {
      
      //easy();
      //grocery();
      collapseSpaces();
   }
   
   public static void easy()
      throws FileNotFoundException {
      Scanner input = new Scanner(new File("pr21.dat"));
      int num = 0;
      for(int i = 0; i < 4; i++) {
         num = input.nextInt();
         for(int j = 0; j < num; j++) {
            System.out.println("EASY");
         }
         System.out.println();
      }
   }
   
   //first problem from classwork
   public static void grocery() 
      throws FileNotFoundException {
      Scanner input = new Scanner(new File("grocery.dat"));
      int num = input.nextInt();
      for(int i = 0; i < num; i++) {
         String item = input.next();
         if(item.startsWith("S")) {
            item = "-" + item + "-";
            System.out.println(item);
         } else {
            System.out.println(item);
         } 
      }   
   }
   
   //sixth problem from classwork
   public static void collapseSpaces()
      throws FileNotFoundException {
      Scanner input = new Scanner(new File("CollapseSpaces.txt"));
      while(input.hasNextLine()) {
         String line = input.nextLine();
         Scanner lineScan = new Scanner(line);
         String temp = "";
         while(lineScan.hasNext()) {
            temp = lineScan.next();
            System.out.print(temp + " ");
         }
         System.out.println();
      }
   }
   
   //how to enter #6 on practice it
   // public static void collapseSpaces(Scanner input) {
//        while(input.hasNextLine()) {
//          String line = input.nextLine();
//          Scanner lineScan = new Scanner(line);
//          String temp = "";
//          while(lineScan.hasNext()) {
//             temp = lineScan.next();
//             System.out.print(temp + " ");
//          }
//          System.out.println();
//       }
//  }
}
   



   
