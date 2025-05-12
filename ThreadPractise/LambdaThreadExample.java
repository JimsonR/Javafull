public class LambdaThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i = 1; i <= 5 ; i++) {
                System.out.println(Thread.currentThread().getName() +" - "+i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(()->{

            for (int i = 1; i <= 5 ; i++) {
                System.out.println(Thread.currentThread().getName() +" - "+i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }

        });

        t1.start();
        t2.start();
    }
}
