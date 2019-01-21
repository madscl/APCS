/*Name: Madeleine Clore
Date: 11 January, 2019
Assignment: BabyNames.java
Description: Use file reading and graphics to tell the user how popular a 
             baby name was each year and to create a graph from the information*/
        
import java.awt.*;
import java.util.*;
import java.io.*;

public class BabyNames {
   public static final int YEAR = 1900;
   public static final int WIDTH = 60;
   public static void main(String[] args) 
      throws FileNotFoundException {
   
      Scanner input = new Scanner(new File("names.txt"));
      Scanner input2 = new Scanner(new File("meanings.txt"));
      Scanner console = new Scanner(System.in);
      
      String name = enterName(console);
      String nameData = findName(input, name);
      String nameMeaning = findName(input2, name);
      
      if(nameData.contains("found")) {
         System.out.println(nameData);
      } else {
         System.out.println(nameData);
         System.out.print(nameMeaning);
         DrawingPanel panel = new DrawingPanel(720, 560);
         Graphics g = panel.getGraphics();
         drawFixedGraphics(nameData, nameMeaning, g);
         drawDataGraphics(nameData, nameMeaning, g);
      }
   }
   
   //prints the introduction and promps the user for name
   public static String enterName(Scanner console) {
      System.out.println("This program graphs the popularity of a name" +
                       "\nin statistics recorded since the year " + YEAR + ".");
      System.out.println();
      System.out.print("Type a name: ");
      String name = console.next();
      return name;
   }
   
   //finds the name from the files
   public static String findName(Scanner input, String firstName) 
      throws FileNotFoundException {  	    	
      String name = firstName; 
      String line = "";
      boolean nameFound = false; 
      //runs through file to find name
      while (input.hasNextLine() && !nameFound) {
         String thisLine = input.nextLine();  
         String lineFirst = thisLine.substring(0, thisLine.indexOf(" "));
         if (lineFirst.equalsIgnoreCase(firstName)) {
            nameFound = true; 
            line = thisLine;
         }
      }
      String message = "";	
      //whether or not the name was found	
      if (line.length() == 0) {
         message = "\"" + name + "\"" + " not found.";
         return message;
      } 
      else {       
         return line;
      }
   }     
    
   //draws the fixed graphics 
   public static void drawFixedGraphics(String name, String meaning, Graphics g) {
           //draws the yellow bars at the top and bottom
      g.setColor(Color.YELLOW);
      g.fillRect(0, 530, 720, 30);
      g.fillRect(0, 0, 720, 30);
      
      /*draws the meaning at the top (fixed because it dosn't change
      when you enter the same name twice*/
      g.setColor(Color.BLACK);
      g.setFont(new Font("SansSerif", Font.BOLD, 16));
      g.drawString(meaning, 0, 16);
   }
      
   //draws graphics that change based class constant
   public static void drawDataGraphics(String name, String meaning, Graphics g) {      
      //removes the name from the list of numbers
      name = name.substring(name.indexOf(" "));
      //creates scanner out of line
      Scanner scan = new Scanner(name);
      int i = 0;
      int data = 0;
      //reads through scanner for the ints
      while(scan.hasNextInt()) {
         g.setColor(Color.BLACK);
         //draws the decades at the bottom
         g.drawString("" + (YEAR + (i * 10)), i * WIDTH, 546);
         g.setColor(Color.RED);
         data = scan.nextInt();
         //if data is 0 then it doesn't draw the box and uses different equations
         if(data == 0) {
            g.setColor(Color.BLACK);
            g.drawString("" + data, i * WIDTH, 530);
         } else {
            g.fillRect(i * WIDTH, 30 + (data / 2), WIDTH / 2, (1000 - data) / 2);
            g.setColor(Color.BLACK);
            g.drawString("" + data, i * WIDTH, 30 + (data / 2));
         }         
         i++;
      }      
   }
}