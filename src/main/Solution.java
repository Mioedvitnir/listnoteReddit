package main;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode first = new ListNode();
        int carry = 0;
        first = null;
        while (l1 != null && l2 != null) {
            if (first == null) {
                ListNode temp = new ListNode();
                temp.val = l1.val + l2.val;
                // temp.next=null;
                first = temp;
                if (first.val >= 10) {
                    carry = 1;
                    first.val = 10 - first.val;
                }
                first.next = l3;
                l3.next = null;
                //System.out.println(first.val);
            } else {
                ListNode temp = new ListNode();
                // System.out.println("e");
                if (carry == 1) {
                    temp.val = l1.val + l2.val + carry;
                    carry = 0;
                } else {
                    temp.val = l1.val + l2.val;
                }
                temp.next = null;
                if (temp.val >= 9) {
                    carry = 1;
                    temp.val = 10 - temp.val;
                }
                l3.next = temp;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 != null) {
            while (l1 != null) {
                if (first == null) {
                    ListNode temp = new ListNode();
                    temp.val = l1.val;
                    // temp.next=null;
                    first = temp;
                    if (first.val > 9) {
                        carry = 1;
                        first.val = 10 - first.val;
                    }
                    first.next = l3;
                    l3.next = null;
                    //System.out.println(first.val);
                } else {
                    ListNode temp = new ListNode();
                    // System.out.println("e");
                    if (carry == 1) {
                        temp.val = l1.val + carry;
                        carry = 0;
                    } else {
                        temp.val = l1.val;
                    }
                    temp.next = null;
                    if (temp.val > 9) {
                        carry = 1;
                        temp.val = 10 - temp.val;
                    }
                    l3.next = temp;
                }
                l1 = l1.next;
            }
        } else if (l2 != null) {
            while (l2 != null) {
                if (first == null) {
                    ListNode temp = new ListNode();
                    temp.val = l2.val;
                    // temp.next=null;
                    first = temp;
                    if (first.val > 9) {
                        carry = 1;
                        first.val = 10 - first.val;
                    }
                    first.next = l3;
                    l3.next = null;
                    //System.out.println(first.val);
                } else {
                    ListNode temp = new ListNode();
                    // System.out.println("e");
                    if (carry == 1) {
                        temp.val = l2.val + carry;
                        carry = 0;
                    } else {
                        temp.val = l2.val;
                    }
                    temp.next = null;
                    if (temp.val > 9) {
                        carry = 1;
                        temp.val = 10 - temp.val;
                    }
                    l3.next = temp;
                }
                l2 = l2.next;
            }
        }
        return first;
    }
}
