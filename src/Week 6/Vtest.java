package Week

public class Vtest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Runnable run = new Runnable() {
            @Override
            public synchronized void run() {
                for (int i = 0; i< arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        };
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t1.start();


        t2.start();
    }
}
