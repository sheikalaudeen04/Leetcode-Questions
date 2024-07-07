from typing import Optional, List

class ListNode:
    def _init_(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def nodesBetweenCriticalPoints(self, head: Optional[ListNode]) -> List[int]:
        if not head or not head.next or not head.next.next:
            return [-1, -1]
        
        prev = head
        curr = head.next
        next = head.next.next
        
        first_critical = -1
        last_critical = -1
        min_distance = float('inf')
        position = 1
        
        while next:
            if (curr.val > prev.val and curr.val > next.val) or (curr.val < prev.val and curr.val < next.val):
                if first_critical == -1:
                    first_critical = position
                else:
                    min_distance = min(min_distance, position - last_critical)
                last_critical = position
            prev = curr
            curr = next
            next = next.next
            position += 1
        
        if first_critical == -1 or first_critical == last_critical:
            return [-1, -1]
        
        max_distance = last_critical - first_critical
        return [min_distance, max_distance]