import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " is executing the task");
    }
}



public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5 ; i++) {
            executor.execute(new Task1());
        }
        executor.shutdown();
    }
}
