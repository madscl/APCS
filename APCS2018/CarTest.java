public class CarTest {
   public static void main(String[] args) {
      //test1();  
      //test2();
      //test3();
      //test4();
      //test5();
   }
   
   public static void test1() {
        /*0 miles per gallon, 20,000 miles
        and 15 gallon tank (no gas in tank)*/
      Car myHybrid = new Car(50, 20000, 15); 
      myHybrid.addGas(15); // pump 15 gallons of gas
      myHybrid.drive(100); // drive 100 miles
      double gasLeft = myHybrid.getGasInTank(); // get gas remaining in tank
      System.out.println(gasLeft);
   }
   
   //this test exceeds how much gas you can put in the tank
   public static void test2() {
      Car myTesla = new Car(50, 100000, 20);
      myTesla.addGas(25);//more gas than the tank can hold
      myTesla.drive(100);
   }
   
   //this test exceeds the distance you can drive the amount of gas
   public static void test3() {
      Car mySubaru = new Car(50, 100000, 10);
      mySubaru.addGas(5);
      //uses too much gas
      mySubaru.drive(1000);
   }
   
   //this test has a negative efficiency which doesn't work because as you drive fuel would be generated
   public static void test4() {
      Car myHonda = new Car(-50, 10000, 10);
   }
   
   //this test has a negative capacity because the car needs to be able to hold fuel
   public static void test5() {
      Car myToyota = new Car(50, 100000, -10);
   }
}