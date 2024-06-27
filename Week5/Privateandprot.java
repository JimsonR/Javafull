  class Privatecla{
//    Privatecla pr = new Privatecla();
    private class Privateclass{
        void m1(){
            System.out.println("Privateclass");
//            class Method{
//                void m2(){
//                    System.out.println("Method");
//                }
//            }
//            Method met = new Method();
        }
    }

      public Privateclass createInstance(){
          return new Privateclass();
      }



  }
class Protectedcla{


}
public class Privateandprot {
//    private class Privatecla1{
//        void m1(){
//            System.out.println("Privatecla1");
//        }

//    }
    public static void main(String[] args) {
        Privateandprot p = new Privateandprot();
//        p.m1();
//        Privateandprot.Privatecla1 p1 = p.new Privatecla1();
        Privatecla privatecla = new Privatecla();
        System.out.println(privatecla.createInstance());
//        Privatecla.Privateclass p3 = p2.new Privateclass();

    }
}
