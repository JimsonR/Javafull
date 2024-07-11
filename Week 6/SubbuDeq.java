import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SubbuDeq {

    public boolean condition = false;
  static  Stack stack =new Stack<>();
  static  Queue queue = new ConcurrentLinkedQueue();
//    Runnable runs = ()->{
//        for(int i = 0 ; i<10; i++){
//            stack.push(i);
//            queue.add(i);
//
//
//        }
//    };
    public synchronized void doWait(){
        while (!condition){
            System.out.println( Thread.currentThread().getName());

            try {
                wait();

            }
            catch (InterruptedException e){

            }


        }
        System.out.println("Codition met");

    }
    public synchronized void doNotify(){
        condition = true;
        notify();
    }

    public static void main(String[] args)throws InterruptedException {
//       new SubbuDeq().m1();

//        Othrer othrer = new Othrer(new SubbuDeq().runs);
//
//        Othrer othrer1 = new Othrer(new SubbuDeq().runs);
        SubbuDeq subbuDeq = new SubbuDeq();
        Othrer othrer2 = new Othrer(()-> {

                System.out.println("waiting");

                subbuDeq.doWait();

        });

        Othrer othrer3 = new Othrer(()->{
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
//            othrer2.notify();
            subbuDeq.doNotify();
        });
        othrer2.start();
        othrer3.start();



//        othrer.join();

//        System.out.println(stack);
//        System.out.println(queue);
    ArrayList asd = new ArrayList();

    }
}
