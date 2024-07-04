package Week

import java.util.*;

class Generic1 <T,K> {
    T name;
    K age;

    Generic1(T name, K age) {
        this.name = name;
        this.age = age;
    }

    String getDetails() {
        System.out.println(name + "  " + age);
        return name + " " + age;
    }
}
    class  PractiseAll {
        public static void main(String[] args) throws InterruptedException {
//        int[] array = new int[8];
////        array[0] = 1;
////        array[2] = 3;
////        System.out.println(Arrays.toString(array));
//
//       for(int i =0; i< array.length ;i++){
//           array[i] = i;
//           System.out.println(Arrays.toString(array));
//
//       }


            ArrayList arr = new ArrayList();
            arr.addFirst(1);
            arr.add(0, 1);
            arr.add("asd");
//        arr.ad
//        arr.add(new PractiseAll());
//        arr.remove(new PractiseAll());
//        System.out.println(arr.remove("asd"));
//
//        System.out.println(arr);

            LinkedList linkedList = new LinkedList(); //1 -> 2 -> 3
            linkedList.addFirst(3);

            Queue<Integer> deque = new LinkedList<>();
            deque.add(2);
            deque.add(3);
//        System.out.println(deque.poll());
            Stack<Integer> stack = new Stack<>();
            stack.push(4);
            stack.push(5);
//        System.out.println(stack);
//        deque.add(1);
//        ArrayList<Integer>


            HashSet<Integer> hashSet = new HashSet<>();
            hashSet.add(34);
            hashSet.add(43);
            hashSet.add(12);
            hashSet.add(12);

//        System.out.println(hashSet);

            TreeSet<Integer> treeSet = new TreeSet<>();
            treeSet.add(22);
            treeSet.add(33);
            treeSet.add(44);
            treeSet.add(11);
//        System.out.println(treeSet.toArray());

            TreeMap<Integer, Integer> treeMap = new TreeMap();
            treeMap.put(2, 3);
            treeMap.put(4, 2);
            treeMap.put(1, 3);
//        System.out.println(treeMap);


            HashMap<Integer, Integer> hashMap = new HashMap<>();
            hashMap.put(2, 4);
            hashMap.put(3, 2);
            hashMap.put(1, 3);

            Map<Integer, Integer> newMap = Collections.synchronizedMap(hashMap);

//        System.out.println(hashMap);

            for (Map.Entry<Integer, Integer> maps : hashMap.entrySet()) {
//            System.out.println(maps);

            }
            Iterator itr = hashMap.entrySet().iterator();
//            while (itr.hasNext()) {
////            System.out.println(itr.next());
//
//
//            }


            int[][] matrix = {
                              {1, 2, 3, 5,6},
                              {4, 5, 6, 7,4},
                              {7, 8, 9, 9,7},
                              {3, 3, 4, 5,5},
                              {3, 3, 4, 5,5}
                              };

            int top = 0;
            int bottom = matrix.length - 1;
            int left = 0;
            int right = matrix[0].length - 1;
            while (top <= bottom && left <= right) {
                //left to right
                if (top <= bottom) {
                    for (int i = left; i <= right; i++) {
                        System.out.print(matrix[top][i] + " ");
                    }
                    top++;
                    //top to bottom
                    if (left <= right) {
                        for (int i = top; i <= bottom; i++) {
                            System.out.print(matrix[i][right] + " ");
                        }
                        right--;
                    }

                    if (top <= bottom) {
                        for (int i = right; i >= left; i--) {
                            System.out.print(matrix[bottom][i] + " ");
                        }
                        bottom--;
                    }
                    if (left <= right) {
                        for (int i = bottom; i >= top; i--) {
                            System.out.print(matrix[i][left] + " ");
                        }
                        left++;
                    }
                }

            }


////            System.out.println(new Generic1("asd","asd").getDetails());
//            Generic1<? super Number, String> generic = new Generic1<>(new PractiseAll(), "4");
////            System.out.println(generic.getDetails());
////            Optional<Generic1> optionalGeneric1 = Optional.of(null);
////            optionalGeneric1.get().getDetails();
//            Generic1<?,?> generic1 = Optional.of(new Generic1("asd","asd")).orElse(new Generic1("asd","asd")); // .get(), .orElse ,
////            System.out.println(generic1.getDetails());
//          List<Integer> ints = new ArrayList<>();
//            ints.add(1);
//            ints.add(2);
//            ints.add(4);
//
//            Stream<Integer> stream = ints.stream();
////            stream.map(x->x*x).map(x->x*x).filter((x)->x>5).forEach(x-> System.out.println(x));
////            stream.map(x->x*x);
////            System.out.println(stream);
//            ArrayList<Integer> arr1 = new ArrayList<>();
//            arr1.add(1);
//            arr1.add(2);
////
//////            Runnable run = ()->{
////              for(int i = 0 ; i<5;i++){
////                  arr1.add(i);
////              }
////            };
//
//            System.out.println(arr1);
//
////            run.run();
//        Thread thread1 = new Thread(()->{
//            for(int i = 0; i<190; i++){
////                arr1.add(i);
//                hashMap.put(i,i-1);
//            }
//            try {
//                Thread.sleep(100);
//            }
//            catch (InterruptedException e){
//
//            }
//            });
//        Thread thread2 = new Thread(()->{
//            for (int i = 0 ; i< 500; i++){
////                arr1.add(i);
//                hashMap.put(i,i+1);
//            }
//        });
//
//        thread1.start();
//        thread1.join();
//        thread2.start();
//        thread2.join();
////            System.out.println(hashMap);
//
//        }
//
////       static Optional<Generic1> newInst(){
////            Generic1<?,?> asd =null;
////            return Optional.ofNullable(asd);
//      }
//            System.out.println(i);
//            System.out.println(new PractiseAll().ij);
        }
        static int i = 53;
        int ij = 65;
    }
abstract public class Poles {
    int k = 87;
    static int kl = 98;
    {

    }
    static {

    }
}

