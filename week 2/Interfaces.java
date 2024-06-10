interface Interfaces{
    int i = 10;
    void m1();
    void m2();
    void m3();


}
class Abc implements Interfaces {
      int i = 20;
    public void m1(){
        System.out.println(i);
    }
    public void m2(){
        System.out.println(i);
    }
    public void m3(){
        System.out.println(i);
    }

 }
class Main extends Abc implements Interfaces{
    public static void main(String[] args) {
        Interfaces a = new Abc();
        System.out.println(a.i);
        Interfaces m = new Main();
        System.out.println(m.i);


        System.out.println(a.i);
        Abc b = new Abc();
        System.out.println(b.i);

    }
}