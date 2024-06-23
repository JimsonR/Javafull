import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.CopyOnWriteArrayList;


public class Cncurrenthmapmodexcept extends Thread {
    public static void main(String[] args) throws InterruptedException {

           HashMap<String, String> map = new HashMap<>();
//        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        map.put("1","one");
        map.put("2","two");
        map.put("3","three");

        Thread writert1 = new Thread(()->{
//            synchronized (map) {
                for (int i = 4; i < 10; i++) {
                    map.put(String.valueOf(i), "number " + i);

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//            }
        });
        Thread readert2 = new Thread(()->{
//            synchronized (map){
                for (int i = 1; i < 10; i++) {
                    map.forEach((key, value) -> System.out.println(key + " : " + value));
                    try {
                        Thread.sleep(150);
                    } catch (InterruptedException e) {
                    }
                }
//            }
        });
        writert1.start();
        readert2.start();

        writert1.join();
        readert2.join();


    }
}
