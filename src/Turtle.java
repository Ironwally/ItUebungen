import java.awt.Graphics;

/**
 * This class implements a turtle that lives on a turtle graphics
 * canvas. The turtle has a position and orientation, can move
 * forward and rotate left and right.
 */ 

class Turtle {
    
    /* The graphics context that is used for drawing. */
    private Graphics graphics;
    
    /* Position and orientation of the turtle.
     * The origin of the coordinate system is in the upper left corner
     * of the window, with x-values growing towards the right and y-values
     * towards the bottom of the screen. The orientation is in degrees,
     * counted clockwise, where 0 is pointing upwards ("north").
     */
    private double posX, posY;
    private double phi;
    private boolean penDown;

    /* Private helper functions to convert angles from degrees
     * to radians, and to normalize the turtle's orientation.
     */ 
    private static double deg2rad(double deg) {
        return deg * Math.PI / 180.0;
    }
    
    private void normalizePhi() {
        while (phi < 0.0) { phi += 360.0; }
        while (phi >= 360.0) { phi -= 360.0; }
    }

    /* Constructor. Initializes the turtle's position and orientation. */
    public Turtle() {
        posX = posY = 0.0;
        phi = 0.0;
        penDown = true;
    }

    /* Set the graphics context for the turtle. */
    public void setGraphics(Graphics g) {
        graphics = g;
    }

    /* Set the position of the turtle. */
    public void setPosition(double x, double y) {
        posX = x;
        posY = y;
    }

    public void penDown() {
        penDown = true;
    }
    public void penUp() {
        penDown = false;
    }
    
    /* Set the orientation of the turtle. */
    public void setAngle(double alpha) {
        phi = alpha;
        normalizePhi();
    }
    
    /* Move the turtle forwards by 'dist' pixels. */
    public void forward(double dist) {
        /* Compute new position after forward move. */
        double psi = deg2rad(phi);
        double newX = posX + Math.sin(psi) * dist;
        double newY = posY + Math.cos(psi) * dist;
        
        /* Draw line between old and new position. */ //If the Pen is Down
        if (penDown) graphics.drawLine((int) posX, (int) posY, (int) newX, (int) newY);
        
        /* Update turtle's position. */
        posX = newX;
        posY = newY;
    }
    
    /* Turn right by 'psi' distegrees. */
    public void right(double psi) {
        phi -= psi;
        normalizePhi();
    }
    
    /* Turn left by 'psi' degrees. */
    public void left(double psi) {
        phi += psi;
        normalizePhi();
    }
    
    /* Position and orientation as a string. */
    public String toString() {
        return "<" + posX + "," + posY + "/" + phi + ">";
    }
}
