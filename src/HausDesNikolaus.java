class HausDesNikolaus implements TurtlePath {

    public void draw(Turtle t) {
        t.setPosition(200, 200);
        t.setAngle(180);

        t.right(90);
        t.forward(100);
        t.left(90);
        t.forward(100);
        t.left(90);
        t.forward(100);
        t.right(90+45);
        t.forward(Math.sqrt(2)*50);
        t.right(90);
        t.forward(Math.sqrt(2)*50);
        t.right(90);
        t.forward(Math.sqrt(2)*100);
        t.right(90+45);
        t.forward(100);
        t.right(90+45);
        t.forward(Math.sqrt(2)*100);
    }

    public static void main(String[] args) {
        new TurtleCanvas(new HausDesNikolaus());
    }
}