public class Main {
    public static void main (String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode g = new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = g;

        //printNode(a);
        ListNode res = partition(a, 6);
        //printNode (res);

    }

    public static ListNode partition(ListNode head, int x) {
        ListNode head_less = null, node_less = null;
        ListNode head_more = null, node_more = null;

        while (head != null) {
            ListNode tmp = head.next;
            if (head.val < x) {
                if (head_less == null) {head_less = head;node_less = head;}
                else { node_less.next = head; node_less = head; }
                node_less.next = null;
                printNode(head_less);
            } else {
                if (head_more == null) {head_more = head;node_more = head;}
                else { node_more.next = head; node_more = head; }
                node_more.next = null;
                printNode(head_more);
            }
            head = tmp;
        }
        // Join both lists
        if (node_less != null) {
            node_less.next = head_more;
            //printNode(head_less);
            return head_less;
        } else { // no less numbers
            return head_more;
        }
    }

    public static void printNode (ListNode res) {
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println(" ");
    }
}
