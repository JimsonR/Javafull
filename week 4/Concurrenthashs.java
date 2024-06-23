import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.*;

public class Concurrenthashs extends Thread {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        ConcurrentHashMap<Integer, String> map2 = new ConcurrentHashMap<>();
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();
        ConcurrentSkipListMap<Integer, String> map3 = new ConcurrentSkipListMap<>();
        Thread thread = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                map.put(i, String.valueOf(i));
            }
        });
        Thread t = new Thread(()->{
            for (int i = 100; i < 200; i++) {
                map.put(i, String.valueOf(i));
            }
        });
        thread.start();
        t.start();
        thread.join();
        t.join();
//        map.put(1, "one");
//        map.put(2, "two");
//        map.put(3, "three");
//        map.put(4, "four");
//        map.put(5, "five");
//        map.put(6, "six");
        System.out.println(map);
    }
}
