//package cs151.chap4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author Ahmad
 */
public class MyMoveableShape implements MoveableShape {

  private int x;
  private int y;
  private final int width;
  private int dy = 1;
  private int dx = 0; 

  
  public MyMoveableShape(int x, int y, int width) {
    this.x = x;
    this.y = y;
    this.width = width;
  } //constructor


  /**
   * Draws the shape.
   * @param g2 - the Graphics2D object
   */
  @Override
  public void draw(Graphics2D g2) {
    
    Ellipse2D.Double circle = new Ellipse2D.Double(x, y, width, width);
    
    Point2D.Double start = new Point2D.Double(x, y);
    Point2D.Double end = new Point2D.Double(x + width, y);
    Shape segment = new Line2D.Double(start, end);
    
    g2.setColor(Color.RED);
    g2.fill(circle);
    g2.draw(segment);
    
  } //method

  /**
   * Translates the current coordination x,y to x+dx and y+dy.
   * @param dx - the movement amount of x 
   * @param dy - the movement amount of y
   */
  @Override
  public void translate( Dimension dim) 
  {
	  
	 double frameHeight = dim.getHeight();
	 double frameWidth = dim.getWidth();
	if(x+dx < 0 || x+dx > frameWidth)
	{
		dx *= -1;
	}
	if(y+dy < 0 || y+dy+100 > frameHeight)
	{
		 dy *= -1;
		 //y = y+dy;
	}
	x += dx;
	y += dy;
	System.out.println("x = " + x + " y = "+ y );
  } //method
  @Override 
  public int getHeight()
  {
	  return y;
  }
  @Override
  public int getWidth()
  {
	  return x;
  }
  
  
} //method
