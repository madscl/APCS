import java.util.*;

public class ArraysMysteries {
   public static void main(String[] args) {
      String[] deck = new String [52];
      makeDeck(deck);
      System.out.println(Arrays.toString(deck));
      shuffleDeck(deck);
      System.out.println(Arrays.toString(deck));	
   }
   
   //number 3
   public static boolean allLess(int[] num, int[] array) {
      if(num.length != array.length) {
         return false;
      }
      int i = 0;
      for(int x: num) {
         if(x >= array[i]) {
            return false;
         }
         i++;
      }
      return true;
   } 
   
   //4
   public static void makeDeck(String[] deck){
      String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
      String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                      "Jack", "Queen", "King", "Ace"};
      int i = 0;
      for(String x: rank) {
         for(String y: suit) {
            deck[i] = x + " of " + y;
            i++;
         } 
      }
   }
	
   //5
   public static void shuffleDeck(String[] deck){
      int i = 52;
      int index = 0;
      String[] newDeck = new String[52];
      String temp = "";
      for(String x: deck) {
          index = (int) (Math.random() * i);
          newDeck[i - 1] = deck[index];
          temp = deck[i - 1];
          deck[i - 1] = deck[index];
          deck[index] = temp;
          i--; 
       }
       deck = Arrays.copyOf(newDeck, 52);
   }                 
}
