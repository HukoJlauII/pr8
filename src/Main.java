import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner s=new Scanner(System.in);
        ArrayList a=new ArrayList<Character>();
        String st=s.nextLine();
        int i=0;
        while(i<st.length())
        {
            a.add(st.charAt(i));
            i++;
        }
        Waitlist w=new Waitlist(a);
        w.remove();
        System.out.println(w.toString());
        BoundedWaitList b = new BoundedWaitList<>(5);
        i=0;

        for (Object str :a)
        {
            b.add(str);
            i++;
        }

        System.out.println(b.toString());
        UnfairWaitList u= new UnfairWaitList();
        u.moveToBack(9);

        /*int toRemove=s.nextInt();
        u.remove(toRemove);*/
        System.out.print(u.toString());
    }
}
