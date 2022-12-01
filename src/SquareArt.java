class SquareArt implements TurtlePath {
    
    private void square(Turtle t, double len) {
        for (int i = 0; i < 4; i++) {
            t.forward(len);
            t.right(90);
        }
    }
    
    public void draw(Turtle t) {
        t.setPosition(200, 200);
        for (int i = 0; i < 36; i++) {
            square(t, 100.0);
            t.right(10);
        }
    }
    
    public static void main(String[] args) {
        new TurtleCanvas(new SquareArt());
    }
}