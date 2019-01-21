import java.awt.*;
import java.util.*;

public class ReturnsAndConditionals {
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
         chooseColor(g, console);
         g.fillOval(x, y, radius, radius);
      }
   }  
   
   public static void chooseColor(Graphics g, Scanner console) {
      System.out.print("Pick a color (1) red, (2) blue, (3) magenta. ");
      int colorChoice = console.nextInt();
      if (colorChoice == 1) {
         g.setColor(Color.RED);
      } else if (colorChoice == 2) {
         g.setColor(Color.BLUE);
      } else if (colorChoice == 3) {
         g.setColor(Color.MAGENTA);
      } else {
         System.out.println("Not a color choice!!! :( ");
         g.setColor(Color.BLACK);
      }
   }
   
}