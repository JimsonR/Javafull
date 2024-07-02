import java.util.*;
import java.util.stream.Stream;

public class Practise123 implements Runnable{
    Integer a;

    public void run(){
        System.out.println("asd");
    }
//    synchronized  void m1(){
//
//    }
    public static void main(String[] args) throws InterruptedException  {
        int[] arr = {1,3,21,23,1,3123,4};
        int target = 23;

        HashMap<Integer, ArrayList> hm = new HashMap();

//        System.out.println(Arrays.binarySearch(arr,target));
//        for(int i = arr.length-1;i>=0;i--){
//            System.out.printf("%d\t%d \n",arr[i],i);
//            System.out.println(arr[arr.length-1-i]+" "+ (arr.length-i-1));
//            System.out.println(arr[i]);
//        }

        for(int i = 0; i< arr.length;i++){
//            ArrayList list = new ArrayList();
//            list.add(i);
            if (hm.containsKey(arr[i])){
               hm.get(arr[i]).add(i);
//                hm.put(arr[i], hm.);
            }
            else {
                hm.put(arr[i],new ArrayList());
                hm.get(arr[i]).add(i);
//                hm.get(arr[i]).get(20);
            }
            }
        Collections.synchronizedMap(hm);
////        System.out.println(hm);
//        for(Map.Entry<Integer,ArrayList> s: hm.entrySet()){
//            System.out.println(s);
//
//        }
////        Iterator itr = hm.entrySet().iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        System.out.println(hm.get(target));
//        System.out.println((int)Math.pow(-4,2));
//        System.out.println(new Practise123().a);
       int[]  nums = {-4,-1,0,3,10};

//       Thread t1 = new Thread(()->{
//           System.out.println("asdasd");
//       });
//       t1.setName("t1");
//       t1.start();
//        System.out.println(t1.currentThread());

//        Runnable r1 =new Practise123();
//
//        Thread t1 = new Thread(r1);
//        t1.start();


//       t1.run();

        int[] arr1 = {1,2,3,4,5,3465,123,1243,432,523,423,4,23446,354,532,4,234,346,35,645,7,456,34,5,234,235,23,534,6,356,345,3245,436,345,234,23,534,654,6,345,23,534,654,6,345,23,5,346,345,34,534,654,6,34,634,5,234,235,34,634,6,3244,235,3456,};

        Runnable run = new Runnable() {
            @Override
            public void run() {
                synchronized (arr1){

                    for (int i = 0; i < arr1.length; i++) {
                        System.out.print(arr1[i] + " ");
                    }
                    System.out.println();
                }
            }
        };


        Thread t1 = new Thread(run);


        Thread t2 = new Thread(run);


        t1.start();


        t2.start();


//        Thread t1 = new Thread(()->{
//           synchronized (arr1){
//
//                for (int i = 0; i < arr1.length; i++) {
//                    System.out.print(arr1[i] + " ");
//                }
//                System.out.println();
//            }
//        });
//
//        Thread t2 = new Thread(()->{
//           synchronized (arr1){
//                for (int i = 0; i < arr1.length; i++) {
//                    System.out.print(arr1[i]+" ");
//                }
//            }
//        });
//        t1.start();
//
//        t2.start();

//        t1.join();
//        t2.join();


//     int[] arr1=   Arrays.stream(nums).map((x)->{
//                return x*x;
//            }).sorted().toArray();
//        System.out.println(Arrays.toString(arr1));



    }
}
