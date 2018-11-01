/*Name: Madeleine Clore
Date: 1 November 2018
Assignment: Doodle.java
Description: Create a figure using a variety of graphics*/

import java.awt.*;

public class Doodle {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(650, 400);
      
      //create new colors
      Color SKY_BLUE = new Color(0, 150, 200);
             
      //set background color
      panel.setBackground(SKY_BLUE);
      
      //create graphics object
      Graphics g = panel.getGraphics();
      
      drawLeaf(g);
      drawCaterpillar(g);
      
   }
   
   //draws leaf
   public static void drawLeaf(Graphics g) {
      Color LEAF_GREEN = new Color(8, 117, 14);
      g.setColor(LEAF_GREEN);
      g.fillOval(0, 200, 600, 150);
      g.setColor(Color.BLACK);
      g.drawLine(0, 275, 600, 275);
      g.drawLine(50, 275, 140, 335);
      g.drawLine(150, 275, 240, 348);
      g.drawLine(250, 275, 340, 350);
      g.drawLine(350, 275, 440, 340);
      g.drawLine(450, 275, 540, 320);
      g.drawLine(50, 275, 140, 214);
      g.drawLine(250, 275, 340, 202);
      g.drawLine(350, 275, 550, 210);
   }
   
   //draws caterpillar
   public static void drawCaterpillar(Graphics g) {
      g.setColor(Color.BLACK);
      g.fillOval(90, 235, 20, 20);//feet
      g.fillOval(145, 255, 20, 20);
      g.fillOval(190, 252, 20, 20);
      g.fillOval(225, 255, 20, 20);
      g.fillOval(255, 250, 20, 20);
      g.fillOval(285, 250, 20, 20);
      g.fillOval(318, 245, 20, 20);
      g.fillOval(350, 250, 20, 20);
      g.fillOval(385, 245, 20, 20);
      g.fillOval(415, 255, 20, 20);
      g.fillOval(438, 260, 20, 20);
      g.fillOval(455, 289, 20, 20);
      g.fillOval(490, 285, 20, 20);
      g.fillOval(525, 270, 20, 20);
      g.fillOval(545, 253, 20, 20);
      
      g.setColor(Color.GREEN);
      g.fillOval(70, 165, 80, 80);//start of caterpillar body (left)
      g.setColor(Color.BLACK);
      g.drawOval(70, 165, 80, 80);//outlines body
      g.setColor(Color.GREEN);
      g.fillOval(135, 190, 85, 80);
      g.setColor(Color.BLACK);
      g.drawOval(135, 190, 85, 80);
      g.setColor(Color.GREEN);
      g.fillOval(200, 180, 85, 85);
      g.setColor(Color.BLACK);
      g.drawOval(200, 180, 85, 85);
      g.setColor(Color.GREEN);
      g.fillOval(260, 160, 100, 100);
      g.setColor(Color.BLACK);
      g.drawOval(260, 160, 100, 100);
      g.setColor(Color.GREEN);
      g.fillOval(330, 170, 90, 90);
      g.setColor(Color.BLACK);
      g.drawOval(330, 170, 90, 90);
      g.setColor(Color.GREEN);
      g.fillOval(400, 180, 90, 90);
      g.setColor(Color.BLACK);
      g.drawOval(400, 180, 90, 90);
      g.setColor(Color.GREEN);
      g.fillOval(440, 210, 90, 90);
      g.setColor(Color.BLACK);
      g.drawOval(440, 210, 90, 90);
      g.setColor(Color.GREEN);
      g.fillOval(480, 190, 90, 90);//end of caterpillar body (right)
      g.setColor(Color.BLACK);
      g.drawOval(480, 190, 90, 90);  
      
      
      Color YELLOW_GREEN = new Color(150, 150, 0);
      g.setColor(YELLOW_GREEN);
      g.fillOval(105, 180, 15, 15);//spots on caterpillar
      g.fillOval(90, 195, 15, 15);
      g.fillOval(95, 215, 15, 15);
      g.fillOval(170, 200, 15, 15);
      g.fillOval(160, 220, 15, 15);
      g.fillOval(165, 240, 15, 15);
      g.fillOval(225, 200, 15, 15);
      g.fillOval(215, 220, 15, 15);
      g.fillOval(225, 240, 15, 15);
      g.fillOval(310, 180, 15, 15);
      g.fillOval(295, 200, 15, 15);
      g.fillOval(310, 230, 15, 15);
      g.fillOval(375, 185, 15, 15);
      g.fillOval(355, 210, 15, 15);
      g.fillOval(370, 235, 15, 15);
      g.fillOval(440, 200, 15, 15);
      g.fillOval(425, 220, 15, 15);
      g.fillOval(428, 240, 15, 15);
      g.fillOval(455, 230, 15, 15);
      g.fillOval(450, 250, 15, 15);
      g.fillOval(460, 275, 15, 15);
      g.fillOval(510, 205, 15, 15);
      g.fillOval(500, 225, 15, 15);
      g.fillOval(515, 250, 15, 15);
      
      g.setColor(Color.GREEN);
      g.fillOval(525, 150, 100, 100);//draws head
      Color DARK_GREEN = new Color(100, 200, 100);
      g.setColor(DARK_GREEN);//new green for eye
      g.fillOval(595, 175, 10, 20);//right eye
      g.fillOval(565, 180, 10, 20);//left eye
      
      g.setColor(Color.GREEN);
      g.fillOval(550, 75, 5, 100);//antenna
      g.fillOval(600, 75, 5, 100);
      g.setColor(Color.BLACK);
      g.drawOval(525, 150, 100, 100);//outlines head
      
      g.setColor(Color.BLACK);
      g.fillOval(540, 65, 20, 20);//antenna
      g.fillOval(590, 65, 20, 20);
      
      g.fillOval(578, 215, 20, 20);//mouth
      g.setColor(Color.GREEN);
      g.fillOval(578, 210, 20, 20);
   }
}
