//package cs151.chap4;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;

/**
 *
 * @author Ahmad
 */
public class ShapeIcon implements Icon {

  private final MoveableShape myMoveableShape;
  private final int width;
  private final int height;


  ShapeIcon(MoveableShape shape, int width, int height) {
    this.myMoveableShape  = shape;
    this.width  = width;
    this.height = height;
  }


  @Override
  public void paintIcon(Component cmpnt, Graphics g, int x, int y) {

    Graphics2D g2 = (Graphics2D) g;
    myMoveableShape.draw(g2);
    
  } //method


  @Override
  public int getIconWidth() {
    return width;
  }


  @Override
  public int getIconHeight() {
    return width;
  }

} //class
