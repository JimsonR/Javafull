class SADdsa{
    static void m3(){
        System.out.println("Sadsasd");
    }
    protected SADdsa(){
//        System.out.println("Sadsa");
    }
   void m1(){
      System.out.println("Sadsdasd");
    }
}
class Rat extends SADdsa{
    static void m3(){
        System.out.println("Rat");
    }
}
class Jasdasd extends Rat{
    static void m3(){
        System.out.println("Jasdasd");
    }
    protected int i = 10;
     Jasdasd(){
//        System.out.println("Jadsad");
    }
//  int i = 0;
      void m1(){
         int i = 0;
        System.out.printf("Jadsasd");
    }
}
public class Newmethover extends Jasdasd{
   int i = 0;
   void m98I(){
       System.out.println(i);
   }
    public static void main(String[] args) {

       Rat rat =  new Newmethover();
       rat.m3();
       Jasdasd jasdasd = new Newmethover();
       jasdasd.m3();
       SADdsa saDdsa = new Newmethover();
       saDdsa.m3();

    }
}
