class CustomThread extends Thread{
    CustomThread (Runnable ran){
        super(ran);
    }
}
class Running implements Runnable{

    private final Object lock;
    Running(Object lock){
        this.lock = lock;
    }
    @Override
    public void run() {
        synchronized (Thread.currentThread()) {
//        synchronized (lock) {
            try {
Thread.currentThread().wait();
//              lock.wait();
            }
            catch (InterruptedException e) {

            }
        }
    }
}
class RanAway implements Runnable {
    private final Object lock;

    RanAway(Object lock) {

        this.lock = lock;
    }

    @Override
    public  void run() {

        synchronized (Thread.currentThread()) {
//        synchronized (lock) {
            System.out.println("before notify");
           for(int i = 0; i < 10; i++) {
               try {
                   Thread.sleep(100);
               } catch (InterruptedException e) {

               }
               Thread.currentThread().notifyAll();
//
//            lock.notify();
               System.out.println(Thread.currentThread().getName()+" "+i);
           }
           }

    }
}
public class Threadpractise {
   static String[] aray = {"asddsa","dsasd","dsasdsdsasdsasdsasd","My name"};
Boolean condition = false;
    void  doWait() {
       synchronized (Thread.currentThread()){
//           while (!condition) {
//               try {
//                 Thread.currentThread().wait();
//               }
//               catch (InterruptedException e) {
//
//               }

               for (int i = 0; i < aray.length; i++) {
                   System.out.println(Thread.currentThread().getName()+" "+aray[i]+" ");

               }

           }
//       }
    }

     void doNotify(){
        synchronized (Thread.currentThread()) {
            condition = true;
            Thread.currentThread().notify();
        }
    }

    public static void main(String[] args) {
        Object lock = new Object();

        Running running = new Running(lock);

        RanAway ranAway = new RanAway(lock);

        CustomThread customThread = new CustomThread(running);

        CustomThread customThread1 = new CustomThread(ranAway);

        CustomThread customThread2 = new CustomThread(ranAway);
        Threadpractise threadpractise = new Threadpractise();

        CustomThread customThread3 = new CustomThread(()->{
//           synchronized (Thread.currentThread()){
            threadpractise.doWait();
//}
        });

        CustomThread customThread4 = new CustomThread(()->{

//            try {
//                Thread.sleep(2000);
//            }catch (InterruptedException e){
//
//            }
//            synchronized (Thread.currentThread()) {

                threadpractise.doWait();
//            }
        });

      CustomThread  customThread5 = new CustomThread(()->{
//synchronized (Thread.currentThread()) {
//          try {
//              Thread.sleep(2000);
//          }catch (InterruptedException e){
//
//          }
    threadpractise.doNotify();
//}
      });



//        CustomThread customThread2 = new CustomThread(()->{
//
//                try{
////        Thread.sleep(2000);
//                   customThread1.wait();
//                }catch (InterruptedException e){
//
//                }
//
//        }) ;
        customThread3.start();
        customThread4.start();
        customThread5.start();
//
//        customThread.start();
//
//        customThread1.start();
//
//        customThread2.start();
//Thread.currentThread().yield();

//        System.out.println(customThread);


    }
}
