package hochschule;

public class Datum {
    public int tag;
    public int monat;
    public int jahr;

    public String getString(){
        return String.format("%02d.%02d.%04d", tag, monat, jahr);
    }
}
