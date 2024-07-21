public class Tree_BinhVVT_BD00283 {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    public boolean search(int data) {
        return searchRec(root, data);
    }
    private boolean searchRec(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        return data < root.data ? searchRec(root.left, data) : searchRec(root.right, data);
    }
    public void inOrder() {
        inOrderRec(root);
    }
    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }
    public void preOrder() {
        preOrderRec(root);
    }
    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
    public static void main(String[] args) {
        Tree_BinhVVT_BD00283 bst = new Tree_BinhVVT_BD00283();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(283);
        bst.insert(60);
        bst.insert(80);
        System.out.print("In-order traversal: ");
        bst.inOrder();
        System.out.print("\nPre-order traversal: ");
        bst.preOrder();
        System.out.println("\nSearch for 283: " + bst.search(283));
    }
}
