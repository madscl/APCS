/* Demonstrates List Sort order for your Weight Object which must include the 
   Comparable Interface.  YOU SHOULD NOT NEED TO CHANGE THIS CODE, but you can
   Play with the weight values if you like...  
   Earl Bergquist - Garfield APCS March 2015, 
*/

import java.util.*;
public class WeightClient {
   public static void main(String[] args) {
   	
      Weight a = new Weight(1, 18);
      Weight b = new Weight(11, 13);
      Weight c = new Weight(1, 14);
      Weight d = new Weight(2, 1);     
   	
      ArrayList<Weight> items = new ArrayList<Weight>();
      items.add(a);
      items.add(b);
      items.add(c);
      items.add(d);
      items.add(new Weight(6, 32)); // could have done this for all of them
      
      System.out.print("Unsorted ArrayList item: ");
      System.out.println(items);
      
      Collections.sort(items);  // Key Collections Method sort
      System.out.print("& Sorted ArrayList item: ");
      System.out.println(items);
   }
}