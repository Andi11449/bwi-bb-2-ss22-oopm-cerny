package LMS.entities;

public class RegionalDelivery extends Delivery{

    private boolean express = false;

    public RegionalDelivery(long id, String from, String to) {
        super(id, from, to);
    }

    public RegionalDelivery(long id, String from, String to, boolean express) {
        super(id, from, to);
        this.express = express;
    }

    @Override
    public int getTotal() {
        float value = totalMass();
        if(express)
            value *= 1.2;
        return (int)(value * 100);
    }
}
