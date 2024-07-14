import java.util.*;

class Base {
//    public Base(){
//        System.out.println("Base");
//    }
   static void show() {
        System.out.println("Base show");
    }
   Base m1(){
return new Base();
    }
}


class Derived extends Base {
//    Derived(){
//        System.out.println("Derived");
//    }
  Derived m1(){
    return new Derived();
    }
    static void show() {
//         super.show();
        System.out.println("Derived show");
    }
}

public class TestOverriding {
    static void overs(double i, double y){

    }
   static int overs(int x,int y){
        return 0;
    }

  static   int pow(int n, int exp){
        if(exp==0){

            return 1;
        }
//        else if(exp==1){
//            return 2;
//        }


        return n*pow(n,exp-1);
    }


    static  int fib(int n){
        if(n<=1){

          return n;

        }
        int x = fib(n-1) + fib(n-2);

//        System.out.println(x);

        return fib(n-1) + fib(n-2);

    }

    double subbu(int i){

      return 0;

    }
    int subbu(){

      return 0;
    }

//0 1 1 2 3 5 8 13

    public static void main(String args[]) {

        Base base = new Base();
        System.out.println(base.m1());
        Base base1 = new Derived();
        System.out.println(base1.m1());

        Base derived = new Derived();
//        System.out.println(fib(5));
//        Base obj = new Derived();
//        obj.show();
//
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//
//        for(int i = 20; i >=0; i--){
//            priorityQueue.add(i);
//
//        }
//        System.out.println(pow(2,3));
//        System.out.println(fib(4));

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(0);
//        arrayList.add(1);
//            for(int i = 0; i < 10; i++ ){
//                arrayList.add(arrayList.get(arrayList.size() - 1)+arrayList.get(arrayList.size()-2));
//                System.out.println(arrayList);
//            }
//        System.out.println(arrayList);


//        SortedMap sortedMap = new TreeMap();
//        LinkedList<Integer> ll = new LinkedList<>();
//            Collections.addAll(ll,1, 2, 2, 3, 5);

//
//            int un = 0;
//            for(int i = 0; i<ll.size();i++ ){
////                if(ll.get(i-1) == ll.get(i)){
////                    ll.remove(ll.get(i));
////                }
//                un = ll.get(i);
//                System.out.println(ll.get(i));
////                 if(){
////
////                 }
//
//            }
//        System.out.println(un);
//
//
//        System.out.println(ll);


    }
}