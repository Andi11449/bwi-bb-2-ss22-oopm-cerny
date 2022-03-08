package hochschule;

public class HochschulVerwaltungsProgramm {

    static Person[] personal;

    public static void main(String[] args) {
        Angestellter a1 = createAngestellter("Andreas", "Cerny", 1010, "Wien",
                "Stephansplatz 1",1, 1, 2010);
        Angestellter a2 = createAngestellter("Markus", "Holzer", 1010, "Wien", "Stephansplatz 1",
                1, 9, 2015);
        Hilfskraft h1 = createHilfskraft("Thomas", "Müller", 1210, "Wien", "Blastrasse 123", 1234567);
        Hilfskraft h2 = createHilfskraft("Julia", "Musterfrau", 8010, "Graz", "Hauptplatz 12", 7654321);

        h1.addArbeitsvertrag(createDatum(1, 1, 2022), createDatum(31, 1, 2022), 4);
        h1.addArbeitsvertrag(createDatum(1, 3, 2022), createDatum(1, 8, 2022), 16);

        h2.addArbeitsvertrag(createDatum(1, 3, 2022), createDatum(1, 8, 2022), 18);

        addPersonal(a1);
        addPersonal(h1);
        addPersonal(h2);
        addPersonal(a2);

        printPersonal();
    }

    private static void printPersonal() {
        for (Person p : personal) {
            p.print();
        }
    }

    public static Datum createDatum(int tag, int monat, int jahr) {
        Datum d = new Datum();
        d.tag = tag;
        d.monat = monat;
        d.jahr = jahr;
        return d;
    }

    public static Angestellter createAngestellter(String vorname, String nachname, int plz, String ort, String strasse,
                                       int tag, int monat, int jahr) {
        Angestellter ag = new Angestellter();
        ag.vorname = vorname;
        ag.nachname = nachname;
        ag.adresse = new Adresse();
        ag.adresse.plz = plz;
        ag.adresse.ort = ort;
        ag.adresse.strasse = strasse;
        ag.eintrittsdatum = new Datum();
        ag.eintrittsdatum.tag = tag;
        ag.eintrittsdatum.monat = monat;
        ag.eintrittsdatum.jahr = jahr;

        return ag;
    }

    public static Hilfskraft createHilfskraft(String vorname, String nachname, int plz, String ort, String strasse, int matrikelnummer) {
        Hilfskraft hk = new Hilfskraft();
        hk.vorname = vorname;
        hk.nachname = nachname;
        hk.adresse = new Adresse();
        hk.adresse.plz = plz;
        hk.adresse.ort = ort;
        hk.adresse.strasse = strasse;
        hk.matrikelnummer = matrikelnummer;

        return hk;
    }

    private static void addPersonal(Person p) {
        if(personal == null) {
            personal = new Person[1];
        }
        else {
            Person[] tmp = new Person[personal.length + 1];
            for (int i = 0; i < personal.length; i++) {
                tmp[i] = personal[i];
            }
            personal = tmp;
        }

        personal[personal.length-1] = p;
    }


}
