package shapes.entities;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        setWidth(width);
        setHeight(height);
    }

    public Rectangle(double length) {
        this(length, length);
    }

    public Rectangle(){
        this(1, 1);
    }

    public Rectangle(Rectangle rect){
        this.width = rect.width;
        this.height = rect.height;
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
        System.out.printf("Rectangle (Width: %5.2f; Height: %5.2f; Area: %8.2f)\n", width, height, getArea());
    }
}
