package hochschule;

public class Datum {
    private int tag;
    private int monat;
    private int jahr;

    public Datum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    public Datum(int tag, int monat) {
        this(tag, monat, 2000);
    }

    public String getString(){
        return String.format("%02d.%02d.%04d", tag, monat, jahr);
    }

    public void setTag(int tag) {
        if(tag < 1) {
            return;
        }
        this.tag = tag;
    }

    public int getTag(){
        return tag;
    }

    public int getMonat() {
        return monat;
    }

    public void setMonat(int monat) {
        this.monat = monat;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }
}
