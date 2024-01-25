package org.example.MergeTwoLists;


class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class MargeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        ListNode head = null;

        while (list1.next != null || list2.next != null) {
            if (list1.value <= list2.value) {
                head.value = list1.value;

            } else {
                head.value = list2.value;
            }

            head = head.next;
        }

        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        MargeTwoLists merger = new MargeTwoLists();

        // Example 1
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode mergedList1 = merger.mergeTwoLists(list1, list2);
        printList(mergedList1);

        // Example 2
        ListNode list3 = null;
        ListNode list4 = null;

        ListNode mergedList2 = merger.mergeTwoLists(list3, list4);
        printList(mergedList2);

        // Example 3
        ListNode list5 = null;
        ListNode list6 = new ListNode(0);

        ListNode mergedList3 = merger.mergeTwoLists(list5, list6);
        printList(mergedList3);
    }
}
