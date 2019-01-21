import java.util.*;

public class PigLatin {
   public static void main(String[] args) {
   
      Scanner console = new Scanner(System.in);
      
      translatePigLatin(console);
   
   }
   
   public static void translatePigLatin(Scanner console) {
      System.out.print("Give me a word to translate to Pig Latin: ");
      String word = console.next();
      String endLetter = word.substring(0, 1);
      word = word.substring(1, word.length());
      endLetter = endLetter.toUpperCase();
      System.out.print("Your word is " + word + endLetter + "AY in Pig Latin!");
   }
}