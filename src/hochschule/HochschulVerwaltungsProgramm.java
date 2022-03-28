package hochschule;

public class HochschulVerwaltungsProgramm {

    static Person[] personal;

    public static void main(String[] args) {
        Angestellter a1 = new Angestellter("Andreas", "Cerny", 1010, "Wien",
                "Stephansplatz 1",1, 1, 2010);
        Angestellter a2 = new Angestellter("Markus", "Holzer", 1010, "Wien", "Stephansplatz 1",
                1, 9, 2015);
        Angestellter a3 = new Angestellter();
        Hilfskraft h1 = new Hilfskraft("Thomas", "Müller", 1210, "Wien", "Blastrasse 123", 1234567);
        Hilfskraft h2 = new Hilfskraft("Julia", "Musterfrau", 8010, "Graz", "Hauptplatz 12", 7654321);

        h1.addArbeitsvertrag(new Datum(1, 1, 2022), new Datum(31, 1, 2022), 4);
        h1.addArbeitsvertrag(new Datum(1, 3, 2022), new Datum(1, 8, 2022), 16);

        h2.addArbeitsvertrag(new Datum(1, 3, 2022), new Datum(1, 8, 2022), 18);

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
