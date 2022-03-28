package hochschule;

public class DateDemo {
    public static void main(String[] args) {
        Datum d = new Datum(21, 2, 2022);
        System.out.println(d.getString());

        d.setTag(-12);
        System.out.println("Tag: " + d.getTag());
        System.out.println(d.getString());
    }
}
