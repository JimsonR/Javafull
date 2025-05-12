import java.util.HashSet;
import java.util.Set;

public class BinToDec {
    public static void main(String[] args) {

        int num = 20;

        StringBuilder bin = new StringBuilder();

        int temp = num;



        while(temp >= 1){
            int rem = temp%2;
//            System.out.println(temp);
           bin.append(rem+"");
            temp /= 2;

        }
        System.out.println(bin.reverse());

        int con = 0;

        int count = 1;


        for (int i = 0; i <bin.length() ; i++) {

        con +=  count* Integer.parseInt(bin.charAt(bin.length()-i-1)+"");
                  count *= 2;
        }
        System.out.println(con);

        Set<String> hs = new HashSet<>();

        

        

    }
}
