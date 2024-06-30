import java.io.IOException;

abstract class Abstr extends Abstractsep{
 abstract void m1();
 void m2()
 {
     System.out.println("Abstr sad");
//     throw new IOException("asdasd");
 }

}
//abstract class Dasd extends Abstr{
//
//}
public class Abstractsep  {
    void m1(){

    }
    void m2(){
        System.out.println("asdasd");
    }
    public static void main(String[] args) {
        Abstractsep asd = new Abstractsep();
        asd.m2();

    }
}
