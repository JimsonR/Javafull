public class Subbu {
    public static void main(String[] args) {
//        int i = 0;
//
//        int j=i;
//
//        j=++i +j;

//        System.out.println(i+" "+j);
//        System.out.println(2<<3); //0010
        String s = "dool";
        boolean b = false;
//        String t = "";
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == s.charAt(s.length()-1-i)){

                b = true;

            }
            else{
                b = false;
                break;
            }

        }
        System.out.print(b);
    }
}
