package leetcodeAlgo;

public class _23_MergeKSortedLists {
    public static void main(String[] args) {
        ListNode l1 = null;
//        new ListNode(1, null);
//        l1.next = new ListNode(13, null);


        ListNode l2 = new ListNode(2, null);
        l2.next = new ListNode(12, null);

        ListNode l3 = new ListNode(1, null);
        l3.next = new ListNode(3,
                new ListNode(5,
                        new ListNode(7,
                                new ListNode(11, null))));

        printList(l1);
        printList(l2);
        printList(l3);
//        printList(merge2Lists(l1, l2));
        ListNode[] ll = new ListNode[0];
        System.out.println("ll.length = " + ll.length);


        ListNode m = mergeKLists(ll);
        printList(m);
    }


    public static ListNode mergeKLists(ListNode[] lists) {

        if (lists == null) return null;
        if (lists.length == 0) return null;

        for (int i = 1; i <= lists.length - 1; i++)
            lists[0] = merge2Lists(lists[0],lists[i]);
        return lists[0];

    }



    private static ListNode merge2Lists(ListNode l1Head, ListNode l2Head) {
        if (l1Head == null) return l2Head;
        if (l2Head == null) return l1Head;

        ListNode l1Iterator = l1Head;
        ListNode l2Iterator = l2Head;

        ListNode newListHead = null;
        ListNode iter = null;
        if (l1Iterator.val > l2Iterator.val) {
            newListHead = l2Iterator;
            l2Iterator = l2Iterator.next;
        } else {
            newListHead = l1Iterator;
            l1Iterator = l1Iterator.next;
        }
        iter = newListHead;

        while (l1Iterator != null && l2Iterator != null)
            if (l1Iterator.val > l2Iterator.val) {
                iter.next = l2Iterator;
                l2Iterator = l2Iterator.next;
                iter = iter.next;
            } else {
                iter.next = l1Iterator;
                l1Iterator = l1Iterator.next;
                iter = iter.next;
            }


        if (l1Iterator == null)
            while (l2Iterator != null) {
                iter.next = l2Iterator;
                l2Iterator = l2Iterator.next;
                iter = iter.next;
            }

        if (l2Iterator == null)
            while (l1Iterator != null) {
                iter.next = l1Iterator;
                l1Iterator = l1Iterator.next;
                iter = iter.next;
            }
        return newListHead;
    }

    private static void printList(ListNode list){
        while (list != null) {
            System.out.print(list.val + " -> ");
            list = list.next;
        }
        System.out.println("null");
    }

}
