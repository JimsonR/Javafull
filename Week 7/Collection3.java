import java.util.*;

public class Collection3 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        Collections.addAll(linkedList,1,4,3,2,2,4,6);
        linkedList.remove(0);
//        System.out.println(linkedList.lastIndexOf(linkedList.remove(0)));

        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(1);
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.remove(2);

        Iterator<Integer> iterator = arraylist.reversed().iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ListIterator<Integer> linkeditr = linkedList.listIterator(linkedList.size());

        while(linkeditr.hasPrevious()){
            System.out.println(linkeditr.previous());
        }

//        System.out.println(arraylist.get(1));


    }
}
