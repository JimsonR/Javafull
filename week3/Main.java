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

        Defaultclass dc = new Defaultclass();
        System.out.println(dc.publicfield);  //Accessible
        System.out.println(dc.protectedfield); // Accessible within the same package
        System.out.println(dc.defaultfield);   // Accessible within the same package
//        System.out.println(dc.privatemethod); // Not accessible
        dc.publicmethod();      // Accessible
        dc.protectedmethod(); // Accessible within the same package
        dc.defaultmethod();  //Accessible within the same package
//        dc.privatemethod(); //Not accessible
        Protectedandprivateclass pc2 = new Protectedandprivateclass();
        pc2.accessInnerClasses();
//        Protectedandprivateclass.ProtectedInnerClass protectedinner = Protectedandprivateclass.new ProtectedInnerClass(); //Accessible within the same package or through inheritance
//        Protectedandprivateclass.PrivateInnerClass privateinnerclass = Protectedandprivateclass.new PrivateInnerClass(); //Not accessible outside ProtectedandprivateClass
    }
}
