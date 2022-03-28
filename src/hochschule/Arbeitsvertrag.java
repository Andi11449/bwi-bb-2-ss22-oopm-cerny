package hochschule;

public class Arbeitsvertrag {
    public int stundenzahl;
    public Datum anfang;
    public Datum ende;

    public Arbeitsvertrag(int stundenzahl, Datum anfang, Datum ende) {
        this.stundenzahl = stundenzahl;
        this.anfang = anfang;
        this.ende = ende;
    }

    public String getString() {
        return String.format("%s - %s, %d Stunden", anfang.getString(), ende.getString(), stundenzahl);
    }
}
