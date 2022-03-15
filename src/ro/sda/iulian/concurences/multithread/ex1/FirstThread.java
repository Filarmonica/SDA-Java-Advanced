package ro.sda.iulian.concurences.multithread.ex1;

public class FirstThread extends Thread {

    private String startUpMessage;
    public FirstThread (String startUpMessage) {
        this.startUpMessage = startUpMessage;
    }
    public void run() {
        try {
            System.out.println("Hello from first thread");
            Thread.sleep(1000);
            System.out.println("Hello from first thread");
            Thread.sleep(1000);
            System.out.println("Hello from first thread");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
