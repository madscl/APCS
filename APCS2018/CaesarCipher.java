import java.util.*;

public class CaesarCipher {
   public static void main(String[] args) {
      
      Scanner console = new Scanner(System.in);
      
      createCode(console);
      
   }
   
   public static void createCode(Scanner console) {
      System.out.print("Your secret message: ");
      String message = console.nextLine();
      message = message.toLowerCase();
      System.out.print("Your secret key: ");
      int key = console.nextInt();
      
      String encodedMessage = "";    
      for(int i = 0; i < message.length(); i++) {
         char letter = message.charAt(i);
         if(letter == 32) {
            encodedMessage += letter;
         } else {
            letter = (char) ((letter + key - 97) % 26 + 97);
            encodedMessage += letter;
         }
                   
      }
      
      
      System.out.print("The encoded message: " + encodedMessage);
      
   }
}