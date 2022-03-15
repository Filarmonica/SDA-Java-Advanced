package ro.sda.iulian.interfaces.ex1;

import java.time.Instant;

public class ClientA implements NotifyInteface {

    @Override
    public void notifyClient(Instant currentDateAndTime) {
        System.out.println(currentDateAndTime);
    }
}
