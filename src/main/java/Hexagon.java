import java.awt.*;

public class Hexagon extends Shape {
    private int sideLength;

    public Hexagon(Turtle turtle, Point location, Color color, int border, int sideLength) {
        super(turtle, location, color, border);
        this.sideLength = sideLength;
    }

    @Override
    public void paint() {

    }
}

