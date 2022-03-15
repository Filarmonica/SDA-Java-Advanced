package ro.sda.iulian.interfaces.ex1;

import java.time.Instant;

/**
 * Suppose you have written a time server that periodically notifies its clients of the current date and time. Write an interface the server could use to enforce a particular protocol on its clients.
 */

public class Server {

    private NotifyInteface[] clients;

    public Server(NotifyInteface[] clients){
        this.clients=clients;
    }
    public void notifyAllClients(){
        for(NotifyInteface client:clients){
            client.notifyClient(Instant.now());
        }
    }
}
