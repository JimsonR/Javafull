package Subpack;
import Mypack.Protectedpract;

public class Prot extends Protectedpract {
//   protected Object m1(){
//        return "Asd";
//    }
static  Prot prot = new Prot(){
      int m(){
          System.out.println("asd");
          return 1;
      }
      int i = m();
};


//    Object j =  m1();
    public static void main(String[] args) {
//        System.out.println(prot.i);
//        System.out.println(new Prot().i);


    }
}
