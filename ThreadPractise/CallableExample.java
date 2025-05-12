import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Integer>{
    public Integer call(){
        return 10 * 10;
    }
}

public class CallableExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new MyCallable());

        try{
            System.out.println("Result: "+ future.get());
        }catch (Exception e){
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
