import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends Waitlist {
    private int capacity;
    public BoundedWaitList(int capacity)
    {
        this.capacity=capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(Object element) {
        if (content.size()<capacity)
            super.add(element);
        else
            System.out.println("BoundedWaitlist is full");
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                "} " + super.toString();
    }
}
