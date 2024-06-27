class Tired{
     class Pired{
      private class Lired{


         protected class Oired{

         }
     }
    }

}

public class Innerclass {
    public static void main(String[] args) {
        PrivandProt p = new PrivandProt();
        System.out.println(p.m1());

//        System.out.println(sub.privmethod());
//        PrivandProt.Subbupriv sub2 = p.new Subbupriv();
        Tired t = new Tired();
        Tired.Pired inrclass =t.new Pired();
        SubbuOuterClass p2 = new SubbuOuterClass();
        p2.getSubbuOuterClass();

//        Tired.Pired.Lired ininclass= new Tired.Pired.Lired();

    }
}

