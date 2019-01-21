import java.util.*;

public class ArraysPractice {
   public static void main(String[] args) {
   
      // 1. makePi
      System.out.println("    1. makePi");
      System.out.println(Arrays.toString(makePi()));
      
      // 2. sameFirstLast
      System.out.println("    2. sameFirstLast");
      System.out.println(sameFirstLast(new int[]{1, 2, 3}));
      System.out.println(sameFirstLast(new int[]{1, 2, 3, 1}));
      System.out.println(sameFirstLast(new int[]{1, 2, 1}));
      
      // 3. sum
      System.out.println("    3. sum");
      System.out.println(sum(new int[]{1, 2, 3}));
      System.out.println(sum(new int[]{5, 11, 2, 3}));
      System.out.println(sum(new int[]{7, 0, 0, 3, 5}));
      
      // 4. findSmallest 
      System.out.println("    4. findSmallest");
      System.out.println(findSmallest(new int[]{4, 5, 2, 1}));
      System.out.println(findSmallest(new int[]{3, 6, 5}));
      
      // 5. reverse or swapEnds
      System.out.println("    5. swapEnds");
      System.out.println(Arrays.toString(swapEnds(new int[] {1, 2, 3, 4})));
      System.out.println(Arrays.toString(swapEnds(new int[] {1, 2, 3})));
      System.out.println(Arrays.toString(swapEnds(new int[] {8, 6, 7, 9, 5})));
      
      // 6. doubleUp
      System.out.println("    6. doupleUp");
      System.out.println(Arrays.toString(doubleUp(new int[]{11, -4, 0, 777})));
      
      // 7. pre4  
      System.out.println("    7. pre4");
      System.out.println(Arrays.toString(pre4(new int[]{1, 2, 4, 1})));
      System.out.println(Arrays.toString(pre4(new int[]{3, 1, 4})));
      System.out.println(Arrays.toString(pre4(new int[]{1, 4, 4})));            
      
      // A) countClumps
      System.out.println("    EXTRA A) countClumps");
      System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4}));
      System.out.println(countClumps(new int[]{1, 1, 2, 1, 1}));
      System.out.println(countClumps(new int[]{1, 1, 1, 1, 1}));
      
      // B) canBalance 
   //       System.out.println("    EXTRA B) canBalance");
   //       System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
   //       System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));
   //       System.out.println(canBalance(new int[]{10, 10}));
   //       System.out.println();
           
   }
   
   //#1
   public static int[] makePi() {
      int[] pi = {3, 1, 4};
      return pi;
   }
   
   //#2
   public static boolean sameFirstLast(int[] nums) {
      if(nums[0] == nums[nums.length - 1]) {
         return true;
      } else {
         return false;
      }
   }
   
   //#3
   public static int sum(int[] nums) {
      int sum = 0;
      for(int i = 0; i < nums.length; i++) {
         sum += nums[i];
      }
      return sum;        
   }
   
   //#4
   public static int findSmallest(int[] nums) {
      int smallest = nums[0];
      int index = 0;
      for(int i = 1; i < nums.length; i++) {
         if(nums[i] < smallest) {
            smallest = nums[i];
            index = i;
         }
      }
      return index; 
   }
   
   //#5
   public static int[] swapEnds(int[] nums) {
      for(int i = 0; i < nums.length - 1; i++) {
         int temp = nums[i];
         nums[i] = nums[nums.length - 1 - i];
         nums[nums.length - i - 1] = temp;
      }
      return nums;
   }
   
   //#6
   public static int[] doubleUp(int[] nums) {
      int[] doubleNums = new int[nums.length * 2];
      for(int i = 0; i < nums.length; i++) {
         doubleNums[i * 2] = nums[i];
         doubleNums[(i * 2) + 1] = nums[i];
      }
      return doubleNums;
   }
   
   //#7
   public static int[] pre4(int[] nums) {
      int length = 0;
      int i = 0; 
      while(nums[i] != 4) {
         length++;
         i++;
      }
      return Arrays.copyOf(nums, length);    
   }
   
   //challenge A
   public static int countClumps(int[] nums) { 
      int clumps = 0;
      int[] sortedNums = Arrays.copyOf(nums, nums.length);
      if(Arrays.equals(nums, sortedNums)) {
         clumps = 1;
      } else {
         for(int i = 0; i < nums.length; i++) {
            if(nums[i] == nums[i + 1]) {
               clumps++;
            }
          }
      } 
      return clumps;           
   }
      
}