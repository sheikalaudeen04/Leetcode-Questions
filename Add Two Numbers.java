class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize a dummy node to start the result list
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        // Traverse both lists
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            // Calculate the sum and update the carry
            int sum = x + y + carry;
            carry = sum / 10;
            
            // Create a new node with the digit value and move the current pointer
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            // Move to the next nodes in l1 and l2
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        // If there is a carry left, add a new node with the carry value
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        // Return the result list starting from the next node of the dummy head
        return dummyHead.next;
    }
}