public class Strinimpl {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(i);
            System.out.println(sb.hashCode());
        }
        StringBuffer sbfr= new StringBuffer();
        for (int i = 0; i < 100; i++) {
            sbfr.append(i);
            System.out.println(sbfr.hashCode());
        }
        String s = "";
        for (int i = 0; i < 100; i++) {
            s += (char)(i+'a');
            System.out.println(s.hashCode());
        }
    }
}
