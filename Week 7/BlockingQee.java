import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQee {
void m1(int i){

}

//    PrintWriter
public void m1(){

}

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(12);
        for (int i = 0; i < 12; i++) {
            arrayBlockingQueue.add(i);
        }
        Runnable runnable = ()->{
            for (int i = 0; i < arrayBlockingQueue.size(); i++) {
                System.out.println(arrayBlockingQueue);
            }
        };

        System.out.println(arrayBlockingQueue);
        String s1 = "World";
        String s2 = s1.substring(1, 3);
        System.out.println(s2);
        double result = 10.5 * 2;
        System.out.println(result);
        String str1 = "hello";
        String str2 = str1.substring(0, 2);
        System.out.println(str2);
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 4, 5};
//        int[] res = new int[arr1.length+arr2.length];
        int[][] res = {arr1, arr2};
        int poi = 1;
        int i = 0;
//        while(poi < arr1.length+arr2.length){
//            System.out.println(res[i][(poi-1) % arr1.length]);
//            if (res[i][poi % arr1.length]==res[i][poi % arr2.length]){
//                poi++;
//            }
//            if(poi%arr2.length==0){
//                i++;
//            }
//
//            }
        double value = 3.14;
        Integer a = 128;
        Integer b = 128;
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(Math.round(value));

        prime(1254);
        LinkedList<Integer> linkedList = new LinkedList<>();
        Collections.addAll(linkedList,1,2,3,4);

        for (int j = 0; j <linkedList.size() ; j++) {
            linkedList.add(j,linkedList.removeLast());
        }
        System.out.println(linkedList);
//        ListIterator<Integer> iterator = linkedList.listIterator(linkedList.size());
//        while(iterator.hasPrevious()){
//            System.out.println(iterator.previous());
//        }
            }

  static  void prime(int num){
    boolean bool = false;
    if(num % 2 == 0 | num % 3 == 0 | num % 5 == 0){
        bool = false;
    }
        for (int i = 6; i < num; i++) {
            if(num%i==0){
                bool = true;
                break;
            }
        }

        if(bool){
            System.out.println(num+ " is not prime");
        }else{
            System.out.println(num+ " is prime");
        }


    }
}
