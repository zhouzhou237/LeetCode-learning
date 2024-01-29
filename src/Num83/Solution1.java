package Num83;

public class Solution1 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;

        ListNode result = head;
        while(result.next != null) {
            if(result.val == result.next.val) {
                result.next = result.next.next;
            }else {
                result = result.next;
            }
        }
        return head;
    }
}
