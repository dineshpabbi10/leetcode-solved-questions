class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;
        // find length of list
        while(curr != null){
            length++;
            curr = curr.next;
        }

        // delete node when length becomes 0
        curr = head;
        length = length - n;
        // If length == 0 , we have to delete first node
        if(length == 0) return head.next;
        // else continue with deleting other node
        while(length > 0){
            length--;
            if(length == 0) curr.next = curr.next.next;
            curr = curr.next;
        }
        return head;
    }
}