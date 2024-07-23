import java.util.*;
import java.util.stream.Stream;
interface Gun{
    String shoot(String s);
}
public class TestPract extends Thread{
    Runnable runnable;
    TestPract(Runnable runnable){
//        this.runnable = runnable;
        super(runnable);
    }
    int i;
    static int s;
   static int[] arr = {1,2,3,4,5};
//    public void run(){
//
//
//        synchronized(arr){
//
//
//            for(int i=0;i<arr.length;i++){
//
//                System.out.println(i);
//
//
//            }
//
//
//        }
//
//
//
//    }
    int main(int x){
        return 1;
    }
//    public static void main(String[] args, String[] r){
//        main(new String[1]);
//        System.out.println("asd");
//    }
   static void printList(List<? extends Number> list ){
        for(Number s : list){
            System.out.println(s);
        }
    }

    public static void main(String[] args)throws InterruptedException {
        TestPract thread1=new TestPract(()->{
            for(int i = 0; i < arr.length;i++){
                synchronized (arr){
//                System.out.println(arr[i]);
            }}
        });
        TestPract thread2=new TestPract(()->{
           synchronized (arr){
            for(int i = 0; i < arr.length;i++){
//                System.out.println(arr[i]);
            }}});


        thread1.start();
//        thread1.join();       //if neccesary
        thread2.start();


//        System.out.println("asd");
//        System.out.println(new TestPract().s);
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,5,6,3,2,8,10);
        Stream<Integer> stream = list.stream();

//        stream.sorted().filter(x->x%2==0).map(x->x*x).forEach(x-> System.out.print(x+" "));

        Gun gun= (x)->{return x;};
//        System.out.println(gun.shoot("me"));

        List<? super Double> list1 = new ArrayList<>();
        list1.add(1.0);
        List<String> list2 = new ArrayList<>();
//        printList(list1);
        Vector stack = new Stack();
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);


    }
}
