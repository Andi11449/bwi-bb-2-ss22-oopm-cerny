package bankApp;

public class Bankkonto {

    private double balance;

    public double getKontoStand() {
        return balance;
    }

    public boolean getMoney (double betrag) {
        if( balance >= betrag) {
            balance = balance - betrag;
            return true;
        }
        else
            return false;
    }

    public void addMoney(double betrag) {
        balance += betrag;
    }
}
