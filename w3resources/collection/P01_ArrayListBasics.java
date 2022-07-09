package w3resources.collection;

import java.util.ArrayList;
import java.util.List;

public class P01_ArrayListBasics {

    public static void main(String[] args) {
        //create an array list
        List<String> list_strings = new ArrayList<String>();
        list_strings.add("Violet");
        list_strings.add("Indigo");
        list_strings.add("Blue");
        list_strings.add("Green");
        list_strings.add("Yellow");
        list_strings.add("Orange");
        list_strings.add("Red");

        System.out.println("To iterate through all elements with forEach...");
        for(String element: list_strings){
            System.out.println(element);
        }

        //print the list
        System.out.println(list_strings);

        System.out.println("To insert an element at the first position");
        list_strings.add(0,"Black");
        System.out.println("To insert an element at the last position");
        list_strings.add(list_strings.size(), "White");

        System.out.println("New List after above inserts: ");
        System.out.println(list_strings);

        System.out.println("To retrieve an element at a specific index");
        String foundElement = list_strings.get(5);
        System.out.println("Found = "+foundElement);

        System.out.println("To update an element at a specific index");
        list_strings.set(0,"Crow Black");
        System.out.println("Updated List ");
        System.out.println(list_strings);

    }
}
