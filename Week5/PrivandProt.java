import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class SubbuOuterClass{
      private class SubbuInnerClass{

    }

    class SubbuInnerClass1  {

    }
     SubbuOuterClass getSubbuOuterClass(){
          return new SubbuOuterClass();
    }
}

 class SubbuProtectedOuterClass{
    protected class SubbuProtectedInnerClass extends SubbuProtectedOuterClass{

         protected class SubbuProtectedInnerClass1{

         }
    }
}
public class PrivandProt {
    HashMap<Integer, Integer> sadsad = new HashMap<>();
    Map<Integer, Integer> sadsad2 = Collections.synchronizedMap(sadsad);
    private class Subbupriv{


         public void privmethod(){
             System.out.println("Subbupriv");
         }
         private class Privclass2{
             void privmethod(){
                 System.out.println("Subbupriv");
             }
             public Privclass2 m2(){
                 return new Privclass2();
             }
         }
    }

    public Subbupriv m1(){

        PrivandProt.Subbupriv sub123 = new Subbupriv();
//        sub123.privmethod();

        return sub123;
    }
    public static void main(String[] args) {

        SubbuProtectedOuterClass p = new SubbuProtectedOuterClass();
        SubbuProtectedOuterClass.SubbuProtectedInnerClass prot= p.new SubbuProtectedInnerClass();
        SubbuProtectedOuterClass.SubbuProtectedInnerClass.SubbuProtectedInnerClass1 prot1= prot.new SubbuProtectedInnerClass1();
//        PrivandProt p = new PrivandProt();
//        PrivandProt.Subbupriv sub2 = p.new Subbupriv();
        SubbuOuterClass p2 = new SubbuOuterClass();
        p2.getSubbuOuterClass();

//        SubbuOuterClass subs = new SubbuOuterClass();
//        SubbuOuterClass.SubbuInnerClass sub = subs.new SubbuInnerClass();
//        SubbuOuterClass.SubbuInnerClass subs1= new SubbuOuterClass.SubbuInnerClass();



    }
}
