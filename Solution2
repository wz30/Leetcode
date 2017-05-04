/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 //array is dynamic???
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null; //
        ListNode res1 = null; // two ListNode for the result, one is insert, one for root
        int tag = 0;
        int flag = 1;
        
        while(l1!=null&&l2!=null){   // three cases > < =
            int r2 = l1.val+l2.val+tag;
            ListNode r1 = null;
            if(r2<=9){
                r1 = new ListNode(r2);
                tag = 0;
            }
            else{
                r1 = new ListNode(r2-10);
                tag = 1;
            }
            
            if(flag == 1 ){
                res = r1;
                flag= 0;
                res1 = res;
            }
            else{
                 res.next = r1 ;  
                 res = res.next;
            }
            
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 != null){     //case {[1,2],[1]}
            while(l1!=null){
                int r2 = l1.val+tag;
                ListNode r1 = null;
                if(r2<=9){
                    r1 = new ListNode(r2);
                    tag = 0;
                }
                else{
                    r1 = new ListNode(r2-10);
                    tag = 1;
                }
                res.next = r1 ;  
                res = res.next;
                l1 = l1.next;
            }
            
        }
        else if(l2 != null){   //case {[1],[1,2]}
            while(l2!=null){
                int r2 = l2.val+tag;
                ListNode r1 = null;
                if(r2<=9){
                    r1 = new ListNode(r2);
                    tag = 0;
                }
                else{
                    r1 = new ListNode(r2-10);
                    tag = 1;
                }
                res.next = r1 ;  
                res = res.next;
                l2 = l2.next;
            }
        }
        if(tag == 1){     //case {[1,2],[1,2]}
            ListNode r1 = new ListNode(tag);
            res.next = r1;
        }
       return res1;
    }
}
