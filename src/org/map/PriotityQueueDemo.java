package org.map;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriotityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
        queue.offer(2);
        queue.offer(1);
        queue.offer(3);
        queue.offer(4);
        queue.offer(42);
        queue.offer(5);
        queue.offer(6);
        queue.offer(2);
        queue.offer(1);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

    }
}

