import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Josephus {



    public static void main(String[] args) {



        LinkedList<Integer> deque = new LinkedList();
//        int n = 6;
//        for(int i = 1; i <= n;  i++){
//            deque.add(i);
//        }

//        System.out.println(deque);

//        int k = 5;
//        int c = 1;
//        while(deque.size() != 1){
//            if(c%k == 0 ) {
//                deque.remove();
//                System.out.println(deque);
//                c=1;
//            }
//            else {
//                deque.addLast(deque.remove());
//
//                c++;
//            }
//
//        }
        int n = 15;
//        int i = 1;
        int k = 4;
        int result = 0;
//        int c =
        while(n >= k ){
            result += k;
            n -= k;
            System.out.println(n++);
            n++;


        }
//        System.out.println(result+n);
    }

    }

