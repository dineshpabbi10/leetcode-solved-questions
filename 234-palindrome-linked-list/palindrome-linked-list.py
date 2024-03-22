# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        
        # find middle node
        mid = None
        slow = head
        fast = head
        
        while(fast != None and fast.next != None):
            fast = fast.next.next
            slow = slow.next
            
        mid = slow
        
        # reverse the direction from next of mid
        prev = None
        curr = mid
        
        while(curr!=None):
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        
        end = prev
        start = head
        
        while(start != None and end != None):
            # print(end.val,start.val)
            if(end.val != start.val):
                return False
            end = end.next
            start = start.next
        return True
             
        