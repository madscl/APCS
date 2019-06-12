/*Name: Madeleine Clore
Date: 5 April, 2019
Assignment: ShoppingCart objects
Description: Use array lists and objects with a "has a" relationship
              between classes instead of an "is a" relationship*/
              
import java.util.*;//imports array lists

//an object representing a list of unique item orders; the item type is the criterion 
//that defines uniqueness
public class ShoppingCart {

   private ArrayList<ItemOrder> cart;//null array list for item orders
   private boolean value;//boolean for discount
   
   //creates an array list of item orders
   public ShoppingCart() {
      cart = new ArrayList<ItemOrder>();
   }
   
   //adds an item order to the array list
   public void add(ItemOrder newOrder) {
      int i = 0;
      boolean replace = false;
      boolean done = false;
      //adds an item order to the array list if it's empty (necessary 
      //to enter the while loop)
      if(cart.size() == 0) {
         cart.add(newOrder);
      } else {
         //determines if an item order is already in the array list and 
         //if it is, the item order is replaced
         String temp = newOrder.getItem();
         while(!replace && !done) { 
            System.out.println(cart.get(i).getItem().equals(temp));
            //determines if the item at the index of the item order matches
            //the item of the new item order
            if(cart.get(i).getItem().equals(temp)) {
               cart.set(i, newOrder);
               //set to true so it leaves the while loop
               replace = true;
            } 
            i++;
            //if the while loop goes through the entire array and replace isn't
            //true, done is set to true so the while loop ends
            if(i == cart.size()) {
               done = true;
            }
         }
         //adds the new item order if the same item hasn't been found in the array
         //list and if it has gone through the entire array list
         if(!replace && done) {
            cart.add(newOrder);
         }
      }
   }
   
   //sets whether the 10% discount is applied
   public void setDiscount(boolean value) {
      this.value = value;
   }
   
   //returns the total price of the shopping cart
   public double getTotal() {
      double totalCost = 0;
      //ItemOrder temp = new ItemOrder
      for(int i = 0; i < cart.size() - 1; i++) {
         totalCost += cart.get(i).getPrice();
      }
      //applies the discount
      if(value == true) {
         totalCost = (totalCost / 10.0) * 9.0;
      }
      return totalCost;
   }
   //allows you to print the shopping cart (added for testing)
   public String toString() {
      return "" + cart;
   }
}