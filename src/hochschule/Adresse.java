package hochschule;

public class Adresse {
    public int plz;
    public String ort;
    public String strasse;

    public String getString() {
        return String.format("%s, %d %s", strasse, plz, ort);
    }
}
