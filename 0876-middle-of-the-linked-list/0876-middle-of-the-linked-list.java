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

    int getLength(ListNode head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public ListNode middleNode(ListNode head) {
        
        int length = getLength(head);
        int temp = length/2;

        ListNode ans = head;

        int count = 0;
        while(count<temp){
            ans = ans.next;
            count++;
        }

        return ans;
        
    }
}