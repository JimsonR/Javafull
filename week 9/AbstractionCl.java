import java.util.ArrayList;

interface AbstractInterface {
    int sharedMethod();

   default int concreteMethod(){
        return 2;
    }
}
abstract class AbstractClass  {

   public abstract int abstractClassMethod();




}
public class AbstractionCl {
  public int concreteMethod(){
      return 1;
  }

   public int abstractClassMethod(){
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(new AbstractionCl().concreteMethod());

       AbstractInterface abstractInterface = ()->{
          return 2321;
       } ;
        System.out.println(abstractInterface.concreteMethod());


    }
}
