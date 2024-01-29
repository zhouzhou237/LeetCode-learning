package Num234;

public class Solution1 {
    public boolean isPalindrome(ListNode head) {
        // ListNode ptr = head;
        // List<Integer> num = new ArrayList<>();
        // while(ptr != null){
        //     num.add(ptr.val);
        //     ptr = ptr.next;
        // }
        // int end = num.size() - 1;
        // for(int i = 0; i < num.size(); i++){
        //     if(num.get(i) == num.get(end)){
        //         end--;
        //     }
        //     else{
        //         return false;
        //     }
        // }
        // return true;

        ListNode Node = head;
        ListNode invert_Node = reserve(head);


        while(Node != null) {
            if(Node.val != invert_Node.val) {
                return false;
            }

            Node = Node.next;
            invert_Node = invert_Node.next;
        }

        return true;
    }

    public ListNode reserve(ListNode head) {
        // ListNode current_Node = head;
        ListNode pre = null;

        while(head != null) {
            ListNode next_Node = head.next;
            head.next = pre;
            pre = head;
            head = next_Node;
        }

        return pre;
    }


}

