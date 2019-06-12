/* Start of the Weight Object to get everyone up to speed on Interfaces...
Garfield HS AP CS, March 2015 with Mr. Bergquist
*/

/* What do we INSERT HERE so the Compiler knows that is
that Lists of this Object can be sorted? (make sure to 
include the <Weight> to make things easier later)  */

import java.util.*;

public class Weight implements Comparable<Weight> {
   private int ounces;
   private int pounds;

   public Weight(int pounds, int ounces){ // Constructor pounds then ounces
      if (pounds < 0 || ounces < 0)
         throw new IllegalArgumentException("Weight parameters cannot be negative");
      
      int addPounds = 0;
      int newOunces = 0;
      if(ounces > 16) {
         addPounds = ounces / 16;
         newOunces = ounces % 16;
      } else {
         newOunces = ounces;
      }
      this.pounds = addPounds + pounds;
      this.ounces = newOunces;
   // What if there are more than 15 ounces?  Add every 16 to the pounds!
   // INSERT CODE HERE or update the code above, it's good practice.
   }

   public int getPounds () { // Accessor to get the pounds
      return pounds;
   }

   public int getOunces () { // Accessor to get the ounces
      return ounces;
   }

   public String toString() {
      String weightString = "";
   // Let's make this look nice and make changes for plurals
      if (pounds > 1)
         weightString += pounds +  " lbs & ";
      else
         weightString += pounds +  " lb & ";        
      if (ounces > 1)
         weightString += ounces +  " ozs";
      else
         weightString += ounces +  " oz";
      return weightString;
   }

// Remove the Comment symbols and finish off the compareTo method
// Can you do it with one line?? (Besides the declaration)

   public int compareTo(Weight other) {
      return (this.getPounds() * 16 + this.getOunces()) - (other.getPounds() * 16 + other.getOunces());
   }


}