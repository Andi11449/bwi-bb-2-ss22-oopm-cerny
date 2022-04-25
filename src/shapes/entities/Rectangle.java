package shapes.entities;

public class Rectangle {
    private double width;
    private double height;
    private Position position;

    public Position getPosition() {
        return new Position(this.position);
    }

    public void setXY(double x, double y) {
        this.position.setX(x);
        this.position.setY(y);
    }

    public Rectangle(double width, double height, Position position){
        setWidth(width);
        setHeight(height);
        this.position = position;
    }

    public Rectangle(double width, double height){
        setWidth(width);
        setHeight(height);
        this.position = new Position();
    }

    public Rectangle(double length) {
        this(length, length);
    }

    public Rectangle(){
        this(1, 1);
    }

    /**
     * Copy constructor (deep copy)
     * @param rect
     */
    public Rectangle(Rectangle rect){
        this.width = rect.width;
        this.height = rect.height;
        this.position = new Position(rect.position);
    }

    public void scale(double scaleW, double scaleH){
        setWidth(width * scaleW);
        setHeight(height * scaleH);
    }

    public void scale(double scale){
        setWidth(width * scale);
        setHeight(height * scale);
    }

    public void setWidth(double width){
        if(width <= 0)
            return;

        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
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

    public double getArea(){
        return width * height;
    }

    public void print(){
        System.out.printf("Rectangle (Width: %5.2f; Height: %5.2f; Area: %8.2f; " +
                "PosX: %5.2f, PosY: %5.2f)\n", width, height, getArea(), position.getX(),  position.getY());
    }
}