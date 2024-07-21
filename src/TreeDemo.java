//public class TreeDemo {
//
//    private static void createTree(TreeDemo main, TreeDemo left, TreeDemo right){
//        main.left = left;
//        main.right = right;
//    }
//
//    private static void printTreePreOrder(Node root){
//        if(root != null){
//            System.out.println(root);
//            printTreePreOrder(root.left);
//            printTreePreOrder(root.right);
//        }
//    }
//
//    public static void main(String [] args){
//        System.out.println("Tree Demo");
//        Node root = new Node(1, null, null);
//        Node left = new Node(2, null, null);
//        Node right = new Node(3, null, null);
//        createTree(root, second, three);
//
//        Node four = new Node(4, null, null);
//        Node five = new Node(5, null, null);
//        createTree(second, four, five);
//
//        Node six = new Node(6, null, null);
//        Node seven = new Node(7, null, null);
//        createTree(three, six, seven);
//
//        printTreePreOrder(root);
//    }
//
//    private static void printTreePreOrder(Node root){
//        if(root != null){
//
//            printTreePreOrder(root.left);
//            printTreePreOrder(root.right);
//            System.out.println(root);
//        }
//    }
//}
