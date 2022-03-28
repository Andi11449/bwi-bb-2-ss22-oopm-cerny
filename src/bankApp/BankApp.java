package bankApp;

import java.util.Scanner;

public class BankApp {

    static Scanner sc = new Scanner(System.in);

    Bankkonto bk;

    public void createNewBankkonto() {
        bk = new Bankkonto();
    }

    public void run() {
        System.out.println("Wählen Sie eine Aktion!");

        boolean stop = false;
        while(!stop){
            String aktion = sc.next();
            double amount;
            switch (aktion){
                case "Kontostand":
                    amount = bk.getKontoStand();
                    System.out.println("Kontostand: " + amount);
                    break;
                case "Einzahlung":
                    System.out.println("Wähle Betrag: ");
                    amount = sc.nextDouble();
                    bk.addMoney(amount);
                    System.out.println(amount + " eingezahlt!");
                    break;
                case "Auszahlung":
                    System.out.println("Wähle Betrag: ");
                    amount = sc.nextDouble();
                    boolean ok = bk.getMoney(amount);
                    if(ok)
                        System.out.println("Auszahlung erfolgt!");
                    else
                        System.out.println("Nicht genug Geld vorhanden!");
                    break;
                case "Stop":
                    System.out.println("Bank App wird geschlossen!");
                    stop = true;
            }
        }
    }

    private void print(String m) {
        System.out.println(m);
    }
}
