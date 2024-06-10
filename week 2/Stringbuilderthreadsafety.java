public class Stringbuilderthreadsafety {
    private static StringBuilder str = new StringBuilder("hello");
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
               str.append("1");
            }
        });
    Thread t2 = new Thread(()->{
        for (int i = 0; i < 100; i++) {
            str.append("2");
        }
    });
    t1.start();
    t2.start();

    t1.join();
    t2.join();
    System.out.println("String builder after threads: "+ str.toString());

    }

}
