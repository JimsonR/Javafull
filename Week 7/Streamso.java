import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamso implements Runnable {

     final Integer i;
     Streamso(int i){
         this.i = i;
     }
    int fact(int n) throws InterruptedException{
        Thread.sleep(200);
        if(n==1){

            return 1;

        }
        return n*fact(n-1);
    }
    public  void run(){
            synchronized (i){
       try {
         int i=  fact(5);
           System.out.println(i);
       }catch (InterruptedException r)
       {
           r.printStackTrace();
       }
       }
    }


    public static void main(String[] args) throws InterruptedException{
        HashMap<Character,Integer> characterashMap = new HashMap<>();
        Streamso streamso = new Streamso(0);
        Thread thread1 = new Thread(streamso);
        Thread thread2 = new Thread(streamso);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


        for(int i = 0; i < 10; i ++){
            characterashMap.put((char) (97+i),i);
        }
        System.out.println(characterashMap);

     Stream<Map.Entry<Character,Integer>> stream= characterashMap
            .entrySet()
                .stream()
                    .filter(x->x.getValue()>5);
//                        .forEach(x-> System.out.println(x));
//        stream.collect(Collectors.mapping();
stream.collect(Collectors.groupingBy((x)->x.getKey())).forEach((x,y)-> System.out.println(x+" "+y));

String s = "A man, a plan, a canal, Panama";
    s= s.replace(",", "");
//s.
     s=s.replace(" ", "");
    s= s.toLowerCase();
    boolean bool = false;
//        System.out.println(s);
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(s.length()-1-i)){
                bool = true;
            }
            else{
                bool = false;
                break;

            }

        }
        System.out.println(bool);

        Runnable runnable = ()->{
            System.out.println("asd");
        };
        int a = 10;
        int b = 20;
        int c = b / a + a * b;
        System.out.println(c);
        String str = "abcdef";
        String substr = str.substring(3);
        System.out.println(substr);
        float result = 15 / 4f;
        System.out.println(result);
int[] arr = new int[2];


}
}
