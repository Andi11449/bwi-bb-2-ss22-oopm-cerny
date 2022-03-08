package hochschule;

public class Arbeitsvertrag {
    public int stundenzahl;
    public Datum anfang;
    public Datum ende;

    public String getString() {
        return String.format("%s - %s, %d Stunden", anfang.getString(), ende.getString(), stundenzahl);
    }
}
