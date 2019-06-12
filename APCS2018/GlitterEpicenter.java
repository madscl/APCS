import java.awt.*;
import java.util.*;
import java.io.*;

public class GlitterEpicenter {   
   public static void main(String[] args)
   throws FileNotFoundException {
   
      Scanner input = new Scanner(new File("cities.txt"));
      int numCities = getCities(input);
      Point points[] = getPoints(input, numCities);
      DrawingPanel p = new DrawingPanel(200, 200);
      Scanner console = new Scanner(System.in);
      boolean done = false;
      while(!done) {
         Point center = getCenter(console);
         int radius = getRadius(console); 
         drawEverything(p, radius, center, points);
         System.out.println("Kaboom!");
         done = isDone(console);         
      }      
   }
   
   public static void drawEverything(DrawingPanel panel, int radius, Point center, Point[] cities) {
      panel.clear();
      Graphics g = panel.getGraphics();
      Point origin = center;
       
      g.drawOval(origin.x - radius, origin.y - radius, radius * 2, radius * 2);
      for(Point p: cities) {
         double distance = p.distance(origin);
         if(distance <= radius) {
            p.setColor(Color.RED);
         } else {
            p.setColor(Color.BLACK);
         }
         p.draw(g);
      }  
   }
   
   public static Point getCenter(Scanner console) {
      System.out.print("Blast site x? ");
      int x = console.nextInt();
      System.out.print("Blast site y? ");
      int y = console.nextInt();
      Point center = new Point(x, y);   
      return center;  
   }
   
   public static int getRadius(Scanner console) {
      System.out.print("Blast site radius? ");
      int radius = console.nextInt();
      return radius;
   }
   
   public static int getCities(Scanner input) {
      int numCities = input.nextInt();
      //System.out.print(numCities);
      return numCities;
   }
   
   public static Point[] getPoints(Scanner input, int numCities) {
      Point points[] = new Point[numCities];
      for(int i = 0; i < numCities; i++) {
         int x = input.nextInt();
         int y = input.nextInt();
         points[i] = new Point(x, y);
      }
      return points;
   }
   
   public static boolean isDone(Scanner console) {
      System.out.print("Do you want to quit? (y/n) ");
      String answer = console.next();
      if(answer.equalsIgnoreCase("y")) {
         return true;
      } else {
         return false;
      }
   }
}