import java.util.*;
import java.util.stream.Stream;

public class Tests <T> {
    T list;

    Tests(){
//        this.list = list;

    }
//   T printList(){
//
//        return list ;
//    }

    static void printList(List<? extends Number> list){
        for(Number i : list){
            System.out.println(i);
        }

    }
 public static void main(){
        System.out.println("zero arg");
    }
 public  static void main(int a , int b){
        System.out.println("two arg");
    }
    public static void main(String[] args)throws InterruptedException{

//        main();

//        main(1,2);
        ArrayList list = new ArrayList<>();
        list.add(1);        // Integer
        list.add(2.5);      // Double
        list.add(3L);       // Long
        list.add(4.75f);    // Float
        list.add("asd");
//        Test<? super Number> test = new Test<>("asd");
        String s = "";
//        System.out.println(s.contains('s'+""));
//        Test<ArrayList<? extends Number>> test = new Test<>(list);
//        test.list.add(1);
//        System.out.println(test.list);
//        printList(list);
//        Test<List<? extends Number>> test = new Test<>();
//        System.out.println(test.list);
//        ArrayList<Integer> array = new ArrayList();
//
//        Collections.addAll(array,1,5,6,3,2,8,10);
//
//        Stream<Integer> stream = array.stream();
//
//        stream.sorted().filter(x->x%2==0).map(x->x*x).forEach(x->System.out.print(x+" "));
//        throw new InterruptedException("sd");

//        Test<ArrayList<? super Integer>> test1 = new Test<>(list);
//        printList(list);
//        System.out.println(test1.list);

        List<? super Number> list1 = new ArrayList<>();
//        super.finalize();
        list1.add(909098097.000000);
//        list1.add("asdasd");

       int[] arr =  {1,2,3,4,3,4,5};
        HashSet<Integer> seen = new HashSet<>();
        HashMap<Integer,Integer> hashMap = new HashMap();
//        System.out.println(seen.add(arr[3]));
//
//        System.out.println(seen.add(arr[5]));
        int count  = 1;
        for(int i = 0; i < arr.length; i++){
            if(!seen.add(arr[i])){
                System.out.println(arr[i]);

            }
//            if(hashMap.containsKey(arr[i])){
//                System.out.println(arr[i]);
//            }
//            else{
//                hashMap.put(arr[i],i);
//                System.out.println(arr[i]);
//            }
        }
        int unique = 0;
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(unique);
            if(unique != 0){
//                System.out.println(arr[i]);
            }
            unique ^= arr[i];
        }
    }
}

