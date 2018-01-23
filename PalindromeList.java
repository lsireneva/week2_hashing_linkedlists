public class Solution {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);

        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(1);

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println(lPalin(a));
    }


    public static int lPalin(ListNode A) {

        ListNode fast = A, slow = A;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = A;

        while (slow != null) {
            if (fast.val != slow.val) {
                return 0;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return 1;
    }

    public static ListNode reverse(ListNode node) {
        ListNode head = node, newhead = node;
        while (head != null && head.next != null) {
            ListNode tmp = head.next.next;
            head.next.next = newhead;
            newhead = head.next;
            head.next = tmp;
        }
        return newhead;
    }

}
