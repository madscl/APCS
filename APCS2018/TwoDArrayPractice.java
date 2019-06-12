import java.io.*;
import java.util.*;

public class TwoDArrayPractice {
   public static void main(String[] args)
   throws FileNotFoundException {
      
      //scanner to read file
      Scanner input = new Scanner(new File("homer.txt"));
      int rows = input.nextInt();
      int cols = input.nextInt();
      //creates 2D array
      int[][] pic = new int[rows][cols];   
      fillArray(pic, rows, cols, input);
      displayArray(pic, rows, cols);
      System.out.println();
      displayFlippedHoriz(pic, rows, cols);
      System.out.println();
      displayFlippedVert(pic, rows, cols);
   }
   
   public static void fillArray(int pic[][], int rows, int cols, Scanner input) {
   //for loop to add the numbers from the text file to a 2D array
      for(int row = 0; row < rows; row++) {
         for(int col = 0; col < cols; col++) {
            pic[row][col] = input.nextInt();
         }
      }   
   }
   
   public static void displayArray(int pic[][], int rows, int cols) {
   //for loop to go through the 2D array to print the array as characters   
      for(int row = 0; row < rows; row++) {
         for(int col = 0; col < cols; col++) {
            //gets int at row and col
            int temp = pic[row][col];
            //casts to char to print out the image
            System.out.print((char) temp);
         }
         System.out.println();
      }
   }
   
   public static void displayFlippedHoriz(int pic[][], int rows, int cols) {
      for(int row = 0; row < rows; row++) {
         for(int col = cols - 1; col >= 0; col--) {
            int temp = pic[row][col];
            System.out.print((char) temp);
         }
         System.out.println();
      }
   }
   
   public static void displayFlippedVert(int pic[][], int rows, int cols) {
      for(int row = rows - 1; row >= 0; row--) {
         for(int col = 0; col < cols; col++) {
            int temp = pic[row][col];
            System.out.print((char) temp);
          }
          System.out.println();
       }
   }
}