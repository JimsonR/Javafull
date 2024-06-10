class Stat {
    static {
        System.out.println("ssssasd");
    }

    static int x = m1();

    //    static String s = "ssssss";
//    static{
//        x = 10/2;
//        System.out.println(x);
//    }
    static int m1(){
        System.out.println(1);
        return 2;
    }

    static{
        Stat stat = new Stat();
        stat.m1();
//        Statimpl statimpl = new Statimpl();
    }
//    static{
//      m1();
//    }
}
public class Statimpl {
    public static void main(String[] args)
    {
        System.out.println(Stat.x);
    }
}
