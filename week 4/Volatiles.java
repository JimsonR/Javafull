import java.io.Writer;

public class Volatiles {
    private static  volatile boolean flag =false;
    public static void main(String[] args) throws InterruptedException {
        Thread writerThread = new Thread(()->{
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            flag = true;
            System.out.println("Writer thread set flag to true");
        });
        Thread readerThread = new Thread(()->{
            while(!flag){
                //Busy-wait until flag becomes true
//                System.out.println("Reader thread set flag to false");

            }
            System.out.println("Readerthread detected flag change");
        });

        writerThread.start();
        readerThread.start();

        writerThread.join();
        readerThread.join();

    }
}
