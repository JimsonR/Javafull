import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class MatJyots {
    public static void main(String[] args) {
      int[][]  matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
                        };
      int small = matrix[0][0];
      int counter = 0;
      int [] arr = new int[matrix.length*matrix[0].length];
       for (int i = 0 ; i < matrix.length; i++){
          for(int j = 0; j < matrix[0].length;j++){
//              if(small < matrix[i][j] | small< matrix[j][i] && counter > 0){
////                  System.out.println(small);
//                  small = matrix[i][j];
//                  counter--;

              arr[counter] = matrix[i][j];
              counter++;
//              }
          }

      }
       Arrays.sort(arr);
        System.out.println(arr[8-1]);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
//        priorityQueue.add(1);
//        priorityQueue.add(1);
        for(int i = 10; i > 0; i--){
            priorityQueue.add(i);
            linkedList.add(i);
        }
        System.out.println(priorityQueue);
        for(int i = 0; i< 10;i++){
            System.out.println(priorityQueue.peek());
            priorityQueue.poll();
        }

        Iterator<Integer> iterator = priorityQueue.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
       ListIterator<Integer> iterator1 = linkedList.listIterator();
//        System.out.println(iterator1.previous());
        Iterator prev = null;
//        Iterator<Integer> next = iterator1.next();

ArrayList<Integer> arrayList = new ArrayList<>();

Collections.addAll(arrayList, 1,2,34,54,6,6,3,1);
//for(int i = 0; i < arrayList.size(); i++){
//    arrayList.remove(i);
//}
//arrayList.add(22);
        arrayList.stream().map(x->x*x);
for(Integer i: arrayList){

    arrayList.remove(i);
//    System.out.println(i);
}




    }
}
