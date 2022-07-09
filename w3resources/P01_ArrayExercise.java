package w3resources;

import java.util.Arrays;

public class P01_ArrayExercise {

    //Write a Java program to sort a numeric array and a string array.
    static int [] numArray = {1,3,6,8,9};
    static String[] strArray = {"Hello World", "of", "Java", "Data Structures"};

    public static void main(String[] args) {
        System.out.println("Original Array = "+ Arrays.toString(numArray));
        System.out.println("After Sorting = "+ Arrays.toString(numArray));

    }
}
