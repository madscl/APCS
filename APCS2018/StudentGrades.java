/* Compares two students' grades
   Uses a Student class that you have to write! 
*/
import java.util.Scanner;

public class StudentGrades{
   public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
   
      Student student1 = makeStudent(reader);
      Student student2 = makeStudent(reader);
   
      // Output the two students' information
   	// For example: Student Jane (avg: 23)
      System.out.println(student1);
      System.out.println(student2);
   
      String name;
      double score;
       // Output the student with the highest score
      if (student1.getHighScore() > student2.getHighScore()){
         name = student1.getName();
         score = student1.getHighScore();
      }else{
         name = student2.getName();
         score = student2.getHighScore();
      }
      System.out.println(name + " has the highest score: " + score);
          
      // Output the student with the highest average score
      if (student1.getAverage() > student2.getAverage()){
         name = student1.getName();
         score = student1.getAverage();
      }else{
         name = student2.getName();
         score = student2.getAverage();
      }
      System.out.println(name + " has the highest average score: " + score);
   }
	
   public static Student makeStudent(Scanner reader) {
      System.out.print("Enter student's name: ");
      String name = reader.nextLine();
      System.out.print("How many classes does the student have? ");
      int classes = reader.nextInt();
      Student s = new Student(name, classes);
      for (int i = 0; i < classes; i++){ 
         System.out.print("Enter the student's score in class " + (i + 1) + ": ");
         int score = reader.nextInt();
         s.setScore(i, score);
      }
      // Consume the trailing newline character
      reader.nextLine();
      return s;	
   }
}
