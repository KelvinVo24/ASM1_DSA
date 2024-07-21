public class CclLinkedList_BinhVVT_BD00283 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void printList() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        CclLinkedList_BinhVVT_BD00283 list = new CclLinkedList_BinhVVT_BD00283();
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(1);
        list.printList();
    }
}
