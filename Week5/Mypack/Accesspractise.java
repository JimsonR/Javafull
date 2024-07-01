package Mypack;
class SubbuNotNormal{
    Accesspractise accesspractise = new Accesspractise();
    {
        System.out.println(accesspractise.privateClass);
        System.out.println(accesspractise.var1);
    }


}
public class Accesspractise {
    private static int i = 10;
    public static int j = 20;
    static int k = 30;
    protected static  int l = 40;

    //Non-Static vars
    private int nonStatic_i = 5;
    int nonStatic_j = 15;
    protected int nonStatic_k = 25;
    public int nonStatic_l = 35;

    int m1(){
        System.out.println();
        return  1;
    }

    private class PrivateClass {

        private int privateInnerVar = 2;
        public int privVar = 434;

    }
    PrivateClass privateClass = new PrivateClass();
    int var1 = new PrivateClass().privateInnerVar;

    public static void main(String[] args) {

        System.out.println(new Accesspractise());
        System.out.println(i);
        System.out.println(new Accesspractise().new PrivateClass().privateInnerVar);



    }
}
