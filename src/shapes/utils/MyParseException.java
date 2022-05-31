package shapes.utils;

public class MyParseException extends Exception {
    public MyParseException(String s, NumberFormatException e) {
        super(s, e);
    }
}
