class Parent11{
    protected Parent11(String str){
        System.out.println("Parent11");
    }
}
public class Test extends Parent11{
     Test(){
         super("Test");
        System.out.println("Test");
    }
    static int i=5;
    final public static void main(String[] args) {
//        super("Hi");
//        Test test = null;
//        System.out.println("i value is "+i);
        System.out.println(" String ".trim().equals("String"));
//        return 1;
    }
}
