class Jyo{
    public static void m1(){
        System.out.println("parent class");
    }
}
public class JavaPractise4 extends Jyo{
    public static void m1(){
        System.out.println("sub class");
    }
    public static void m1(int n){

    }
    public static void main(String[] args) {
        JavaPractise4 javaPractise4 = new JavaPractise4();
        javaPractise4.m1();
        javaPractise4.m1(2);

    }
}
