# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# prev.next = curr.next
# curr.next = prev.next.next
# prev.next.next = curr
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        i = 1
        curr = head
        prev = head
        
        while(curr != None):
            if(curr == head):
                temp = curr.next
                if(temp != None):
                    curr.next = curr.next.next
                    temp.next = curr
                    head = temp
            else:
                if(curr.next != None):
                    prev.next = curr.next
                    curr.next = prev.next.next
                    prev.next.next = curr
            
            prev = curr
            curr = curr.next
            
        return head
        