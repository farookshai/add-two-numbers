package org.mconsta000.numbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class App 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode currentL1 = l1;
        ListNode currentL2 = l2;
        ListNode root = new ListNode(0);
        ListNode current = root;
        boolean moreNodes = true;

        int carry = 0;
        while (moreNodes) {
            int n1 = 0;
            int n2 = 0;
            if (currentL1 != null){
                n1 = currentL1.val;
                currentL1 = currentL1.next;
            }

            if (currentL2 != null){
                n2 = currentL2.val;
                currentL2 = currentL2.next;
            }

            int sum = n1 + n2 + carry;
            carry = sum / 10;

            ListNode sumNode = new ListNode(sum % 10);
            current.next = sumNode;
            current = current.next;

            moreNodes = (currentL1 != null || currentL2 != null);
        }

        if (carry != 0){
            current.next = new ListNode(carry);
        }

        return root.next;
    }
}
