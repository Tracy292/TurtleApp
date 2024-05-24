import java.awt.*;
import java.awt.geom.Point2D;

public class Square extends Shape {
    private int sideLength;

    public Square(Turtle turtle, Point location, Color color, int border, int sideLength) {
        super(turtle, location, color, border);
        this.sideLength = sideLength;
    }

    @Override
    public void paint() {
        int width = sideLength;
        int height = sideLength;
        turtle.setPenWidth(3);
        turtle.setColor(getColor());

        turtle.turnRight(180);
        turtle.forward(width);

        turtle.turnRight(90);
        turtle.forward(width);
        turtle.turnRight(90);
//
//
        turtle.forward(width);
//
        turtle.turnRight(90);
        turtle.forward(width);
        }
    }


