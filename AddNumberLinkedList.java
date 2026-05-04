public class AddNumberLinkedList {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node add(Node head1, Node head2) {

        Node t1 = reverse(head1);
        Node t2 = reverse(head2);

        Node head = new Node(0);
        Node temp = head;
        int carry = 0;

        while (t1 != null || t2 != null || carry != 0) {
            int sum = carry;

            if (t1 != null) {
                sum = sum + t1.data;
                t1 = t1.next;
            }

            if (t2 != null) {
                sum = sum + t2.data;
                t2 = t2.next;
            }

            carry = sum / 10;
            temp.next = new Node(sum % 10);
            temp = temp.next;
        }

        Node res = reverse(head.next);

        while (res != null && res.data == 0) {
            res = res.next;
        }

        return res == null ? new Node(0) : res;
    }

    private Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node nextNode = null;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

}
