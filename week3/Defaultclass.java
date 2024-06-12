public class Defaultclass {
    public int publicfield = 1;         // Accessible from any class within the same package
    protected int protectedfield = 2;   // Accessible within the same package and subclass
    int defaultfield = 3;               // Accessible within the same package
    private int privatefield = 4;       // Accessible within this class only

    public void publicmethod(){
        System.out.println("publicmethod");
    }
    public void protectedmethod(){
        System.out.println("protectedmethod");
    }
     void defaultmethod(){
        System.out.println("defaultmethod");
     }
     public void privatemethod(){
        System.out.println("privatemethod");
     }

}
