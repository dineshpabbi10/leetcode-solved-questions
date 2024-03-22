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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int length1 = this.getLength(l1);
        int length2 = this.getLength(l2);
        
        if(length1> length2){
            this.sumLists(l1,l2);
            return l1;
        }else{
            this.sumLists(l2,l1);
            return l2;
        }
    }
    
    public int getLength(ListNode cursor){
        int length = 0;
        while(cursor!=null){
            length++;
            cursor = cursor.next;
        }
        return length;
    }
    
    public void sumLists(ListNode a, ListNode b){
        int carry = 0;
        while(a != null ){
            if(b!=null){
                int sum = a.val+b.val + carry;
                carry = (int) sum/10;
                a.val = sum %10;
                if(a.next == null && carry > 0){
                    a.next = new ListNode(carry);
                    a = a.next;
                }
                a = a.next;
                b = b.next;
            }else{
                int sum = a.val + carry;
                carry = (int) sum/10;
                a.val = sum%10;
                if(a.next == null && carry > 0){
                    a.next = new ListNode(carry);
                    a = a.next;
                }
                a = a.next;
            }
            
            
        }  
    }
}