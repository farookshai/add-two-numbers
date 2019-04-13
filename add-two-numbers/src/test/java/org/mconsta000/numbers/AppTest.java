package org.mconsta000.numbers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app = new App();

    public ListNode buildList(int numbers[]){
        ListNode root = new ListNode(numbers[0]);
        ListNode current = root;
        for (int i=1; i<numbers.length; i++){
            ListNode next = new ListNode(numbers[i]);
            current.next = next;
            current = next;
        }
        return root;
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void addTwo()
    {
        int n1[] = {2,4,3};
        int n2[] = {5,6,4};
        int answer[] = {7, 0, 8};

        ListNode ln1 = buildList(n1);
        ListNode ln2 = buildList(n2);
        ListNode result = app.addTwoNumbers(ln1, ln2);

        ListNode current = result;
        for (int i=0; i<answer.length; i++){
            assertNotNull(current);
            assertEquals(answer[i], current.val);
            current = current.next;
        }
    }
}
