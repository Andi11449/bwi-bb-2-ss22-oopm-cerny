package shapes.entities;

public interface Displayable {
    default void display() {
        System.out.println(this.toString());
    }
}
