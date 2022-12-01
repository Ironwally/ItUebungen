import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A turtle canvas is a window in which the turtle's moves
 * are drawn. The path the turtle takes is determined by the
 * 'TurtlePath' object given in the constructor.
 */

class TurtleCanvas extends Canvas {
    
    /* A window to draw the canvas in. */
    private JFrame frame;
    
    /* The turtle that lives on this canvas. */
    private Turtle turtle;
    
    /* The path the turtle takes when the canvas is painted. */
    private TurtlePath turtlePath;

    /* Default constuctor. Sets the size of the window and also
     * the path the turtle takes.
     */
    public TurtleCanvas(int width, int height, TurtlePath path) {
        
        /* Set up a new window. */
        frame = new JFrame("Turtle Graphics");
        
        /* Add the turtle canvas ('this') to the window's content pane. */
        frame.setPreferredSize(new Dimension(width, height));
        frame.getContentPane().add(this);
        
        /* Do the window layout and set an action for closing the window. */
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* Generate a turtle, set its path, and display the window. When the window
         * is first shown on screen (or when the window is resized) the paint
         * method of this canvas is called by the JFrame object.
         */
        turtle = new Turtle();
        turtlePath = path;
        frame.setVisible(true);
    }
    
    /* Second constructor which uses a default window size. */
    public TurtleCanvas(TurtlePath path) {
        this(400, 400, path);
    }
    
    /* The paint method is called automatically (via the JFrame object)
     * when the window is first displayed or resized.
     */
    public void paint(Graphics g) {
        /* Call the 'draw' method of the turtle path object that was passed
         * in via the constructor.
         */
        turtle.setGraphics(g);
        turtlePath.draw(turtle);
    }

}
