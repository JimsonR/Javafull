public class Publicclass {

        public int publicfield = 1;         //Accessible from any class
        protected int protectedfield = 2;   // Accessible from within the same package and subclass
        int defaultfield = 3;               // accessible within this class only
        private int privatefield = 4;       //accessible within this class only

    public void publicmethod(){
        System.out.println("publicmethod");
    }
    protected void protectedmethod(){
        System.out.println("protectedmethod");
    }
    private void defaultmethod(){
        System.out.println("defaultmethod");
    }

}

