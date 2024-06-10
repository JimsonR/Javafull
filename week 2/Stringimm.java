public class Stringimm {
    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println(str1);
        System.out.println(str1.hashCode());
         str1 = "Hello Worlds";
        System.out.println(str1);
        System.out.println(str1.hashCode());
        StringBuffer sb = new StringBuffer("Hello Worlds");
        StringBuilder sb2 = new StringBuilder("Hello Worlds");
        str1 = sb+sb2;
        StringBuffer sb3 = new StringBuffer(sb+sb2);

        System.out.println(str1);

    }
}
