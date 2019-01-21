import java.awt.*;
import java.util.*;

public class ScannerGraphics {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(300, 350);
      
      Graphics g = panel.getGraphics();
      Scanner console = new Scanner(System.in);
      
     placeCircles(g, console);
  
   
   }
   
   public static void placeCircles(Graphics g, Scanner console) {
      System.out.print("How many circles do you want? ");
      int number = console.nextInt();
      for(int i = 0; i < number; i++) {
         System.out.print("What radius circle do you want? ");
         int radius = console.nextInt();
         System.out.print("Circle's x coordinate: ");
         int x = console.nextInt();
         System.out.print("Circle's y coordinate: ");
         int y = console.nextInt();
         g.drawOval(x, y, radius, radius);
      }
   }  
   
  //  public static void drawMaze(Graphics g, Scanner console) {
//       System.out.print("How big of a window would you like? ");
//       int window = console.nextInt();
//       System.out.print("How much space should be between each arm of the spiral? ");
//       int space = console.nextInt();
//       for (int i = 0, i < window / space; i++) {
//          g.drawLine(i * (window + space), i * (window + space), 
}
   
