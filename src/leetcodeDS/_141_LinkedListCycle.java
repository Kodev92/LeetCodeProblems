package leetcodeDS;

import java.util.HashSet;
import java.util.Set;

public class _141_LinkedListCycle {

     class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }

     public boolean hasCycle(ListNode head) {
         if (head == null || head.next == null) return false;

         Set<ListNode> set = new HashSet<>();
         ListNode list = head;

         set.add(head);
         while (list.next != null)
             if (!set.add(list.next))
                 return true;
             else
                 list = list.next;
         return false;
     }

}
