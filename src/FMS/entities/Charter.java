package FMS.entities;

import FMS.provided.DateTime;

public class Charter extends Flight {
    public Charter(String flightID, String origin, String destination, DateTime departure, DateTime arrival) {
        super(flightID, origin, destination, departure, arrival);
    }

    @Override
    public int getBonusMiles() {
        return 350;
    }
}
