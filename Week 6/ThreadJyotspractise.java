class WaitCall implements Runnable{
    private final Object lock;

    WaitCall(Object lock){
        this.lock = lock;
    }
    @Override
    public void run() {
    synchronized (lock)   {

            try {

                System.out.println(Thread.currentThread().getName());
              lock.wait();
            } catch (InterruptedException e) {

            }
        }
    }
}
class NotifyCall implements Runnable{
    private final Object lock;

    NotifyCall(Object lock){
        this.lock = lock;
    }
    @Override
    public void run() {
        synchronized (lock) {

            System.out.println("NotifyCall thread notifying");
            lock.notify();
            System.out.println(Thread.currentThread());

            System.out.println("NotifyThread thread finished notifying.");
        }
    }
}

public class ThreadJyotspractise extends Thread {
    ThreadJyotspractise(Runnable rans){
        super(rans);
    }
    public static void main(String[] args) {
       Object lock = new Object();
        WaitCall waitCall = new WaitCall(lock);
        NotifyCall notifyCall = new NotifyCall(lock);

      ThreadJyotspractise threadJyotspractise = new ThreadJyotspractise(waitCall);

      ThreadJyotspractise threadJyotspractise1 = new ThreadJyotspractise(notifyCall);

      threadJyotspractise.start();

      threadJyotspractise1.start();


    }
}
