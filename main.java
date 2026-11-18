public class MainQueue {

    public static void main(String[] args) {

        AbstractClassQueue queue = new SubClassQueue();

        queue.performOperations();
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class SubClassQueue extends AbstractClassQueue {

    @Override
    protected Queue<String> createQueue() {
        return new LinkedList<>();
    }

    @Override
    public void performOperations() {

        queue.add("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue: " + queue);

        System.out.println("Peek (front item): " + queue.peek());

        System.out.println("Element (front item): " + queue.element());

        System.out.println("Removed (poll): " + queue.poll());

        System.out.println("Removed (remove): " + queue.remove());

        System.out.println("Queue after removals: " + queue);

        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("Queue size: " + queue.size());
    }
}

import java.util.Queue;

public abstract class AbstractClassQueue {

    protected Queue<String> queue;

    public AbstractClassQueue() {
        queue = createQueue();
    }

    protected abstract Queue<String> createQueue();

    public abstract void performOperations();
}
