public class SglLinkedList_BinhVVT_BD00283 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SglLinkedList_BinhVVT_BD00283 list = new SglLinkedList_BinhVVT_BD00283();
        list.insertAtBeginning(24);
        list.insertAtBeginning(5);
        list.insertAtEnd(100);
        list.insertAtEnd(43);
        list.printList();
    }
}
