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
    public ListNode swapPairs(ListNode head) {
        // If we have one or less nodes return head
        if(head == null || head.next == null) return head;

        ListNode prevNode = head;
        ListNode leadNode = head.next;
        ListNode tailNode = leadNode;
        // Save the head node to be returned later
        ListNode returnNode = leadNode;

        while(leadNode != null){
           if(tailNode != returnNode) tailNode.next = leadNode;
           prevNode.next = leadNode.next;
           leadNode.next = prevNode;

           tailNode = prevNode;
           prevNode = prevNode.next;
           if(prevNode == null || prevNode.next == null) break;
           leadNode = prevNode.next;
        }
        return returnNode;
    }
}