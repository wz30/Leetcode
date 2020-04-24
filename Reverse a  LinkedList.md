## Problem 
- 206. Reverse Linked List

- recursion
```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //think corner case
        if(head==null) return null;
        if(head.next==null) return head;
        
        ListNode last = reverseList(head.next);
        
        //link head and rest of list
        //point second node to first node and make fistnode.next==null in current recursion
        head.next.next = head;
        head.next = null;
        
        return last;
    }
}
```

## Problem





## Reference
- [文档](https://github.com/labuladong/fucking-algorithm/blob/master/%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E7%B3%BB%E5%88%97/%E9%80%92%E5%BD%92%E5%8F%8D%E8%BD%AC%E9%93%BE%E8%A1%A8%E7%9A%84%E4%B8%80%E9%83%A8%E5%88%86.md)
