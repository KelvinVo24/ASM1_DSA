import java.util.LinkedList;
import java.util.Queue;

public class Queue_BinhVVT_BD00283 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Dequeued element is: " + queue.remove());

        System.out.println("Front element is: " + queue.peek());
    }
}