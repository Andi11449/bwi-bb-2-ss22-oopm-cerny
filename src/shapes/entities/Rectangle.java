package shapes.entities;

import java.util.Objects;
import java.util.Scanner;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, Position center){
        super(center);
        setWidth(width);
        setHeight(height);
    }

    public Rectangle(double width, double height){
        this(width, height, new Position());
    }

    public Rectangle(double length) {
        this(length, length, new Position());
    }

    public Rectangle(){
        this(1, 1, new Position());
    }

    /**
     * Copy constructor (deep copy)
     * @param rect original that will be copied
     */
    public Rectangle(Rectangle rect){
        this.width = rect.width;
        this.height = rect.height;
        //this.center = rect.center;
        this.center = new Position(rect.center);
    }

    public void setWidth(double width){
        if(width <= 0)
            return;

        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        if(height < 0){
            this.height = 0;
            return;
        }

        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void scale(double scaleW, double scaleH){
        setWidth(width * scaleW);
        setHeight(height * scaleH);
    }

    @Override
    public void scale(double scale){
        setWidth(width * scale);
        setHeight(height * scale);
    }

    @Override
    public void display(){
        System.out.printf("Rectangle (Width: %5.2f; Height: %5.2f; Area: %8.2f; " +
        "PosX: %5.2f, PosY: %5.2f)\n", width, height, getArea(), center.getX(),  center.getY());
        super.display();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (o instanceof Rectangle){
            Rectangle rectangle = (Rectangle) o;
            return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.height, height) == 0;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "center=" + center +
                ", width=" + width +
                ", height=" + height +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }

    public void scan() {
        super.scan();

        System.out.println("Dimensions:");
        Scanner sc = new Scanner(System.in); // create a scanner
        System.out.print("width: ");
        setWidth(sc.nextDouble()); // scan and set the width
        System.out.print("height: ");
        setHeight(sc.nextDouble()); // scan and set the height
    }
}