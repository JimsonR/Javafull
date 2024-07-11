import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalJyoths {
    void m1() {
        System.out.println("sadasd");
    }

    public static void main(String[] args) {
//        Optional<OptionalJyoths> optionalJyothsOptionals = Optional.ofNullable(null);
//        OptionalJyoths optionalJyoths = optionalJyothsOptionals.orElse(new OptionalJyoths()) ;
//        optionalJyoths.m1();
//        ArrayList<Integer> arrs = new ArrayList<>();
//        arrs.add(0);
//        arrs.add(1);
//
//        for(int i = 0 ; i < 10; i++){
//            int sum = arrs.get(arrs.size()-1)+arrs.get(arrs.size()-2);
//            arrs.add(sum);

//        }
//        System.out.println(arrs);


//        for (int i = 2; i < 30 ; i++){
//            boolean bool = false;
//            for(int j = 2; j < i ; j++){
//                if(i!=j && i % j != 0){
//                    bool = true;
////                    System.out.println(i);
////                    break;
//                }
//
//                else{
//                    bool = false;
////                    System.out.println(i);
//                    break;
//                }
//
//            }
//            if(bool){
//                System.out.println(i);
//            }
//        }

        int n = 30;
        int time = 48; // 14 / (18-1) % 2 != 0


        int[] arr = new int[n];
        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
//            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

//        int i = 1;
//        int k = 1;
        System.out.println((((time / (n - 1)) % 2) == 0) ? ((time % (n - 1)) + 1) : (n - (time % (n - 1))));

//        int ans = n;
//        int c = 0;
//        for (int j = 1; j <= time; j++) {
////           ans--;
//            c = (c+1)%n;
////            System.out.println(c);
////            if(ans < 0  ){
//                c++;
////            }
//        }
//if((time/(n-1))%2!=0) {
////    System.out.println((n-(time%(n-1))));
//    System.out.println(n-c);
//}
//else{
////    System.out.println(time%(n-1)+1);
//    System.out.println(c+1);

    }}

