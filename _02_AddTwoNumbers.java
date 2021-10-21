package problem;
/*
 * 给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字0之外，这两个数都不会以0开头。
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 */
public class _02_AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static class solution{
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int add = l1.val + l2.val;
            int ten = add / 10;
            ListNode l3 = new ListNode(add % 10);
            ListNode tmp = l3;
            while (l1.next != null && l2.next != null) {
                l1 = l1.next;
                l2 = l2.next;
                add = l1.val + l2.val + ten;
                ten = add / 10;
                tmp.next = new ListNode(add % 10);
                tmp = tmp.next;
            }
            while (l1.next != null) {
                l1 = l1.next;
                add = l1.val + ten;
                ten = add / 10;
                tmp.next = new ListNode(add % 10);
                tmp = tmp.next;
            }
            while (l2.next != null) {
                l2 = l2.next;
                add = l2.val + ten;
                ten = add / 10;
                tmp.next = new ListNode(add % 10);
                tmp = tmp.next;
            }
            if(ten != 0)
                tmp.next = new ListNode(ten);
            return l3;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        //l2.next.next = new ListNode(4);

        ListNode l3 = solution.addTwoNumbers(l1, l2);
        while (l3 != null){
            System.out.print(l3.val + ", ");
            l3 = l3.next;
        }
    }
}
