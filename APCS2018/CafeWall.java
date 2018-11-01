/*Name: Madeleine Clore
Date: 1 November 2018
Assignment: CafeWall.java
Description: Use for loops and class constants with graphics*/

import java.awt.*;

public class CafeWall {
   public static final int MORTAR = 2;
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(650, 400);
      
      //set background color
      panel.setBackground(Color.GRAY);
      
      //create graphics object
      Graphics g = panel.getGraphics();
      
      drawRow(g, 0, 0, 4, 20, 0);
      drawRow(g, 50, 70, 5, 30, 0);
      drawSquare(g, 10, 150, 4, 25, 0);
      drawSquare(g, 250, 200, 3, 25, 10);
      drawSquare(g, 425, 180, 5, 20, 10);
      drawSquare(g, 400, 20, 2, 35, 35);
   }
   
   //creates scaleable line of boxes alternating black and white
   public static void drawRow(Graphics g, int x, int y, int pairs, int size, int offset) {
      for(int i = 0; i < pairs; i++) { //number of pairs 
         g.setColor(Color.BLACK);
         g.fillRect(x + size * 2 * i, y, size, size);
         g.setColor(Color.WHITE);
         g.fillRect(x + size + (size * 2) * i, y, size, size);
         g.setColor(Color.BLUE);
         g.drawLine(x + size * 2 * i, y, x + size + (size * 2) * i, y + size);
         g.drawLine(x + size + (size * 2) * i, y, x + size * 2 * i, y + size);   
      }
   }
   
   //creates squares of rows
   public static void drawSquare(Graphics g, int x, int y, int pairs, int size, int offset) {
      for (int i = 0; i < pairs; i++) {//creates square 2 rows at a time
         drawRow(g, x, y + (size + MORTAR) * 2 * i, pairs, size, offset);
         drawRow(g, x + offset, y + size + MORTAR + (size + MORTAR) * 2 * i, pairs, size, offset);
      }
   }      
}