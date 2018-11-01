import java.awt.*;

public class StartingGraphics {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(300, 250);
      
      //set background color
      panel.setBackground(Color.YELLOW);
      
      //create graphics object
      Graphics g = panel.getGraphics();
      
      drawBear(g);
      drawSquares(g);
      drawTarget(g);
      
   }
   
   public static void drawBear(Graphics g) {
      g.setColor(Color.ORANGE);
      g.fillOval(50, 50, 50, 50);//face shape
      g.fillOval(45, 50, 20, 20);//left ear
      g.fillOval(85, 50, 20, 20);//right ear
      g.setColor(Color.BLACK);
      g.fillOval(60, 65, 5, 5);//left eye
      g.fillOval(85, 65, 5, 5);
      g.setColor(Color.RED);
      g.fillRect(70, 85, 10, 3);//mouth
   }
   
   public static void drawSquares(Graphics g) {
      g.setColor(Color.DARK_GRAY);
      g.drawLine(150, 50, 250, 150);
      g.setColor(Color.RED);
      for (int i = 1; i <= 5; i++) {
       g.drawRect(150, 50, (i * 20), (i * 20));
      }
   }
   
   public static void drawTarget(Graphics g) {
      for (int i = 0; i < 5; i++) {
         g.setColor(Color.RED);
         g.fillOval(20 + i * 10, 120 + i * 10, 100 - i * 20, 100 - i * 20);
         g.setColor(Color.WHITE);
         g.fillOval(25 + i * 10, 125 + i * 10, 90 - i * 20, 90 - i * 20);   
      }
   }
}