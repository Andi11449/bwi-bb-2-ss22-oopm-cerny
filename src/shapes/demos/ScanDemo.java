package shapes.demos;

import shapes.entities.*;

public class ScanDemo {
    public static void main(String[] args) {
        Scanable[] arr = new Scanable[4];
        arr[0] = new Rectangle();
        arr[1] = new Circle();
        arr[2] = new Position();
        arr[3] = new Position();

        scanElements(arr);
        display(arr);

        //scanElements(positions);


        //System.out.println(r);
    }

    private static void display(Displayable[] arr) {
        for (Displayable el : arr) {
            el.display();
        }
    }

    private static void scanElements(Scanable[] arr) {
        for (Scanable el : arr) {
            el.scan();
        }
    }
}
