class Snowflake implements TurtlePath {

    /* This turtle object is used to avoid passing an additional
     * (constant) parameter to the recursive 'koch' method. */
    private Turtle turtle;

    private void koch(double len, int n) {
        if (n == 0) {
            turtle.forward(len);
        } else {
            koch(len / 3.0, n-1);
            turtle.left(60);
            koch(len / 3.0, n-1);
            turtle.right(120);
            koch(len / 3.0, n-1);
            turtle.left(60);
            koch(len / 3.0, n-1);
        }
    }
    
    public void draw(Turtle t) {
        
        turtle = t;
        turtle.setPosition(30, 100);
        turtle.setAngle(90.0);
        
        for (int i = 0; i < 3; i++) {
            koch(300.0, 4);
            turtle.right(120.0);
        }
    }
    
    public static void main(String[] args) {
        new TurtleCanvas(new Snowflake());
    }

}
