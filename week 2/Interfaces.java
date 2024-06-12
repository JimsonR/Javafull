interface Interfaces{
        int i = 10;

        void m1();
        void m2();
        void m3();
    int x = 20;

}
class Abc implements Interfaces {
//      int i = super.i+1;
    public void m1(){
        System.out.println(i);
    }
    public void m2(){
        System.out.println(i);
    }
    public void m3(){
        System.out.println(i);
    }
   static int x = 10;
 private class Privclass{
    
 }
 protected class ProtectedClass{
 }
}


class Main{

    public static void main(String[] args) {
        Interfaces a = new Abc();
        System.out.println(a.i);
//        Privclass m = new Privclass();
//        ProtectedClass m2 = new Abc();
//        System.out.println(m.i);
        System.out.println(a.i);
        Abc b = new Abc();
        System.out.println(b.x);


    }
}