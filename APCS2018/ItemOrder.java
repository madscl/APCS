/*Name: Madeleine Clore
Date: 5 April, 2019
Assignment: ShoppingCart objects
Description: Use array lists and objects with a "has a" relationship
              between classes instead of an "is a" relationship*/
     
//an object representing the purchase of a quantity of an item    
public class ItemOrder {

   private Item item;
   private int quantity;
   
   //creates an item order of an item already created
   public ItemOrder(Item item, int quantity) {
      this.item = item;
      this.quantity = quantity;
   }
   
   //returns the price of the item order
   public double getPrice() {
      double price = this.item.priceFor(quantity);
      return price;
   }
   
   //returns the name of the item used in the item order
   public String getItem() {
      String order = item.toString();
      return order;
   }
   
   //allows you to print the item order (added for testing)
   public String toString() {
      return quantity + " of " + item;
   }
}