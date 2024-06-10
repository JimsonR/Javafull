public class Stringbufferthreadsafety {
    private static StringBuffer buffer = new StringBuffer("hello");
    public static void main(String[] args)throws InterruptedException {
        Thread t1  = new Thread(()-> {
            for (int i = 0; i < 100; i++) {
                buffer.append("1");
            }
        });
        Thread t2  = new Thread(()-> {
            for (int i = 0; i < 100; i++) {
                buffer.append("2");
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("StringBuffer after threads: "+buffer.toString());

    }
}
