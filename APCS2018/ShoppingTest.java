/*Name: Madeleine Clore
Date: 5 April, 2019
Assignment: ShoppingCart objects
Description: Use array lists and objects with a "has a" relationship
              between classes instead of an "is a" relationship*/
        
public class ShoppingTest {
   public static void main(String[] args) {
         
      testItem();
      testBulkItem();
      testCatalog();
      testItemOrder();
      testShoppingCart();
      //testPriceError(); 
      //testQuantityError(); 
      //testCatalogError();
   }  
   
   //tests creating a functional item and printing it and priceFor
   public static void testItem() {
      Item cube = new Item("Rubik's cube", 9.10);
      System.out.println(cube);
      System.out.println(cube.priceFor(150));
      System.out.println();   
   } 
   
   //tests creating a functional bulk item and printing it and priceFor
   public static void testBulkItem() {
      //tests if the priceFor calculates the correct price for an item that is
      //over the bulk quantity
      Item sillyPutty = new Item("silly putty", 3.95, 10, 19.99);
      System.out.println(sillyPutty);
      System.out.println(sillyPutty.priceFor(22));
      //tests if priceFor calculates the correct price for a quantity that is 
      //exactly bulk
      Item button = new Item("'Java Rules!' button", 0.99, 10, 5.00);
      System.out.println(button.priceFor(10));
      System.out.println();
   }
   
   //tests creating a catalog, adding items to it, printing the size, printing the item at an
   //index, and the name of the catalog
   public static void testCatalog() {
      //creates a catalog and adds both bulk and non bulk items
      Catalog list = new Catalog("Garfield CS Gift Catalog");
      list.add(new Item("silly putty", 3.95, 10, 19.99));
      list.add(new Item("Game of Life circuit", 3.50, 10, 14.95));
      list.add(new Item("bottle o bubbles", 0.99));
      //tests if size and get are functional
      System.out.println(list.size());
      System.out.println(list.get(1));
      System.out.print(list);
      //tests to make sure adding an item will update the catalog
      list.add(new Item("Nintendo Wii system", 389.99));
      System.out.println(list.size());
      System.out.println(list.get(3));
      System.out.println(list.getName());
      System.out.println(list);
      System.out.println();
   }
   
   //tests creating a new item order for an item that has a bulk price and an item that 
   //doesn't. Also tests getPrice and getItem for the item order
   public static void testItemOrder() {
      //creates a bulk item and tests its methods
      Item sillyPutty = new Item("silly putty", 3.95, 10, 19.99);
      ItemOrder sillyPutty2 = new ItemOrder(sillyPutty, 17);
      System.out.println(sillyPutty2.getPrice());
      System.out.println(sillyPutty2.getItem());
      //creates a non bulk item and tests its methods
      Item bubbles = new Item("bottle o bubbles", 0.99);
      ItemOrder bubbles2 = new ItemOrder(bubbles, 27);
      System.out.println(bubbles2.getPrice());
      System.out.println(bubbles2.getItem());
      System.out.println();
   }
   
   //test creating a shopping cart, changing the number of items, and getting the total
   //price
   public static void testShoppingCart() {
      //creates item orders for the shopping cart
      Item sillyPutty = new Item("silly putty", 3.95, 10, 19.99);
      ItemOrder sillyPutty2 = new ItemOrder(sillyPutty, 17);
      Item bubbles = new Item("bottle o bubbles", 0.99);
      ItemOrder bubbles2 = new ItemOrder(bubbles, 27);
      Item pen = new Item("Computer Science pen", 3.40);
      ItemOrder pen2 = new ItemOrder(pen, 15);
      //creates shopping cart
      ShoppingCart cart = new ShoppingCart();
      //adds items to shopping cart
      cart.add(bubbles2);
      cart.add(sillyPutty2);
      cart.add(pen2);
      //tests the total order with and without the discount
      System.out.println(cart.getTotal());
      cart.setDiscount(true);
      System.out.println(cart.getTotal());
      System.out.println(cart);
      cart.setDiscount(false);
      //tests replacing an item order with a different quantity
      bubbles2 = new ItemOrder(bubbles, 17);
      cart.add(bubbles2);
      System.out.println(cart.getTotal());
      System.out.println(cart);
      //tests adding a new item order to the arraylist
      Item button = new Item("'Java Rules!' button", 0.99, 10, 5.00);
      ItemOrder button2 = new ItemOrder(button, 2);
      cart.add(button2);
      System.out.println(cart.getTotal());
      System.out.println(cart);
      //tests changing the quantity of the item order
      button2 = new ItemOrder(button, 5);
      cart.add(button2);
      System.out.println(cart);
      System.out.println();
   }
       
   //tets creating an item with a negative price to see if it throws an exception
   public static void testPriceError() {
      Item wii = new Item("Wii", -389.99);
      System.out.println(wii);   
   }
   
   //tests getting the price for an item with a negative quantity
   public static void testQuantityError() {
      Item wii = new Item("Wii", 389.99);
      System.out.println(wii.priceFor(-10)); 
   }
   
   //tests getting an item order at an index that is outside the length
   //of the created array list
   public static void testCatalogError() {
      Catalog list = new Catalog("Garfield CS Gift Catalog");
      list.add(new Item("silly putty", 3.95, 10, 19.99));
      System.out.println(list.get(100));
   }

}