package leetcode;

public class _876_MiddleOfTheLinkedList {

    public static void printList (ListNode head){
        ListNode listNode = head;
        while (listNode.next != null) { // counting nodes
            System.out.println("listNode.val = " + listNode.val);
            listNode = listNode.next;
        }
    }

    public static void main(String[] args) {

        int nNodes = 5;
        int i = 1;
        ListNode head = new ListNode(i);
        ListNode prev = head;

        while (i < nNodes) {
            i++;
            ListNode newNode = new ListNode(i);
            prev.next = newNode;
            prev = newNode;
        }

        System.out.println("ListNode.class = " + ListNode.class);
        System.out.println("head.next.getClass() = " + head.next.getClass());
        printList(head);

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution876 {
        public ListNode middleNode(ListNode head) {

            int listLength = 1;
            int middleElementIndex = 0;
            ListNode listNode = head;

            while (listNode.next != null) { // counting nodes
                listLength++;
                listNode = listNode.next;
            }

            middleElementIndex = listLength / 2;

            // running through linked list till middle element
            listNode = head; // starting from head
            int i = 0;

            while (i < middleElementIndex) {
                i++;
                listNode = listNode.next;
            }
            return listNode;

        }
    }
}
