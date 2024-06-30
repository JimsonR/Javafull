public class Staticinner {
    static class Last{
        int i = 0;
        static int j = 0;
        void m1(){
            System.out.println("non-static method");
        }
        static void m2(){
            System.out.println("static method");
        }
    }

    public static void main(String[] args) {

    }
}
