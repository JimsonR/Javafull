import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class Othrer extends Thread{
    Othrer(Runnable runs){
        super(runs);
    }
}
public class ThreadsJavaJyoths implements Runnable{
   int[] arr = {1,2,3,4,5,6,7,8};


    public void run() {

            for (int i = 0; i < arr.length; i++) {
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();

                }
                System.out.print(arr[i] + " ");

            }

//        System.out.println();
    }


    public static void main(String[] args) throws InterruptedException {

//        Thread thread = new Thread(new ThreadsJavaJyoths());
        Othrer othrer = new Othrer(new ThreadsJavaJyoths());

        Othrer othrer1 = new Othrer(new ThreadsJavaJyoths());
//        thread.start();

        othrer.start();
//        othrer.join();

        othrer1.start();

//        othrer.join();









    }
}
