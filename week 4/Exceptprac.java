class Ex extends RuntimeException{
    public Ex(){
        super("jimsa;lsdk");
//        System.out.println(msg);
    }

}

public class Exceptprac {
    static void m1()throws Ex    {
        throw new Ex();
    }
    static void m2()throws Ex {
        m1();
    }

    public static void main(String[] args) {
                m2();




    }
}
