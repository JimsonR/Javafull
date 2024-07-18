import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Threadpractise1 implements Runnable {
    volatile int j ;

    public synchronized void run(){
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(Thread.currentThread().getName()+" ");
            j++;

//            System.out.print(" "+arrayList1.get(i) + " ");
            System.out.println(j);
//            System.out.println(j+2);


            try {
                wait();
                Thread.sleep(200);
            } catch (InterruptedException e) {

            }
//            System.out.println(Thread.currentThread().getName()+" - Yield at"+System.currentTimeMillis());
//            Thread.yield();
//            System.out.println(Thread.currentThread().getName()+" - Resumed at"+System.currentTimeMillis());


        }
        System.out.println();
    }
   static ArrayList<Integer> arrayList = new ArrayList<>();

   static List<Integer> arrayList1 = Collections.synchronizedList(arrayList);
    public static void main(String[] args)throws InterruptedException {
        Collections.addAll(arrayList, 0,1);
        for (int i = 0; i < 10; i++) {
            arrayList.add(arrayList.get(arrayList.size() - 1) + arrayList.get(arrayList.size() - 2));
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//
//            }

        }

       Runnable runnable = ()->{
//            synchronized (arrayList) {
                for (int i = 0; i < arrayList1.size(); i++) {
                    System.out.print(arrayList1.get(i) + " ");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {

                    }

                }
            System.out.println();
//            }


        };
Threadpractise1 threadpractise1 = new Threadpractise1();
        Thread thread1 = new Thread(threadpractise1);

        Thread thread2 = new Thread(threadpractise1);

        Thread thread3 = new Thread(()->{
         synchronized (arrayList1)  {
                for (int i = 0; i < arrayList1.size(); i++) {
                    System.out.println(arrayList1.get(i));
                }

                arrayList1.notifyAll();
                System.out.println();
            }

        });

        thread1.start();
        thread1.setName("First");
thread1.setPriority(Thread.MAX_PRIORITY);

        thread2.start();
        thread2.setName("Second");
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread3.start();


//        System.out.println(arrayList1);
//        String str = "abcdef";
//        String substr = str.substring(2);
//        System.out.println(substr);
//        float result = 7 / 2f;
//        System.out.println(result);
//        StringBuffer sb = new StringBuffer("Hello");
//        sb.replace(1, 3, "Java");
//        System.out.println(sb);
    }
}
