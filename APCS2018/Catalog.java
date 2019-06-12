/*Name: Madeleine Clore
Date: 5 April, 2019
Assignment: ShoppingCart objects
Description: Use array lists and objects with a "has a" relationship
              between classes instead of an "is a" relationship*/
      
import java.util.*; //imports array lists

//creates an array list of items created
public class Catalog {

   private String name;
   private ArrayList<Item> itemList;

   //creates an array list
   public Catalog(String name) {
      this.name = name;
      itemList = new ArrayList<Item>();
   }
   
   //adds items to the array list
   public ArrayList<Item> add(Item item) {
      itemList.add(item);
      return itemList;
   }
   
   //gets the size of the array list
   public int size() {
      return itemList.size();
   }
    
   //returns the item at the given index    
   public Item get(int index) {
      return itemList.get(index);
   }
    
   //returns the name of the catalog created
   public String getName() {
      return name;
   }
   
   //allows you to print the catalog (added for testing)
   public String toString() {
      return name + ": " + itemList;
   }
}