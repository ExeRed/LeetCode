package org.example.LinkedList;

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class MyLinkedList {

    ListNode head;

    public MyLinkedList() {
        this.head = null;
    }

    public int get(int index) {
        if (index < 0 || head == null) {
            return -1;
        }

        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            if (cur.next == null) {
                return -1;
            }
            cur = cur.next;
        }
        return cur.value;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        if (index <= 0) {
            addAtHead(val);
            return;
        }

        ListNode newNode = new ListNode(val);
        ListNode cur = head;

        for (int i = 0; i < index - 1; i++) {
            if (cur == null) {
                return;
            }
            cur = cur.next;
        }

        if (cur == null) {
            return;
        }

        newNode.next = cur.next;
        cur.next = newNode;

    }

    public void deleteAtIndex(int index) {
        if (index < 0 || head == null) {
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        ListNode cur = head;

        for (int i = 0; i < index - 1; i++) {
            if (cur.next == null) {
                return;
            }
            cur = cur.next;
        }

        if (cur.next == null) {
            return;
        }

        cur.next = cur.next.next;
    }


}

public class Main {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtTail(1);
        obj.addAtTail(3);
        System.out.println(obj.get(1));
    }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */