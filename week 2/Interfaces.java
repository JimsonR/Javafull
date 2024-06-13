interface Interfaces1{

}
interface Interfaces2{

}
interface Interfaces{
        int i = 10;
        String m1();
        void m2();
        default void m4(){
            System.out.println("m4");
        }
         static void m5(){
            System.out.println("m5");
        }
        private static void m6(){
            System.out.println("m6");
        }
        private void m7(){
            System.out.println("m7");
        }
    int x = 20;
}
class Abc implements Interfaces, Interfaces1, Interfaces2 {
//      int i = super.i+1;
    @Override
     public String m1(){
        System.out.println(i);
        return "m1";
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
class Main1{
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