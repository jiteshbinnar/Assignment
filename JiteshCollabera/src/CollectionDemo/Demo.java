package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add("hi");
        l.add("hello");
        l.add("how are you");
        l.add("fine");

        for (Object o:l)
            System.out.println(o);

        System.out.println(l);

        for (int i=0;i<l.size();i++)
            System.out.println(l.get(i));
    }
}
