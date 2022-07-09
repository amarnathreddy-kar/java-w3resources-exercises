package w3resources.arrays;

import java.util.Arrays;

public class P04_ContainsElement {
    public static void main(String[] args) {
        int[] num_array = {45, 89, 92, 93, 98, 56};
        int[] num_array2 = {};
        System.out.println("Your Array = " + Arrays.toString(num_array));
        System.out.println("Is element 93 available in your array ? " + contains(num_array, 93));
        System.out.println("Is element 57 available in your array ? " + contains(num_array, 57));

        System.out.println("Element 99 available at Index: " + findIndex(num_array, 99));
        System.out.println("Element 98 available at Index: " + findIndex(num_array, 98));
        System.out.println("Element 89 available at Index: " + findIndex(num_array, 89));
        System.out.println("Element 89 available at Index: " + findIndex(num_array2, 89));

    }

    //Write a Java program to test if an array contains a specific value.
    //to check if an element present in an array
    public static boolean contains(int[] array, int e) {
        for (int n : array) {
            if (e == n) {
                return true;
            }
        }
        return false;
    }

    //Write a Java program to find the index of an array element.
    public static int findIndex(int[] array, int e) {
        int i = 0;
        while (i < array.length) {
            if (array[i] == e) {
                return ++i;
            }
            i++;
        }
        return -1;
    }
}
