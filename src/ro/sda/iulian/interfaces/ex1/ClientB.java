package ro.sda.iulian.interfaces.ex1;

import java.time.Instant;

public class ClientB implements NotifyInteface {

    @Override
    public void notifyClient(Instant currentDateAndTime) {
        System.err.println(currentDateAndTime);
    }
}
