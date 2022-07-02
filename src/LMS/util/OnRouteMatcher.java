package LMS.util;

import LMS.provided.Matcher;
import LMS.entities.Delivery;

public class OnRouteMatcher implements Matcher<Delivery> {

    @Override
    public boolean matches(Delivery delivery) {
        return delivery.isCollected() && !delivery.isDelivered();
    }
}
