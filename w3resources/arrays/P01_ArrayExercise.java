package w3resources.arrays;

import java.util.Arrays;

public class P01_ArrayExercise {

    //Write a Java program to sort a numeric array and a string array.
    private static int [] numArray = {6,8,9,1,12};
    private static String[] strArray = {"Hello World", "of", "Java", "Data Structures"};

    public static void main(String[] args) {
        System.out.println("Original Array = "+ Arrays.toString(numArray));
        Arrays.sort(numArray); //default is ascending order
        System.out.println("After Sorting = "+ Arrays.toString(numArray));

        System.out.println("Original String Array = "+Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("After Sorting = "+Arrays.toString(strArray));

    }
}
