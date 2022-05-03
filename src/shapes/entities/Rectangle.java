package shapes.entities;

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
        if(width < 0){
            this.height = 0;
            return;
        }
        if(width > 100){
            this.height = 100;
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
}