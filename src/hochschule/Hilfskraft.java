package hochschule;

public class Hilfskraft extends Person {
    public int matrikelnummer;
    public Arbeitsvertrag[] arbeitsvertraege;

    public Hilfskraft(String vorname, String nachname, int plz, String ort, String strasse,
                        int matrikelnummer){
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = new Adresse(plz, ort, strasse);
        this.matrikelnummer = matrikelnummer;
    }

    public Arbeitsvertrag addArbeitsvertrag(Datum anfang, Datum ende, int stunden) {
        Arbeitsvertrag av = new Arbeitsvertrag(stunden, anfang, ende);
        av.anfang = anfang;
        av.ende = ende;
        av.stundenzahl = stunden;

        if(arbeitsvertraege == null) {
            arbeitsvertraege = new Arbeitsvertrag[1];
        }
        else {
            Arbeitsvertrag[] tmp = new Arbeitsvertrag[arbeitsvertraege.length + 1];
            for (int i = 0; i < arbeitsvertraege.length; i++) {
                tmp[i] = arbeitsvertraege[i];
            }
            arbeitsvertraege = tmp;
        }

        arbeitsvertraege[arbeitsvertraege.length-1] = av;
        return av;
    }

    @Override
    public void print() {
        System.out.println("Name: " + nachname + " " + vorname);
        System.out.println("Adresse: " + adresse.getString());
        System.out.println("Matrikelnummer: " + matrikelnummer);
        System.out.println("Arbeitsverträge: ");
        for (Arbeitsvertrag av : arbeitsvertraege) {
            System.out.println(av.getString());
        }
        System.out.println();
    }
}
