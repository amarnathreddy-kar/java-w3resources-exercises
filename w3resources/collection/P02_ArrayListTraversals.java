package w3resources.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class P02_ArrayListTraversals {
//    There are various ways to traverse the collection elements://
//    By Iterator interface.
//    By for-each loop.
//    By ListIterator interface.
//    By for loop.
//            By forEach() method.
//    By forEachRemaining() method.

    private static List<String> list;
    private static ListIterator<String> reverseList;

public static void main(String[] args) {
    list =  new ArrayList<String>();
    list.add("Amarnath");
    list.add("Arraylist");
    list.add("Collections");
    list.add("DataStructures");
    list.add("Algorithms");
    System.out.println("Printing to the console: "+list);

    System.out.println();
    System.out.println("Traversing the list through List Iterator in reverse order");
    reverseList = list.listIterator(list.size());
    while(reverseList.hasPrevious()){
        String str = reverseList.previous();
        System.out.print(str+" | ");
    }

    System.out.println();
    System.out.println();
    System.out.println("Traversing the list through forEach method() ");
    list.forEach(a-> System.out.print(a+" -> "));

    System.out.println();
    System.out.println();
    System.out.println("Traversing the list through forEachRemaining() method");
    Iterator<String> itr = list.iterator();
    itr.forEachRemaining(a-> System.out.print(a+"<->"));


}

}
