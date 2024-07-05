interface Int1{
    default void m1(){
        System.out.println("Interface 1");
    }
    default void m2(){

    }
}
interface Int2 extends  Int1{
    default void m1(){
        System.out.println("Interface 2");
    }
}
public class Vtest  implements Int1,Int2 {

     void m12(){

     }
   static{
        new Vtest().m12();
        Vtest vtest = new Vtest();
        System.out.println(vtest.i);
    }
//    @Override
//    public void m1() {
//        System.out.println("asdasd");
//    }
 static {
    System.out.println();
}

   static int i = 0;









    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Runnable run = new Runnable() {
            @Override
            public synchronized void run() {
                for (int i = 0; i< arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        };




        Thread t1 = new Thread(()->{
        synchronized (arr){
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }});
        Thread t2 = new Thread(()->{
            synchronized (arr){
            for(int i = 0; i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

        }});

        t1.start();


        t2.start();
    }
}
