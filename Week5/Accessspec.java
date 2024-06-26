class Niar{
    private int i;
    protected void m1(){
        System.out.println("Niar");
    }
//    void m1(int n){
//
//    }
}
class Kiar extends Niar{

   protected void m1(){

    }
    protected class Nar{
       protected void m2(){
           System.out.println("Nar");
       }
       protected class Jar{
           protected void m3(){}

       protected class Nar2{
           protected void m4() {
           }
           }
       }


    }
    static private class Nar5 extends Niar{
       Nar5(){
           System.out.println("Nar2");
       }
       protected void m3(){
            int i = 0;
           System.out.println("Nar2");

       }
    }
}

public class Accessspec {

    public static void main(String[] args) {
        Kiar k = new Kiar();
        Kiar.Nar kn = k.new Nar();
        Kiar.Nar.Jar kn2 = kn.new Jar();
        Kiar.Nar.Jar.Nar2 kn3 = kn2.new Nar2();



    }
}
