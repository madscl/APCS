public class StringQuizReview {
   public static void main(String[] args) {
   
      quadrant();
   }
   
   public static boolean hasMidpoint(int a, int b, int c) {
      if((a + b) / 2.0 == c) {
         return true;
      } else if((a + c) / 2.0 == b) {
         return true;
      } else if((b + c) / 2.0 == a) {
         return true;
      } else {
         return false;
      }      
   }
   
   public static boolean monthApart(int month1, int day1, int month2, int day2) {
      if(day2 >= day1 && month1 < month2) {
         return true;
      } else if(day1 >= day2 && month1 > month2) {
         return true;
      } else if(day2 >= day1 && month1 > month2 + 1) {
         return true;
      } else {
         return false;
      }
   }
   
   public static String graduation(double GPA, int totalCredits, int honorsCredits) {
      String status = "";
      if(GPA < 2.0) {
         status = "not graduating";
      } else if(GPA >= 2.0 && GPA < 3.6 && totalCredits >= 180) {
         status = "graduating";
      } else if(GPA >= 3.6 && GPA < 3.8 && honorsCredits < 15) {
         status = "cum laude";
      } else if(GPA >= 3.8 && honorsCredits < 15 && totalCredits >= 180) {
         status = "magna cum laude";
      } else if(honorsCredits >= 15 && GPA > 3.6 && GPA < 3.8 && totalCredits >= 180) {
         status = "magna cum laude";
      } else if(honorsCredits >= 15 && GPA > 3.8 && totalCredits >= 180) {
         status = "summa cum laude";
      } else {
         status = "not graduating";
      }
      return status;
   }
   
   public static boolean dominant(int a, int b, int c) {
      if(a > b + c) {
         return true;
      } else if(b > a + c) {
         return true;
      } else if( c > b + a) {
         return true;
      } else {
         return false;
      }
   }
   
   // public static String swapPairs(String word) {
//       if(word.contains(" ")) {
//          int space = word.indexOf(" ");
//          for(int i = 0; i < space; i + 2) {
//             String pair = word.substring(i, i + 2);
//             pair = pair. 
//             word = word.substring
//           

   public static void printFactors(int num) {
      int factors = 0;
      System.out.print("1");
      for(int i = 2; i <= num; i++) {
         if(num % i == 0) {
            factors = i;
            System.out.print(" and ");
            System.out.print(i);
         }
      }
   }
  
   public static int quadrant(double x, double y) {
      if(x == Math.abs(x) && y == Math.abs(y) && x != 0 && y != 0) {
         return 1;
      } else if(x != Math.abs(x) && y == Math.abs(y) && x != 0 && y != 0) {
         return 2;
      } else if(x != Math.abs(x) && y != Math.abs(y) && x != 0 && y != 0) {
         return 3;
      } else if(x == Math.abs(x) && y != Math.abs(y) && x != 0 && y != 0) {
         return 4;
      } else {
         return 0;
      }
   }
   
   public static void printGrid(int rows, int cols) {
   
   }
   
}