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
    
    //Optimized Solution
    public ListNode middleNode(ListNode head) {

        if(head == null){
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr!=null&&fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;

        // if(head==null || head.next==null){
        //     return head;
        // }

        // if(head.next.next==null){
        //     return head.next;
        // }

        // ListNode slow = head;
        // ListNode fast = head.next;

        // while(fast!=null){
        //     fast = fast.next;
        //     if(fast!=null){
        //         fast = fast.next;
        //     }
        //     slow = slow.next;
        // }

        // return slow;
    } 


//     int getLength(ListNode head){
//         int count = 0;
//         while(head!=null){
//             count++;
//             head = head.next;
//         }
//         return count;
//     }

//     public ListNode middleNode(ListNode head) {
        
//         int length = getLength(head);
//         int temp = length/2;

//         ListNode ans = head;

//         int count = 0;
//         while(count<temp){
//             ans = ans.next;
//             count++;
//         }

//         return ans;
//     }
}