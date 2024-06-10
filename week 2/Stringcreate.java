import java.util.Arrays;

public class Stringcreate {
    public static void main(String[] args) {
        String a = "Hello World";

        char[] b = {'j','i','m','m','y'};
        String c = new String(b);
        char[] f = c.toCharArray();
        String [] strs = {"Hello", "World"};
        String strsString = String.join(" ", strs);
        System.out.println(strsString);



//    System.out.println(Arrays.toString(f));

//        System.out.println(c);
        StringBuilder newstring = new StringBuilder();
        for(char d : b){
            newstring.append(d);
        }
        StringBuffer sb = new StringBuffer(c);
        System.out.println(sb.delete(2,3));
//        System.out.println(newstring);
    }
}
