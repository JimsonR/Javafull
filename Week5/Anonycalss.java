//abstract class AbstractClass {
//   abstract void m1();
//}
class Abcde{
    static void m1(){
        System.out.println("Abcde");
    }
}
class Def extends Abcde{
    static void m1(){
        System.out.println("Def");
    }
}
public class Anonycalss {
    public static void main(String[] args) {
//        AbstractClass abs = new AbstractClass() {
//            void m1(){
//                System.out.println("m1");
//            }
//        };
        Def m1 = new Def();

        Abcde m2 = new Abcde();
        m1.m1();
    }
}
