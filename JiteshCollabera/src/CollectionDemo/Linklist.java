package CollectionDemo;

import java.util.LinkedList;
import java.util.List;


public class Linklist {
    public static void main(String [ ] args)
    { List<String> nameList = new LinkedList<String>();
        String [] names = {"Ann", "Bob", "Carol"};
      for (int k = 0; k < names.length; k++)   //add to Arraylist
         nameList.add(names[k]);



  for (int k = 0; k < nameList.size(); k++)
         System.out.println(nameList.get(k));



    }
}
