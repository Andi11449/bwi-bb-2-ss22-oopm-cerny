package shapes.entities;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, Position center){
        super(center);
        setRadius(radius);
    }

    public Circle(double radius) {
        this(radius, new Position());
    }

    public Circle(){
        this(1, new Position());
    }

    /**
     * Copy constructor (deep copy)
     * @param circle original that will be copied
     */
    public Circle(Circle circle){
        this.radius = circle.radius;
        //this.center = circle.center;
        this.center = new Position(circle.center);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0)
            return;
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void scale(double scale){
        setRadius(radius * scale);
    }

    @Override
    public void display(){
        System.out.printf("Circle (Radius: %5.2f; Area: %8.2f; " +
                "PosX: %5.2f, PosY: %5.2f)\n", radius, getArea(), center.getX(),  center.getY());
    }
}