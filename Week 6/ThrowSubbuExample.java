import java.util.Optional;

class Sbu extends Throwable{
    Sbu(){
        super();
    }
}
public class ThrowSubbuExample {
    int x =10;

  static int fact(int n){
      if(n==0){
          return 1;
      }
        return n*fact(n-1);
    }

    public static void main(String[] args){


       try {
           throw new StackOverflowError();
       }
       catch(Throwable e){
           }
       boolean bool = false;
       String s = "aaaaaa";
       String t = "bbaaaa";

       Runnable runnable = ()->{
           System.out.println( fact(5));
       };
       Thread thread1 = new Thread(runnable);
       Thread thread2 = new Thread(runnable);

       thread1.start();
       thread2.start();

//        while(tPointer<t.length() && sPointer<s.length()){
//            if(s.charAt(sPointer)==t.charAt(tPointer)){
//
//                sPointer++;
//                System.out.println(sPointer);
//
//
//            }
//
//            tPointer++;
//
//        }
//
//
//        System.out.println(sPointer == s.length());

//        String s1 = "Hello";
//        String s2 = s1.replace('l', 'p');
//        System.out.println(s2);
//        double result = 10 / 3.0f;
//        System.out.println(result);
//        String str1 = "abc";
//        String str2 = str1.toUpperCase();
//        System.out.println(str2);
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        int sPointer = 0;
        int tPointer = 1;

        while(sPointer<arr1.length){
       // 9 % 4 == 0


//            System.out.println(arr1[sPointer]+" "+arr2[(tPointer-1)%arr2.length]);
            if((tPointer%arr2.length)==0){
//                System.out.println(sPointer);
                sPointer++;
            }

           else if(arr1[sPointer] == arr2[(tPointer-1)%arr2.length]){
//                System.out.println(arr1[sPointer]);
            }

            tPointer++;


        }
        ThrowSubbuExample throwSubbuExample = null;
//        System.out.println(throwSubbuExample+" "+ new ThrowSubbuExample());

        Optional<ThrowSubbuExample> optionalThrowSubbuExample = Optional.of(new ThrowSubbuExample());

        ThrowSubbuExample throwSubbuExample1 = optionalThrowSubbuExample.orElse(new ThrowSubbuExample());


        System.out.println(throwSubbuExample1);

    }
}
