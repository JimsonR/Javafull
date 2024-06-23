interface Interface1 {
    default void method() {

    }
    static void method2() {}
}
interface Interface2 {
    private void method() {

    }
    private static void method2() {

    }
}

class Parent1 implements Interface1, Interface2 {

    public Parent1(){

        System.out.println("Parent1");
    }
}
 class Child1 extends Parent1 {

    public Child1() {
        super();
        System.out.println("Child1");
    }
}


   public class Interfacing {
    static void m1(){

    }
    static void m1(int i){
        System.out.println(i);
       }
       static void run(){

       }
        public static void main(String[] args) {
//        Interface2.method2();
//        static int num = 10;
            int num1 = 160;
            int num2 = 40;
            int num3 = 560;
            Child1 child1 = new Child1();
            m1(1);
            int num4 = num1 > num2 && num1 > num3 ? num1 : num2 > num3 ? num2 : num3;
            System.out.println(num4);
        }
    }
