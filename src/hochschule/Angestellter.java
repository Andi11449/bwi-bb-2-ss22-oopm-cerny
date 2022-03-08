package hochschule;

public class Angestellter extends Person {
    public Datum eintrittsdatum;

    @Override
    public void print() {
        System.out.println("Name: " + nachname + " " + vorname);
        System.out.println("Adresse: " + adresse.getString());
        System.out.println("Eintrittsdatum: " + eintrittsdatum.getString());
        System.out.println();
    }
}
