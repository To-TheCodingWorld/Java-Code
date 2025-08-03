package in.kgcoding.Collection;

import in.kgcoding.Utility;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);
        queue.remove(1);
        Utility.Print(queue);

        System.out.println(queue.add(1));
        Utility.Print(queue);
        System.out.println(queue.peek());

    }
}
