import java.util.*;

public class ArrayListPractice {
   public static void main(String[] args) {
   
   }
   
   //the second practice it - switch the values in pairs of 2 with each other
   //and if it's odd then the last one doesn't switch
   public static void switchPairs(ArrayList<String> list) {
      //ArrayList<String> list = list;
      String temp = "";
      for(int i = 0; i < list.size() - 1; i += 2) {
         temp = list.get(i);
         list.set(i, list.get(i + 1));
         list.set(i + 1, temp);
      }
   }
   
   //practice it #3 - add 4 asterisks before every string the length of 4
   public static void markLength4(ArrayList<String> list) {
      for(int i = 0; i < list.size();) {
         String temp = list.get(i);
         if(temp.length() == 4) {
            list.add(i, "****");
            i += 2;
         } else {
            i++;
         }
      }
   }
   
   //practice it #4 - remove all pairs if the first number in the pair is
   //larger than the second
   //if it's odd then remove the last number
   public static void removeBadPairs(ArrayList<Integer> list) {
      Integer temp = 0;
      int length = list.size();
      //checks to see if odd and removes the last value if it is
      if(length % 2 != 0) {
         list.remove(length - 1);
      }
      for(int i = 0; i < list.size() - 1;) {
         temp = list.get(i);
         if(temp > list.get(i + 1)) {
            list.remove(i);
            list.remove(i);
         } else {
            i += 2;
         }
      }
   }
}