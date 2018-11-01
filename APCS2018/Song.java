/* Name: Madeleine Clore
Date: 20 September, 2018
Assignment: Song.java
Description: Use println and methods to print song and eliminate redundancies */

public class Song {
   public static void main(String [] args) {
      writeAllVerseOne();
      writeAllVerseTwo();
      writeAllVerseThree();
      writeAllVerseFour();
      writeAllVerseFive();
      writeAllVerseSix();
   
   }
   
   public static void writeAllVerseOne() { //prints all of verse 1
      writePartOne();
      writePartTwo();
   }
   
   public static void writePartOne() { //prints first 2 lines
      System.out.println("Hey homies, my code is gonna rock this place" +
                          "\nWith a method named main and a curly brace");
   }
   
   public static void writePartTwo() { //prints last 2 lines of first verse
      System.out.println("I put a semicolon at the end of each line" +
                           "\nYou haters never seen code that looked so fine");
      System.out.println();
   }
   
   public static void writeAllVerseTwo() { //prints all of verse 2
      writePartOne();
      writePartThree();
      writePartTwo();
   }
   
   public static void writePartThree() { //prints 2 new lines of verse 2
      System.out.println("jGrasp loves my code, no need to debug" +
                          "\nI can rap in Java until it unplug");
   }
     
   public static void writeAllVerseThree() { //prints all of verse 3
      writePartOne();
      writePartFour();
      writePartThree();
      writePartTwo();
   }
   
   public static void writePartFour() { //prints the 2 new lines of the third verse
      System.out.println("The first time I try, my code compiles" +
                        "\nLost a point for style cause my comments are vile");
   }
   
   public static void writeAllVerseFour() { //prints all of verse 4
      writePartOne();
      writePartFive();
      writePartFour();
      writePartThree();
      writePartTwo();
   }
   
   public static void writePartFive() { //prints the 2 new lines of the fourth verse
      System.out.println("Got help from Ms. Martin and it was swell" +
                         "\nBut I didn't need it cause I code so well");
   }
   
   public static void writeAllVerseFive() { //prints all of verse 5
      writePartOne();
      writePartSix();
      writePartFive();
      writePartFour();
      writePartThree();
      writePartTwo();
   }
   
   public static void writePartSix() { //prints 2 new lines from fifth verse
      System.out.println("I got full credit on external correctness" +
                         "\nHey playa check this, my code eats yours for breakfast");
   }
   
   public static void writeAllVerseSix() { //prints all of verse 6
      writePartOne();
      writePartSeven();
      writePartSix();
      writePartFive();
      writePartFour();
      writePartThree();
      writePartTwo();
   }
   
   public static void writePartSeven() { //prints own original lines for verse 6
      System.out.println("I put some statements in a method" +
                         "\nSo my code could be intrepid");
   }
}