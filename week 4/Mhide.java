 class Me{
    
   static void show(){

    }
        }
class Mer extends Me{
    static void show(){
System.out.println("M");
    }
}
public class Mhide {
    public static void main(String[] args) {
        Me mh = new Mer();
        mh.show();
    }
}
