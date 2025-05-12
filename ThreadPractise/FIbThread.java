import java.util.HashMap;
import java.util.Map;

public class FIbThread {
static  Map<Integer,Long> map = new HashMap<>();
    static long fib(int num){
        long result;
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        if(map.containsKey(num)){
            return  map.get(num);
        }
        if(num <= 2 ){

            return 1;
        }
        else {
            result = fib(num - 1) + fib(num - 2);
        }
        map.put(num,result);

        return result;
    }

    public static void main(String[] args) throws InterruptedException {
//        System.out.println(fib(50));
        Thread thread1 = new Thread(()->{
            fib(50);
        });
        thread1.start();
        Thread thread2 = new Thread(()->{
            fib(50);
        });
        thread2.start();
        thread1.join();
    }

}
