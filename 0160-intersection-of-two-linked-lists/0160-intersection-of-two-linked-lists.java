public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0, lengthB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;

        if (lengthA > lengthB) {
            int step = lengthA - lengthB;
            for (int i = 0; i < step; i++) {
                tempA = tempA.next;
            }
        } else {
            int step = lengthB - lengthA;
            for (int i = 0; i < step; i++) {
                tempB = tempB.next;
            }
        }

        while (tempA != null && tempB != null) {
            if (tempA == tempB) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null;
    }
}
