import java.io.Serializable;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadExam implements Runnable {
    int[] arr = {1, 2, 3, 4, 5};
    public  void run(){
        int product = 1;
//        for(int i = 0; i< arr.length; i++){
//            product *= arr[i];
//        }
      synchronized (arr) {
          for (int i = 0; i < arr.length; i++) {
              System.out.println(arr[arr.length - i - 1] + " ");
              ;
              try {
                  Thread.sleep(300);
              } catch (InterruptedException e) {

              }

          }
      }
//        System.out.println();
//        System.out.println("The product is "+ product);
    }


    public static void main(String[] args) throws InterruptedException{

        ThreadExam threadExam = new ThreadExam();
        Callable callable = ()->{

            return ""; };

        Thread thread1 = new Thread();

        Thread thread2 = new Thread(threadExam);


//        thread1.start();
////        thread1.join();
//        thread2.start();

        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();

        String str = "asdasdasdsdssdsasdsgfdgrerwertgdsj";

        for(int i = 0; i < str.length(); i++){
            if(hashMap.containsKey(str.charAt(i))){
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
            }
            else{
                hashMap.put(str.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> maps: hashMap.entrySet()){
            if(maps.getValue()==1){
                System.out.println(maps.getKey());
                break;
            }
        }

//        System.out.println(hashMap);








        int[] arr = {11, 23, 45, 66, 12, 21, 45, 66};

        for(int i = 0 ; i < arr.length; i++){
            boolean bool = false;
            for(int j = i+1 ; j < arr.length-1; j++){

                if(arr[i] != arr[j]){
                    bool = true;
                }
                else{
                    bool = false;
                    break;
                }

            }
            if(bool){
//                System.out.println(arr[i]);
            }

        }

    Integer a = 128;
    Integer b = 128;
//        System.out.println(a==b);
        char c = 'A';
        int i = c;
//        System.out.println(i);
        int result = (5 + 3) * 2 - 8 / 4;
//        System.out.println(result);


        String str1 = "Java";
        String str2 = str1.intern();
//        System.out.println(str1 == str2);

        int k= 1;
        int ind = 0;
//        while(k>0 && k < arr.length* arr.length){
//
//            if((k+1)% arr.length==0){
//
//            }
//
//            k++;
//        }
        String s = "(ed(et(oc))el)";

        Stack<String> strings = new Stack<>();
        for(int e = 0; e < s.length(); e++){
            if(s.charAt(e)=='('){

            }
        }

        int[] arr1 = {1, 2, 3, 4,6};
        int[] arr2 = {3, 4, 5, 6};

        Arrays.sort(arr1);
        for(int e = 0; e < arr1.length; e++){
            boolean bool = false;

            for(int j = 0; j < arr2.length; j++){

                if(arr1[e] == arr2[j] ){

                    bool = true;
                    break;
                }
                else{
                    bool = false;

                }

            }
            if(bool){
//                System.out.println(arr1[e]);
            }

        }



    }
}