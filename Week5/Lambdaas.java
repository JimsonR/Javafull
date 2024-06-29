interface FunctionalInterface {
    void method(int n);
//    void functionalMethod();
    interface FunctionalInterface2 {
        int method5(int n);
}
}
abstract class AbstractFunctionalInterface implements FunctionalInterface {
    public abstract void method();
    public abstract void functionalMethod();
     abstract void abstractmethod();
}
class Abcdef{
    static  void method(){
        System.out.println("Abcdef");
    }

}
class Abcdef2 extends Abcdef{
  static void method(){
       System.out.println("Abcdef2");
    }
}

public class Lambdaas {
    public static void main(String[] args) {
//        Abcdef abcdef = new Abcdef();
//        abcdef.method();
        Abcdef abcdef2 = new Abcdef2();
        Abcdef2 abcdef21 = new Abcdef2();
        abcdef21.method();

//Lip sad = new Lip() {
//    @Override
//    public void show() {
//
//    }
//};

        FunctionalInterface functionalInterface = (n)->  {
            System.out.println("Hello World");
        };
//
//        functionalInterface.method(10);

//        FunctionalInterface functionalInterface1 = new FunctionalInterface() {
//           public void method(){
//                System.out.println("Hello Lambdaas");
//            }
//            public void functionalMethod(){
//               System.out.println("Hello functionalMethod");
//            }
//        };
//        AbstractFunctionalInterface abstractFunctionalInterface = new AbstractFunctionalInterface() {
//            public void method(){
//                System.out.println("Hello Lambdaas");
//            }
//            public void functionalMethod(){
//                System.out.println("Hello functionalMethod");
//            }
//             void abstractmethod(){
//                System.out.println("Hello Lambdaas");
//            }
//        };

//        functionalInterface1.method();
//        functionalInterface1.functionalMethod();
    }
}
