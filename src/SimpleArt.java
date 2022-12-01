class SimpleArt implements TurtlePath {
    
    public void draw(Turtle t) {
        t.setPosition(200, 200);
        t.setAngle(180);
        for (int i=0; i < 4; i++) {
            t.forward(100);
            t.right(90);            
        }
    }
    
    public static void main(String[] args) {
        new TurtleCanvas(new SimpleArt());
    }
    
}