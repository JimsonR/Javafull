import java.util.*;

public class Subbupal {
    public static void main(String[] args) {
//        int num = 265;
//
//        int rev = 0;
//
//        int temp = num;
//        while (temp > 0) {
//            int rem = temp % 10;
//            rev = rev * 10 + rem;
//            temp = temp / 10;
//        }
////        System.out.println(rev);
//        if(num==rev){
////            System.out.println(num+"is palindrome");
//        }
//        else {
////            System.out.println(num+" is not palindrome");
//        }
//
//        int a = 10;
//        int b = 20;
//        a = b^a; //0000 1010 : 0001 0100  =  0001 1110 = 30
//        System.out.println(a);
//        b = b^a; // 0001 0100 : 0001 1110 = 0000 1010 =10
//        System.out.println(b);
//        a = a^b; //
//
////        boolean bool1 = true;
////        boolean bool2 = false;
//        System.out.println("AND");
//        System.out.println(true&true);
//        System.out.println(true&false);
//        System.out.println(false&true);
//        System.out.println(false&false);
//        System.out.println("OR");
//        System.out.println(true|true);
//        System.out.println(true|false);
//        System.out.println(false|true);
//        System.out.println(false|false);
//        System.out.println("XOR");
//        System.out.println(true^true);
//        System.out.println(true^false);
//        System.out.println(false^true);
//        System.out.println(false^false);
////        System.out.println(1^1);


//        a = a+b; // 30
//        b = a-b; // 30-20 = 10 = b
//        a = a-b;  // 30-10 = 20 = a
//        System.out.println(a);
//        System.out.println(b);
//        a = a^b;

//        System.out.println(a);
//        System.out.println(b);
        String s = "malayalams";
            boolean pal = false;
            String reverse = "";
        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i)+" = "+s.charAt(s.length()-1-i) );
                reverse += s.charAt(s.length() - 1 - i);
//            if(s.charAt(i)==s.charAt(s.length()-1-i)){
//                pal = true;
//            }
//            else{
//                pal = false;
//                break;
//            }
        }
//        System.out.println(reverse);

        int[] arr = {3,23,5,4,32,34,2,35,4,653};

//        PriorityQueue pq = new PriorityQueue<>();
        TreeSet<Integer> set = new TreeSet<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            map.put(arr[i], i);
        }

//        System.out.println(set);
        int secmax = 0;
        for (int i = 0; i < 2; i++) {
           secmax= set.pollLast();
        }
//        System.out.println(secmax);
//        System.out.println(set.remove(35));
//        System.out.println(set);
        int[] newarr = {23,43,24,21,1,24,23,423,4,23,423,4,23,423,454,6754,7564};
        int firstmax = newarr[0];
        int secondmax = 0;
        for (int i = 0; i < newarr.length; i++) {
//            int temp = newarr[i];
            if(firstmax<newarr[i]){
                secondmax = firstmax;
                firstmax = newarr[i];
                System.out.println("sec "+secondmax);
                System.out.println("first "+firstmax);



//                secondmax = newarr[i];
            }
//            else if(){
//
//            }
//
        }
        System.out.println(secondmax);

        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < newarr.length; i++) {
            map2.put(newarr[i], i);
        }
        System.out.println(map2);
    }
}
