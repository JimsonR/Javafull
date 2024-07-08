package ImportPackage;

public class ClassVar {
 static int c = 0;
    ClassVar(){
        c++;
    }
    static {
        c++;
        System.out.println(c+"sad");
    }

    public static void main(String[] args) {

        new ClassVar();
        new ClassVar();
        new ClassVar();
        System.out.println(c);

    }
}
