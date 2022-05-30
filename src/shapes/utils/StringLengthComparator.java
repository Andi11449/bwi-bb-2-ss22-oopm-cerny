package shapes.utils;

public class StringLengthComparator implements java.util.Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}
