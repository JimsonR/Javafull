interface Int1{
    default void m1(){
        System.out.println("Interface 1");
    }
    default void m2(){

    }
}
interface Int2{
    default void m1(){
        System.out.println("Interface 2");
    }
}
public class Vtest  implements Int1,Int2 {
    @Override
    public void m1() {
        System.out.println("asdasd");
    }



    int i;

 {
//     int i;
        System.out.println(i);
    }







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
