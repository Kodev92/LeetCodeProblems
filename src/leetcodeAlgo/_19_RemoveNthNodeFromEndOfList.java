package leetcodeAlgo;

public class _19_RemoveNthNodeFromEndOfList {

     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int i = 0;
        ListNode listNode = head;
        ListNode beforeN = head;

        if (listNode.next == null) return null;
        while (listNode.next != null) {
            i++;
            if (i > n) beforeN = beforeN.next; // starting after Nth + 1 step
            listNode = listNode.next;
        }

        if ((i + 1) == n) return head.next; // deleting first element
        if (n == 1) {beforeN.next = null; return head;} // deleting last element
        beforeN.next = beforeN.next.next; // else skipping Nth element
        return head;
    }

}
