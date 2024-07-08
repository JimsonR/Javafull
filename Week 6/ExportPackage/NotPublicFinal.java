package ExportPackage;

final public class NotPublicFinal{
    
    private final class InnerPrivateFinal{
      int privateInnerVar=  123;  
    }
    
   static  {
//        System.out.println( new InnerPrivateFinal().privateInnerVar);
    }
    public int i = 0;
    
    
    
    protected final class ProtectedFinalInnerClass{
       StringBuilder s =  new StringBuilder("hi");
    }

    public static void main(String[] args) {
        System.out.println(new NotPublicFinal().new ProtectedFinalInnerClass().s);
    }
}
