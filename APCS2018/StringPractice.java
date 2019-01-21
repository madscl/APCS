public class StringPractice {
   public static void main(String[] args) {
      //padString("hello", 8);
      vertical("hey now"); 
   }
   
   public static void padString(String word, int num) {
      String padWord = "";
      for(int i = 0; i < num - word.length(); i++) {
         padWord += " ";
      }
      padWord += word;
      System.out.print(padWord);
         
   }
   
   public static void vertical(String word) {
      for(int i = 0; i < word.length(); i++) {
         char letter = word.charAt(i);
         System.out.println(letter);
      }
   }
}