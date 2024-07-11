import java.util.*;

public class MapperSubbu {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>(10);
//        Integer[] arr = {2,3,2,1};
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

//        arrayList.add("adasdasdasd");
//        arrayList.add(new MapperSubbu());


//        for(int i = 0 ; i < 20; i++){
//            System.out.println(arrayList.add(i)+" "+arrayList.hashCode());
//        }
//        arrayList.toArray(arr);
//        System.out.println(Arrays.toString(arr));

        Iterator iterator = arrayList.iterator();

//        for(int i = 0 ; i < arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }


//        while(iterator.hasNext()){
////            System.out.println(iterator.next());
//        }

        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.addFirst(2);
        linkedList.addLast(1);
        linkedList.add(2);


//        for(int i =0 ;i<linkedList.size(); i++){
//            System.out.println(linkedList.get(i));
//
//        }
//        for(int i : linkedList){
//            System.out.println(i);
//        }

        iterator = linkedList.descendingIterator();
        System.out.println(linkedList);
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        System.out.println(linkedList.set());
        System.out.println(linkedList);

        System.out.println(linkedList.get(2));














    }
}
