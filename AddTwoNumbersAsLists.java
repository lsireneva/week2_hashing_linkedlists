public class AddTwoNumbersAsLists {

    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode result = null;
        ListNode prev = null, temp = null;

        int carry=0;
        int sum =0;

        while (A!=null || B!= null) {
            sum = carry + (A != null ? A.val : 0) + (B != null ? B.val : 0);
            if (sum>= 10) {
                carry = 1;
            } else {
                carry = 0;
            }

            sum = sum%10;

            temp = new ListNode(sum);

            if (result == null) {
                result = temp;
            } else {
                prev.next = temp;

            }
            prev = temp;

            if (A != null) {
                A = A.next;
            }
            if (B != null) {
                B = B.next;
            }

        }
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return result;
    }
}
