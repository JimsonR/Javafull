import java.util.HashMap;

public class Widening1 {
    public void f1(String s)
    {
        System.out.println("Inside f1 with String as argument");
    }
    public void f1(Object o1)
    {
        System.out.println("Inside f1 with object as argument");
    }

//    public void f1(Object o1){
//        System.out.println("Inside f1 Object as argument");
//    }
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> asd = new HashMap<>();
        new Widening1().f1(null);
    }
}
