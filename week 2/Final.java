abstract class Prefinal{
     void m1(){
        System.out.println("m1pre");
    }
    int x = 10;
    abstract void m2();
}
class Quarterfinal extends Prefinal{
    void m1(){
        System.out.println("m1");
    }
    void m2(){
    }
}
public class Final {
    public static void main(String[] args) {
        Prefinal p = new Quarterfinal();
//        Prefinal pa = new Prefinal();
        p.m1();
//        Prefinal q = new Quarterfinal();
        Quarterfinal q = new Quarterfinal();
        q.m1();

    }
}
