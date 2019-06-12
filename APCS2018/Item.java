/*Name: Madeleine Clore
Date: 5 April, 2019
Assignment: ShoppingCart objects
Description: Use array lists and objects with a "has a" relationship
              between classes instead of an "is a" relationship*/
       
import java.text.*;//gets formatter to format the price

//creates an object for sale with a price and optionally a bulk price
public class Item {
   
   private String name; //name of the item
   private double price; //price of the item
   private int bulkQuantity = 0;//how many items to qualify for bulk price
   private double bulkPrice;//what the price of the bulk quantity is
   
   //creates a new object with the name and its price and throws an
   //exception if the price is negative
   public Item(String name, double price) {
      this.name = name;
      this.price = price;
      if(price < 0) {
         throw new IllegalArgumentException("The price can't be negative");
      }
   }
   
   //creates a different object if it is bought in bulk
   public Item(String name, double price, int bulkQuantity, double bulkPrice) {
      this.name = name;
      this.price = price;
      if(price < 0) {
         throw new IllegalArgumentException("The price can't be negative");
      }
      this.bulkQuantity = bulkQuantity;
      this.bulkPrice = bulkPrice;
      if(bulkPrice < 0) {
         throw new IllegalArgumentException("The bulk price can't be negative");
      }
   }
   
   //calculates the price for number of items and returns the number
   //as a double
   public double priceFor(int quantity) {
      double totalPrice = 0.0;
      //throws exception if the quantity entered is negative
      if(quantity < 0) {
         throw new IllegalArgumentException("The quantity can't be negative");
      }
      //calculates price if the item has a bulk price
      if(bulkQuantity > 0) {
         int onlyBulk = quantity / bulkQuantity;
         int remainder = quantity % bulkQuantity;
         totalPrice = onlyBulk * bulkPrice;
         totalPrice += remainder * price;
         return totalPrice;
      //calculates the price for items that don't have a bulk price
      } else {
         totalPrice = quantity * price;
         return totalPrice;
      }
   }
   
   //allows println to work and prints the item with price
   public String toString() {
      //formats the price as 2 decimals and a dollar sign
      NumberFormat nf = NumberFormat.getCurrencyInstance();
      String text = nf.format(price);
      //determines whether to print item or bulk item
      if(bulkQuantity > 0) {
         String bulkText = nf.format(bulkPrice);
         return name + ", " + text + " (" + bulkQuantity + " for " + bulkText + ")";
      } else {
         return name + ", " + text;
      }
   }
}