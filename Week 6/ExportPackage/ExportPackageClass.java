package ExportPackage;


public class ExportPackageClass  {

    protected ExportPackageClass(){
        System.out.println("ASdasdsa");
    }
     ExportPackageClass(int i){

    }
    public ExportPackageClass(int i , int j){

    }
    protected ExportPackageClass(int i , int j , int k){
        System.out.println("asdasd");
    }


      String m1(){
        return "";
    }


    private int i = 10;
   public int publicVar = 20;
    int k = 24;  // package-private
   protected int p = 245; // accessible to subclasses of different package

    // Final
// unchangeable once assigned
  public final int finalPublicVar = 23;
  private  final int finalPrivateVar = 25;
  final int finalVar = 25;
  protected int finalProtectedVar = 89;

  // Static
  static private int staticPrivateVar = 10;
  static  public int staticPublicVar = 20;
  static int staticdefault = 24;  // package-private
  static protected int staticProtectdVar = 245; // accessible to subclasses of different package

  static public final int staticFinalPublicVar = 23;
  static   private  final int staticFinalPrivateVar = 25;
  static final int staticFinalVar = 25;
  static protected int staticFinalProtectedVar = 89;




    public static void main(String[] args) {




    }
}
