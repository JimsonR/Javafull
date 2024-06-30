import java.util.ArrayList;
import java.util.List;

public class Parent321 {
    static {
        System.out.println("Inside Parent static");
    }
    {
        System.out.println("Inside Parent init");
    }
    public Parent321()
    {
        System.out.println("Parent Const");
    }
    public static void main(String args[])
    {
        new MyChild();
    }
}

class MyChild extends Parent321 {
     {
        System.out.println("Inside child init");
    }
    static
    {
        System.out.println("Inside Child Static");
    }
    public MyChild(){
//        super();
        System.out.println("Child Const");
//        int i = 132;
//        byte b = (byte) i;
//        System.out.println(b);
//        int i = 132;
//        List list = new ArrayList();
//        list.add(new Object());
//        list.add("Hi");
//        list.add(i);


    }
}
