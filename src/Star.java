class Star implements TurtlePath {
    
    public void draw(Turtle t) {
        t.setPosition(200, 200);
        t.setAngle(180);
        for (int i=0; i<3;i++){
            t.forward(100);
            t.right(2*360/6);
        }

        //move to new start
        t.penUp();
        t.forward(50);
        t.left(90);
        t.forward(30);
        t.right(90+30);
        t.penDown();
    
        for (int i=0;i<6;i++){
            t.forward(100);
            t.right(2*360/6);
        }
    }
    

    public static void main(String[] args) {
        new TurtleCanvas(new Star());
    }
}
