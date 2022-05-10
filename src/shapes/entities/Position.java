package shapes.entities;

import java.util.Scanner;

public class Position {
    private double x, y;

    public Position() {}

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position position) {
        this.x = position.x;
        this.y = position.y;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shift(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        /*return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';*/
        return String.format("Position [x=%.1f; y=%.1f]", x, y);
    }

    public void scan() {
        Scanner sc = new Scanner(System.in); // create a scanner
        System.out.print("x: ");
        setX(sc.nextDouble()); // scan and set the x value
        System.out.print("y: ");
        setY(sc.nextDouble()); // scan and set the y value
    }
}
