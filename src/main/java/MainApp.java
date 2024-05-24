import java.awt.*;
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.awt.Color;
import java.util.Scanner;

public class MainApp extends Turtle {
    static Scanner scanner = new Scanner(System.in);

    public MainApp(World w) {
        super(w);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to your turtle painter");
        System.out.println("Enter the location parameters of your world, e.x., (x,y)");
        System.out.print("Enter the X coordinate: ");
        int X = scanner.nextInt();
        System.out.print("Enter the Y coordinate: ");
        int Y = scanner.nextInt();
        scanner.nextLine();

        Point point = new Point(X, Y);

        System.out.println("Available colors:");
        System.out.println("1. BLACK");
        System.out.println("2. RED");
        System.out.println("3. BLUE");
        System.out.println("4. MAGENTA");
        System.out.println("5. CYAN");

        System.out.print("Select a color (enter the number): ");
        int choice = scanner.nextInt();
        Color selectedColor = null;
        switch (choice) {
            case 1:
                selectedColor = Color.BLACK;
                break;
            case 2:
                selectedColor = Color.RED;
                break;
            case 3:
                selectedColor = Color.BLUE;
                break;
            case 4:
                selectedColor = Color.MAGENTA;
                break;
            case 5:
                selectedColor = Color.CYAN;
                break;
            default:
                System.out.println("Invalid color selection!");
                return;
        }

        World world = new World(1000, 1000);
        Turtle turtle = new Turtle(world, X, Y);

        Square square = new Square(turtle, point, selectedColor, 1, 100);
        square.paint();
    }
}


