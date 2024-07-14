import java.util.LinkedList;

public class ListNodes {
    public static void main(String[] args) {
       ListNode listNode = new ListNode(4,null);

       ListNode listNode1 = new ListNode(3,listNode);

       ListNode listNode2 = new ListNode(2,listNode1);

       ListNode listNode3 = new ListNode(1, listNode2);

        ListNode prev = null;

        ListNode current = listNode3;
//        System.out.println(current.next);

        ListNode newLl = new ListNode();

       while (current != null){

           ListNode next = current.next;
           System.out.println(current.val);
           current.next = prev;

           prev = current;
           newLl = prev;
           current = next;

       }
//       while(current!=null){
//           ListNode next = current.next;
//           System.out.println(current.val);
//           current = next;
//       }
        ListNode rev = newLl;

       while(rev != null){

           ListNode next = rev.next;
//           System.out.println(rev.val);
           rev = next;


       }




    }
}
