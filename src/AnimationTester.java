//package cs151.chap4;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Ahmad
 */
public class AnimationTester {
  
  private static final int DELAY       = 10; //millisecond
  private static final int ICON_WIDTH  = 400;
  private static final int ICON_HEIGHT = 100;
  private static final int CAR_WIDTH   = 100;
  
  private JFrame frame;
  private MoveableShape myMoveableShape;
  private JLabel myShape;
  
  
  
  private void initialSetUp() {
    
    myMoveableShape = new MyMoveableShape(0,0, CAR_WIDTH);
    ShapeIcon carIcon = new ShapeIcon(myMoveableShape, ICON_WIDTH, ICON_HEIGHT);
    myShape = new JLabel(carIcon);
    
    
    frame = new JFrame();
    frame.setLayout(new FlowLayout());
    frame.add(myShape);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    Dimension dim = frame.getSize();
    double height = dim.getHeight();
    double width = dim.getWidth();
    System.out.println("height = " + height + " width = " + width);
  } //method
  private Dimension getFrameSize(JFrame f)
  {
	  Dimension dim = f.getSize();
	  return dim;
  }
  
  

  private void moveMyShape() {
    
	  System.out.println("in move my shape");
    Timer t = new Timer(DELAY, getActionListener());
    t.start();
    System.out.println("After start");
    
  } //method
  
  
  private ActionListener getActionListener() {
    
    return new 
          ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            	System.out.println("before translate");
            	myMoveableShape.translate(getFrameSize(frame));
            	System.out.println("after translate");
            	myShape.repaint();
            	System.out.println("after repaint");
            }
          };
    
  } //method
  
  public static void main(String[] args) {
    
    AnimationTester aTester = new AnimationTester();
    aTester.initialSetUp();
    System.out.println("before moveMyShape");
    aTester.moveMyShape();
    System.out.println("after moveMyShape");
    
    
  } //main
  
} //class
