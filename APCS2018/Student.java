import java.util.*;
   
public class Student {

   private String name;
   private int classes;
   private int[] scores;
   
   public Student(String name, int classes) {
      this.name = name;
      this.classes = classes;
      this.scores = new int[classes];
   }
   
   public void setScore(int index, int score) {
      if(score < 0) {
         throw new IllegalArgumentException("You can't enter a negative score");
      }
      //assigns score that the user enters to the designated spot in the array
      scores[index] = score;
   }
   
   //provides a user readable description of the class
   public String toString() {
       return "Student " + name + " (avg: " + this.getAverage() + ")";
    }

   public double getAverage() {
      //checks for zero length array
      if(scores.length == 0) {
         return 0.0;
      }
      double total = 0.0;
      for(int score: scores) {
         total += score;
      }
      return total / scores.length;
   }
   
   public int getHighScore() {
      int highest = Integer.MIN_VALUE;
      for(int score: scores) {
         if(score > highest) {
            highest = score;
         }
      }
      return highest;
   }
   
   public String getName() {
      return this.name;
   }
}

