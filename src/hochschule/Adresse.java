package hochschule;

public class Adresse {
    public int plz;
    public String ort;
    public String strasse;

    public Adresse(int plz, String ort, String strasse) {
        this.plz = plz;
        this.ort = ort;
        this.strasse = strasse;
    }

    public String getString() {
        return String.format("%s, %d %s", strasse, plz, ort);
    }
}
