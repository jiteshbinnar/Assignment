package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsingIterator {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add("hi");
        l.add("hello");
        l.add("how are you");
        l.add("fine");

        Iterator i=l.iterator();
        while (i.hasNext())
            System.out.println(i.next());


    }
}
