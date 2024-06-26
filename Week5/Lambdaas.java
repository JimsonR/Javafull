interface FunctionalInterface {
    void method();
    void functionalMethod();
}
abstract class AbstractFunctionalInterface implements FunctionalInterface {
    public abstract void method();
    public abstract void functionalMethod();
     abstract void abstractmethod();
}
public class Lambdaas {
    public static void main(String[] args) {
//        FunctionalInterface functionalInterface = () -> {
//            System.out.println("Hello World");
//        };
        FunctionalInterface functionalInterface1 = new FunctionalInterface() {
           public void method(){
                System.out.println("Hello Lambdaas");
            }
            public void functionalMethod(){
               System.out.println("Hello functionalMethod");
            }
        };
        AbstractFunctionalInterface abstractFunctionalInterface = new AbstractFunctionalInterface() {
            public void method(){
                System.out.println("Hello Lambdaas");
            }
            public void functionalMethod(){
                System.out.println("Hello functionalMethod");
            }
             void abstractmethod(){
                System.out.println("Hello Lambdaas");
            }
        };

        functionalInterface1.method();
        functionalInterface1.functionalMethod();
    }
}
