import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends Waitlist {
    public UnfairWaitList()
    {
        for (int i=0;i<10;i++)
        {
            this.add((int)(Math.random()*100));
        }
    }

    public void remove(E element)
    {
           if (content.contains(element))
           {
               int counter=0;
               for (Object el : content) {
                   if (el == element) {
                       break;
                   }
                   else counter++;
               }
               if (counter!=0)
               content.remove(element);
               else
               {
                   System.out.println("Element is the first");
               }
           }
           else
           {
               System.out.println("Element not found");
           }
    }

    public void moveToBack(E element)
    {
        if (content.contains(element))
        {
            content.add(content.remove(element));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
