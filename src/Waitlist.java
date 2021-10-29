import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Waitlist<E> implements IWaitList {
    protected ConcurrentLinkedQueue<E> content;
    public Waitlist()
    {
        content=new ConcurrentLinkedQueue<>();

    }
    public Waitlist(Collection<E> c)
    {
            content=new ConcurrentLinkedQueue<>();
            content.addAll(c);
    }

    @Override
    public String toString() {
        return "Waitlist{" +
                "content=" + content +
                '}';
    }

    @Override
    public void add(Object element) {
        content.add((E) element);

    }

    @Override
    public Object remove() {
        return content.poll();
    }

    @Override
    public boolean contains(Object element) {
        if (content.contains(element))
            return true;
        else
            return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        if (content.containsAll(c))
            return true;
        else
            return false;
    }

    @Override
    public boolean isEmpty() {
        if (content.isEmpty()==true)
            return true;
        else return false;
    }
}
