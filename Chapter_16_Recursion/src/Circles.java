import javax.swing.*;
import java.awt.*;

/**
 * This applet uses a recursive method to draw concentric circles
 * @author emreyanmis
 */

public class Circles extends JApplet
{
   public void init()
   {
	   getContentPane().setBackground(Color.white);
   }
   
   /**
    *  paint method
    *  @param g The applet's Graphics object.
    */
   
  public void paint(Graphics g)
  {
	  // Draw 10 concentric circles.The outermost circle's enclosing rectangle should be at (5,5),
	  // and it should be 300 pixels wide by 300 pixels high.
	  
	  drawCircles(g,10,5,300);
  }

  private void drawCircles(Graphics g, int n, int topXY, int size)
  {
	g.drawOval(topXY, topXY,size, size);
	drawCircles(g,n-1,topXY+15,size -30);
  }
}
