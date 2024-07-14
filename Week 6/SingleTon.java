 class Single{
    private static final Single instance = new Single();

   private Single(){

   }
   public static Single getInstance(){
       return instance;
   }

}

public class SingleTon {
    public static void main(String[] args) {
        System.out.println( Single.getInstance());
        System.out.println(Single.getInstance());

        

    }
}
