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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> l=new ArrayList<>();
        while(list1!=null){
            l.add(list1.val);
            list1=list1.next;
        }
         while(list2!=null){
            l.add(list2.val);
            list2=list2.next;
        }
        Collections.sort(l);

        ListNode newhead = new ListNode(-1);
        ListNode temp = newhead;
        for(int num:l){
            temp.next=new ListNode(num);
            temp=temp.next;
        }
        return newhead.next;
        
    }
}