public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (null == head) return null;
        if (null == head.next) return head;
        ListNode newHead = head.next; // node2 always new head

        do {
            ListNode node0 = head;


            head = head.next; //node1
            if (head != null) { // even number of nodes
                ListNode tail = head.next; //node3
                // Linking nodes
                node0.next = tail;
                if (tail != null && tail.next != null) {
                    node0.next = tail.next;
                }

                head.next = node0;
                head = tail;
            }

            /*ListNode res = head;
            while (res != null) {
                System.out.print(res.val + " ");
                res = res.next;
            }
            System.out.println(" ");*/
        } while (head != null);

        return newHead;

    }
}

