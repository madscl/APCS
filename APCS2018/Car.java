public class Car {
   
   private int efficiency; //miles per gallon
   private int miles;//how many miles the car has travelled
   private int capacity; //gallons
   private int fuel = 0;//start fuel
   
   public Car(int efficiency, int miles, int capacity) {
      this.efficiency = efficiency;
      if(efficiency < 0) {
         throw new IllegalArgumentException("You can't have negative efficiency");
      }
      this.miles = miles;
      this.capacity = capacity;
      if(capacity <= 0) {
         throw new IllegalArgumentException("You can't have a fuel tank that holds negative fuel");
      }
   }
   
   //based on the distance the user decides and the efficiency, gas is subtracted from fuel
   public void drive(int distance) {
      fuel = fuel - (distance / efficiency);
      if(fuel < 0) {
         throw new IllegalArgumentException("The distance consumed more gas than available" );
      }
   }
   
   public int getGasInTank() {
      return fuel;
   }
   
   public void addGas(int gas) {
      fuel += gas;
      if(fuel > capacity) {
         throw new IllegalArgumentException("You exceeded the capacity of the tank");
         }
   }
}