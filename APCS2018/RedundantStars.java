/* Earl Bergquist, Garfield High School
   INSTRUCTIONS: Reduce redundancy using parameters and less Methods
	of the Code below.
	Taken from BJP Presentation for Parameters
*/

public class RedundantStars {
    public static void main(String[] args) {
      printLine(13);
      printLine(7);
      printLine(35);
      printBox(10, 3);
      printBox(5, 4);
    }
    
    public static void printLine(int number) 
      for (int i = 1; i <= number; i ++) {
         System.out.print("*");
      }
      System.out.println();
      System.out.println();
    }

   public static void printBox(int width, int height) {
      for(int j = 1; j <= width; j++) {
 			System.out.print("*");
 		}
 		System.out.println();
 		
 		for (int i = 1; i <= height - 2; i++) {
 			System.out.print("*");
 			for(int j = 1; j <= width - 2; j++) {
 				System.out.print(" ");
 			}
 			System.out.println("*");
 		}
 		
 		for(int j = 1; j <= width; j++) {
 			System.out.print("*");
 		}
      System.out.println();
      System.out.println();
 	}
 
 	// public static void printBox10x3() {
//  		for(int j = 1; j <= 10; j++) {
//  			System.out.print("*");
//  		}
//  		System.out.println();
//  		
//  		for (int i = 1; i <= 1; i++) {
//  			System.out.print("*");
//  			for(int j = 1; j <= 8; j++) {
//  				System.out.print(" ");
//  			}
//  			System.out.println("*");
//  		}
//  		
//  		for(int j = 1; j <= 10; j++) {
//  			System.out.print("*");
//  		}
//  		System.out.println();
//  	}
//  	
//  	public static void printBox5x4() {
// 		for(int j = 1; j <= 5; j++) {
// 			System.out.print("*");
// 		}
// 		System.out.println();
// 		
// 		for (int i = 1; i <= 2; i++) {
// 			System.out.print("*");
// 			for(int j = 1; j <= 3; j++) {
// 				System.out.print(" ");
// 			}
// 			System.out.println("*");
// 		}
// 		
// 		for(int j = 1; j <= 5; j++) {
// 			System.out.print("*");
// 		}
// 		System.out.println();
// 	}
}