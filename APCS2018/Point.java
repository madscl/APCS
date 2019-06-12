import java.awt.*; //import graphics

public class Point {
   int x;
   int y;
   Color pColor;

   public Point(int xValue, int yValue) {
      x = xValue;
      y = yValue;
   }
   
   public void translate(int dx, int dy) {
      x += dx;
      y += dy;
   }
   
   public void draw(Graphics g) {
      Color temp = g.getColor();
      g.setColor(pColor);
      g.fillOval(x, y, 3, 3);
      g.drawString("(" + x + " , " + y + ")", x, y);
      g.setColor(temp);
   }
   
   public boolean isVertical(Point other) {
      return(x == other.x);
   }
   
   public void setColor(Color myColor) {
      pColor = myColor;
   }
   
   public double distance(Point other) {
      double dxSquared = Math.pow(x - other.x, 2);
      double dySquared = Math.pow(y - other.y, 2);
      return Math.sqrt(dxSquared + dySquared);
   }
   

}