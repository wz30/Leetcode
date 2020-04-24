## Problem 
- 206 Reverse Linked List

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
- iterative solution: 利用last 去存储结果，不断更新head 的值，然后返回last.更新head时候需要store head.next
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
        if(head==null || head.next==null) return head;
        ListNode last = null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = last;
            last = head;
            head = temp;
        }
        return last;
    }
}
```

## Problem
92. Reverse Linked List II
- 利用文档里的方法， 先确定如何做reverseN： 前N Node 先reverse,进一步去计算reverse(m,n), 这时考虑对于现在的node是reverse(m,n),那么对于head.next就是reverse(m-1, n-1)
- recusrion
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
    ListNode successor = null;
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null) return head;
        if(m==1){
            return reverseN(head, n);
        }
        head.next = reverseBetween(head.next, m-1, n-1);
        return head;
    }
    //reverse first n node
    ListNode reverseN(ListNode head, int n){
        //n must > 1
        if(head==null || head.next==null) return head;
        //keep the rest list[n+1 ....]: successor
        if(n==1){
            successor = head.next;
            return head;
        }
        ListNode last = reverseN(head.next, n-1);
        
        head.next.next = head;
        head.next = successor;
        
        return last;
    }
}
```
- iterative
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        //分段处理，第一段， 第二段【要反转的list】， 第三段
        // 在处理m==1 的时候要特殊处理
        if(head==null) return null;
        ListNode last = head;
        ListNode prev = null;
        //move last pointer to point to 
        while(m>1){
            prev = last; // 1
            last = last.next;  //2
            n--;
            m--;
        }
        ListNode test = last;
        ListNode head2 = null;
        ListNode temp = null;
        while(n >= 1){
            temp = last.next; //5
            last.next = head2;
            head2 = last; //4
            last = temp;
            n--;
        }
        //case no prev or starting node, like reverse the first N node m==1的情况
        if(prev==null){
            prev = head2;
            test.next = temp;
            return prev;
        }
        else{
            prev.next = head2;
        }
        test.next = temp;
        return head;
    }
}
```

## Summary
- recursion: time; O(n), space O(n)
- iterative: time O(n), space: O(1)




## Reference
- [文档](https://github.com/labuladong/fucking-algorithm/blob/master/%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E7%B3%BB%E5%88%97/%E9%80%92%E5%BD%92%E5%8F%8D%E8%BD%AC%E9%93%BE%E8%A1%A8%E7%9A%84%E4%B8%80%E9%83%A8%E5%88%86.md)
