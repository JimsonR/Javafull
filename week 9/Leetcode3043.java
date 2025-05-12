import java.util.HashSet;

public class Leetcode3043 {
    public static void main(String[] args) {
        int arr1[] = {13,27,45};
        int arr2[] = {21,27,48};

        HashSet<Integer> prefix = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            int  temp = arr1[i];
            while (temp!=0) {
                prefix.add(temp);
                temp /= 10;
            }
        }
        int maxprefix = 0;
        System.out.println(prefix);
     l1: for (int i = 0; i < arr2.length; i++) {
          int  temp = arr2[i];
            while (temp!=0){
//                int rem = temp % 10;
                System.out.println(temp);
                if(prefix.contains(temp)){
                    if(maxprefix < String.valueOf(temp).length())
                    maxprefix = String.valueOf(temp).length();
                    else {

                    }

                }
                temp = temp/10;

            }
        }
        System.out.println(maxprefix);


    }
}
