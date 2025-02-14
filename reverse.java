class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    public static ListNode deserialize(String data) {
        if (data.equals("[]")) {
            return null;
        }

        data = data.replaceAll("[\\[\\]]", "");
        String[] values = data.split(",");

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (String value : values) {
            current.next = new ListNode(Integer.parseInt(value.trim()));
            current = current.next;
        }

        return dummy.next;
    }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        return reverseListIterative(head); 
    }
    public ListNode reverseListIterative(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev; 
    }
}



