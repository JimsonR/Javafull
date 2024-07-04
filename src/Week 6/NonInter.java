package Week

public class NonInter implements Runnable{
  public void run(){

      for (int i = 0; i < arr.length; i++) {
        System.out.print(i+" ");

      }

      System.out.println();

    }

    Integer c;
  int[] arr = {1,2,3,4,5};
    String sb = "hello";
    public static void main(String[] args) {


//              System.out.println(new NonInter().c);

//        ArrayList ints = new ArrayList();
//        new NonInter().run();
          Runnable run = new NonInter();

          Thread t1 = new Thread(run);
          Thread t2 = new Thread(run);

          int a = 10;
          int b = 20;
           int c = a+b;
           char ch = 'a'/'b';
//        System.out.println(ch);
//        System.out.println(c);
           String s = new String("sad");
           String s1 =new String( "sad");

           String s2 = s+s1;

//        System.out.println(s2);


          t1.start();
          t2.start();

          int[] arr = new int[10];
//        System.out.println(Arrays.toString(arr));

        Integer ab = 128;
        Integer bc = 126;
//        System.out.println(ab.hashCode());


        String sb = "hello";


//        System.out.println(sb == new NonInter().sb);

    }
}
