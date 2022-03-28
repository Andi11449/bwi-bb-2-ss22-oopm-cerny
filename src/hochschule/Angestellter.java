package hochschule;

public class Angestellter extends Person {
    public Datum eintrittsdatum;

    public Angestellter(){
        this("Max", "Mustermann", -1, "Musterort", "Musterstrasse", -1, -1, -1);
    }

    public Angestellter(String vorname, String nachname) {
        this(vorname, nachname, -1, "Musterort", "Musterstrasse", -1, -1, -1);
    }

    public Angestellter(String vorname, String nachname, int tag, int monat, int jahr) {
        this(vorname, nachname, -1, "Musterort", "Musterstrasse", tag, monat, jahr);
    }

    public Angestellter(String vorname, String nachname, int plz, String ort, String strasse) {
        this(vorname, nachname, plz, ort, strasse, -1, -1, -1);
    }

    public Angestellter(String vorname, String nachname, int plz, String ort, String strasse,
                        int tag, int monat, int jahr){
        this.vorname = vorname;
        this.nachname = nachname;
        this.eintrittsdatum = new Datum(tag, monat, jahr);
        this.adresse = new Adresse(plz, ort, strasse);
    }

    @Override
    public void print() {
        System.out.println("Name: " + nachname + " " + vorname);
        System.out.println("Adresse: " + adresse.getString());
        System.out.println("Eintrittsdatum: " + eintrittsdatum.getString());
        System.out.println();
    }
}
