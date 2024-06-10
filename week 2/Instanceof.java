class A {
     void m() {
        System.out.println("A");
    }
}
class B extends A {
      void m() {
        System.out.println("B");
    }

}
public class Instanceof {

    public static void main(String[] args) {
        B b = new B();
        b.m();
        System.out.println(b instanceof A);
    }
}
