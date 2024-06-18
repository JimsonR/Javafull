public class Threadlocals {
    private static ThreadLocal<Integer> threadLocal= ThreadLocal.withInitial(()->0);
    public static void main(String[] args) {
//        private ThreadLocal threadLocal = new ThreadLocal<Integer>() {
//            @Override Protected Integer intitalValue() {
//                return nextId.getAndIncrement;
//
//        };

//        ThreadLocal tl = new ThreadLocal();
//        tl.set(1);
//        Integer i = (Integer) tl.get();
//
//        ThreadLocal<Integer> tl2 = new ThreadLocal<>();
//        tl2.set(2);
//        Integer i2 = tl2.get();
            Runnable task = ()-> {
                threadLocal.set((int) (Math.random()*100));
System.out.println(Thread.currentThread().getName()+"initial value: "+ threadLocal.get());
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"final value: "+ threadLocal.get());
            };
            Thread thread1 = new Thread(task, "Thread 1 ");
            Thread thread2 = new Thread(task,"Thread 2 ");

            thread1.start();
            thread2.start();


    }
}
