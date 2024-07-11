import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class Arraylist {
    {
//        System.out.println("adsasd");
    }
//    int i = 0;
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        System.out.println("jim");
//        int a = 10;
//        int b = 20;
//        int c = a & b;
//        System.out.println(c);
//        String s1 = "Hello";
//        String s2 = "World";
//        System.out.println(s1.concat(s2));
//        int a = 5;
//        int b = 10;
//        int c = ++a + b--;
//        System.out.println(a + " " + b + " " + c);
//        float f = 5.99999f;
////        int i = (int) f;
////        System.out.println(i);
//        int result = 10 * (2 + 3) / (5 - 3);
//        System.out.println(result);
//
//        String str1 = "test";
//        String str2 = new String("test");
//
//        System.out.println(str1 == str2.intern());
//
//        String str = "Hello World";
//        String[] strs = str.split(" ");
//
//        System.out.println(Arrays.toString(strs));
//
//        for(int i = 0 ; i< strs.length; i++){
//            System.out.print(strs[strs.length-i-1]+" ");
//        }
//        BlockingQueue blockingQueue = ne;

//        for(int i = 0; i < str.length(); i++){
//            System.out.println();
//        }
//        int a = 8;
//        int b = a >> 2;
////        System.out.println(b);
//        new Arraylist();
//
//        Deque<Integer> blockingQueue = new LinkedBlockingDeque<>(25);
//        blockingQueue.add(1);
//        blockingQueue.add(2);
//        blockingQueue.add(3);
//        for (int i = 1; i < 20; i++) {
//            blockingQueue.add(i);
//        }
//        System.out.println(blockingQueue);
//
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue(Comparator.reverseOrder());

//        priorityQueue.add(3);
//        priorityQueue.add(1);
//        priorityQueue.add(1);


////        System.out.println(priorityQueue.peek());
//        for (int i = 0; i < 10; i++) {
//            priorityQueue.add(10 - i + 1);
////            System.out.println(priorityQueue);
//        }
//
//
////        System.out.println(priorityQueue);
//        byte b = 127;
//        b++;

//        System.out.println(b);
//        ArrayList<Integer> arraylist = new ArrayList<>();
//
//        for (int i = 0; i < 100; i++) {
//            arraylist.add(i);
//        }
//
//
//        Stream<Integer> stream = arraylist.stream();
//
//        stream.filter(x -> !(x >= 40 && x <= 60));
//



        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i=1; i<=20; i++){
            linkedList.add(i);
        }

        System.out.println(linkedList);

//        Iterator iterator = linkedList.listIterator();

        ListIterator<Integer> iterator1 = linkedList.listIterator(linkedList.size()-1);

        while(iterator1.hasPrevious()){
            System.out.println(iterator1.previous());
        }
    }
}
