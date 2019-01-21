/*Name: Madeleine Clore
Date: 13 December, 2018
Assignment: NameGenerator.java
Description: use string methods and input to generate a name with a 
             random aspect*/

import java.util.*;

public class NameGenerator {
   public static void main(String[] args) {
      
      Scanner console = new Scanner(System.in);
   
      printIntro();
      //loops program until user says to stop
      do {
         createName(console);
      } while(isUserDone(console) == false);
      System.out.print("\nThank you. Good bye.");            
   }
   
   //prints introduction introducing program
   public static void printIntro() {
      System.out.println("This program will give you your cat name \n");
   }
   
   //takes input from user to generate name
   public static String takeInput(Scanner console) {
      System.out.print("Your first name: ");//change to pig latin, determines adjective
      String firstName = console.next();
      System.out.print("Your last name: ");//write backwards
      String lastName = console.next();
      System.out.print("Choose a number (1-3): ");//choose 1-3 for prefix
      int prefix = console.nextInt();
      String beginning = createBeginning(prefix);
      String adjective = createAdjective(firstName);
      firstName = changeFirstName(firstName);
      lastName = changeLastName(lastName);
      String result = adjective + " " + beginning + " " + firstName + " " + lastName;
      return result;
   }
   
   /*generates the random aspect of the name generator
     depending on the value, the name generates a different cat breed*/
   public static String generateRandom() {
      int rand = (int) (Math.random() * 10 + 1); 
      String breed = ""; 
      if(rand == 1) {
         breed = "Persian";
      } else if(rand == 2) {
         breed = "Scottish Fold";
      } else if(rand == 3) {
         breed = "Ragdoll";
      } else if(rand == 4) {
         breed = "Munchkin";
      } else if(rand == 5) {
         breed = "Siberian";
      } else if(rand == 6) {
         breed = "Himalayan";
      } else if(rand == 7) {
         breed = "Siamese";
      } else if(rand == 8) {
         breed = "Maine Coon";
      } else if(rand == 9) {
         breed = "Ragamuffin";
      } else {
         breed = "Manx";
      } 
      return breed;  
   }
   
   //adds prefix based on number selected (1-3)
   public static String createBeginning(int prefix) {
      String beginning = "";
      if(prefix == 1) {
         beginning = "Princess";
      } else if(prefix == 2) {
         beginning = "Sir";
      } else {
         beginning = "Mister";
      }
      return beginning;
   }

   //adds adjective based on length of name entered
   public static String createAdjective(String fName) {
      String adjective = "";
      if(fName.length() < 5) {
         adjective = "Fluffy";
      } else {
         adjective = "Demonic";
      }
      return adjective;
   }
      
   //makes changes to the first name
   public static String changeFirstName(String fName) {
      String firstName = fName;
      firstName = firstName.toLowerCase();
      //turns the name into pig latin
      String endLetter = firstName.substring(0, 1);
      firstName = firstName.substring(1, firstName.length());
      endLetter = endLetter.toUpperCase();
      String firstLetter = firstName.substring(0,1);
      firstLetter = firstLetter.toUpperCase();
      firstName = firstName.substring(1, firstName.length());
      firstName = firstLetter + firstName + "Purr" + endLetter + "AY";
      return firstName;
   }
      
   //writes the last name backwards
   public static String changeLastName(String lName) {
      String lastName = lName;
      lastName = lastName.toLowerCase();
      String backwards = "";
      //takes the last name and writes it backwards
      for(int i = 0; i < lastName.length(); i++) {
         backwards += lastName.substring(lastName.length() - 1, lastName.length());
         lastName = backwards + lastName.substring(i, lastName.length() - 1);     
      }
      
      //capitalizes the new first letter
      String letter = backwards.substring(0,1);
      letter = letter.toUpperCase();
      lastName = backwards.substring(1, backwards.length());
      lastName = letter + lastName;
      return lastName;
   } 
   
   //generates the name
   public static void createName(Scanner console) {
      String name = takeInput(console);
      System.out.print("\nYour cat name is: \n");
      System.out.println(name + " the " + generateRandom() + " cat \n");
   } 
   
   //takes input to see if user is done
   public static boolean isUserDone(Scanner console) {
      System.out.print("Do you want to generate another name? (yes/no) ");
      String answer = console.next();
      if(answer.equalsIgnoreCase("yes")) {
         return false;
      } else {
         return true;
      }
   }  
}