package shapes.entities;

public abstract class Shape implements Scanable {
    protected Position center;

    public Shape(Position center){
        this.center = new Position(center);
    }

    public Shape(){
        this(new Position());
    }

    /**
     * Copy constructor (deep copy)
     * @param circle original that will be copied
     */
    public Shape(Shape circle){
        this.center = new Position(circle.center);
    }

    public final Position getCenter() {
        return new Position(this.center);
    }

    public void setXY(double x, double y) {
        this.center.setXY(x, y);
    }

    public void move(double x, double y) {
        this.center.shift(x, y);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void scale(double scale);

    public void display(){
        System.out.printf("Shape (Area: %8.2f; " +
                "PosX: %5.2f, PosY: %5.2f)\n", getArea(), center.getX(),  center.getY());
    }

    @Override
    public void scan() {
        System.out.println("Center");
        center.scan(); // use Position's scan for scanning the center
    }
}