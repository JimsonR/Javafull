import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;

interface Lip {
//
//    interface Pol{
//        default void pol(){
//            System.out.println("Polling");
//        }
//    }
    void pol();
    void show();
//    void show(String s);
// void m1(){
//     System.out.println("Lip");
// }
    private void m3(){
        System.out.println("sassd");
    }

    int j = 10;

    default void print() {
        System.out.println("Lip");
    }
//
//    static void m1() {
//        System.out.println("m1");
    }

abstract class AbstractPol{
     AbstractPol(){
         System.out.println("AbstractPol");
     }
     abstract void show1();
    abstract void show2();
    void shoasd(){
        System.out.println("AbstractPol");

    }
    abstract void show3();
}


interface Adsadss{
        void show();
        default void print() {
//            System.out.println("Adsadss");
//            return 0;
        }
}

public class Question05 extends AbstractPol implements Lip {
    void show1(){
        System.out.println("Adsadss");
    }
    void show2(){
        System.out.println("Adsadss");
    }
    void show3(){
        System.out.println("Adsadss");
    }
    public void pol(){
        System.out.println("Adsadss");
    }


//    public void print(){
////        System.out.println("Teeth");
//        Adsadss.super.print();
//    }
//    public void print(){
//        System.out.println("Adsadss");
//    }
//    public void show(){
//        System.out.println("Lip");
//    }
    public void show(){
//        System.out.println("Adsad");
//        return 0;
    }
    public static void main(String[] args) {


        AbstractPol abpol = new Question05();
//        Lip.j++;











//
//        Question05 q = new Question05();
//        q.pol();
//        q.print();
//        Pol p = new Pol() {
//
//        };


//        Lip lip = new Question05();

//        Lip.m1();
//        System.out.println(Lip.j);





//        Adsad adsad = new Adsad();
//        Lip lip2 = new Lip() {
//           public void show(){
////                System.out.println("Lip");
//            }
//
//        };
//        lip2.


//        Lip lip1 = (x)->{
//            System.out.println("asdasdasd");
//        };
//        lip1.show("asdasd");
//        System.out.println();














//        Question05 q = new Question05();
//        q.print();
//        Question05Sub myref = new Question05Sub();
//        try{
//            myref.test();
//        }
//        catch(IOException ioe){
//
//        }
//    }
//
//    void test() throws IOException {
//        System.out.println("In Question05_JBK");
//        throw new IOException();
    }
}

class Question05Sub extends Question05 {
    void test()throws IOException{

//        System.out.println("In Question05Sub");
        throw new IOException();
    }
}
