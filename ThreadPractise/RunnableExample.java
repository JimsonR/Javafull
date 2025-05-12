class MyRunnable implements Runnable{
    public void run(){

        for (int i = 1; i <= 5 ; i++) {
            System.out.println(Thread.currentThread().getName()+" - "+i);
        try {
            Thread.sleep(500);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        }

    }
}

public class RunnableExample {
    public static void main(String[] args) {



        Thread t1 = new Thread(new MyRunnable());

        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();

    }
}
