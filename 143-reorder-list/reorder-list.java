/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        int length = 0;
        ListNode curr = head;
        ListNode middleNode = head;
        ListNode temp = null;
        ListNode prev = null;
        // find middle node
        while(curr.next != null && curr.next.next != null){
            curr = curr.next.next;
            middleNode = middleNode.next;
        }

        // reverse from middle node
        curr = middleNode.next;
        middleNode.next = null;
        prev = null;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // create result
        curr = head;
        while(curr != null && prev != null){
            temp = curr.next;
            curr.next = prev;
            prev = prev.next;
            curr.next.next = temp;
            curr = temp;
        }
    }
}