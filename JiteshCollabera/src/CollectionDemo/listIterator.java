package CollectionDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class listIterator {
    public static void main(String [ ] args)
    { List<String> nameList = new LinkedList<String>();
        String [] names = {"Ann", "Bob", "Carol"};
        for (int k = 0; k < names.length; k++)   //add to Arraylist
            nameList.add(names[k]);



        for (int k = 0; k < nameList.size(); k++)
            System.out.println(nameList.get(k));

        ListIterator l=nameList.listIterator();
        while(l.hasNext())
            System.out.println(l.next());

        while (l.hasPrevious())
            System.out.println(l.previous());

    }
}
