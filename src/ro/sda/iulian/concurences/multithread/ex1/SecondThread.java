package ro.sda.iulian.concurences.multithread.ex1;

public class SecondThread extends Thread{
    public void run(){
        System.gc();
        System.out.println("Message from second thread");
    }
}
