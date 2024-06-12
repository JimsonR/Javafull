public class Main {
    public static void main(String[] args) {
        Publicclass pc = new Publicclass();
        System.out.println(pc.publicfield);             // Accessible
        System.out.println(pc.protectedfield);          // Accessible within the same package
        System.out.println(pc.defaultfield);            // Accessible within the same package
//        System.out.println(pc.privatefield);    // Not accessible

        pc.publicmethod();          //Accessible
        pc.protectedmethod();       //Accessible within package
        pc.publicmethod();          //Accessible within the same package
//        pc.privatemethod();         //Not accessible

    }
}
