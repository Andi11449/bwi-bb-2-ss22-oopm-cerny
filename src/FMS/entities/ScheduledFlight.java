package FMS.entities;

import FMS.provided.DateTime;

public class ScheduledFlight extends Flight{

    private int distance;

    public ScheduledFlight(String flightID, String origin, String destination, DateTime departure, DateTime arrival, int distance) {
        super(flightID, origin, destination, departure, arrival);
        if (distance > 0)
            this.distance = distance;
    }

    public ScheduledFlight(ScheduledFlight f) {
        super(f);
        this.distance = f.distance;
    }

    @Override
    public int getBonusMiles() {
        return (distance / 1000) * 1000;
    }
}
