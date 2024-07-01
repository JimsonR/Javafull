package Mypack;
class Outerclass{
    // Outer
    Privateclass privateclass = new Privateclass();
    Privateclass.InsidePrivateClass insidePrivateClass = privateclass.new InsidePrivateClass();
//    int p = insidePrivateClass.insidenestedprivateclassvar;
//    {
//        System.out.println(insidePrivateClass.insidenestedprivateclassvar);
//    }
    int j = privateclass.j;
    int k = privateclass.m1();

    protected class Protectedclass {
        //Inner
        int s = 10;
    }
    private class Privateclass{
        // Inner
        private int j = 10;
         private int k = 20;
         private int m1(){
             return k;

         }
         private class InsidePrivateClass{
             int insidenestedprivateclassvar = 50;
         }
    }


    // Outer class

//    {
//        System.out.println(privateclass.j);
//    }
}

public class Protectedpract {
  protected int i = 10;
public Object m1(){
//       System.out.println("protected m1");
       return "";
   }
//  Pdasd pdasd= new Pdasd();
    public static void main(String[] args) {
//        System.out.println(new Outerclass().new Protectedclass());
//        Outerclass pdasd = new Outerclass();
//        Outerclass.Protectedclass protectedclass = pdasd. new Protectedclass();
//        System.out.println(new Outerclass().protectedclass.s);
//        Outerclass.Privateclass privateclass = new Outerclass().new Privateclass();

        System.out.println(new Outerclass().privateclass);
    }

}
