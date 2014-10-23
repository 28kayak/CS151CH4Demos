//package cs151.chap4;

import java.awt.Dimension;
import java.awt.Graphics2D;

/**
 *
 * @author Ahmad
 */
public interface MoveableShape {
  
  void draw(Graphics2D g2);
  void translate( Dimension dim);
  public int getWidth();
  public int getHeight();
  
} //interface
