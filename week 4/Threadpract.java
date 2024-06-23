public class Threadpract implements Runnable {
    public void mymeth(){

    }
    public static void main(String[] args) {
        Threadpract threadpract = new Threadpract();
        Thread thread1 = new Thread(threadpract);

        thread1.start();
//        thread1.interrupt();
        System.out.println(thread1.isAlive());
    }
    public void pro(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    public void run(){
        pro();
    }
}
