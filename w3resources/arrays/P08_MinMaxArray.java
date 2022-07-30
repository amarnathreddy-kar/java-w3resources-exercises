package w3resources.arrays;

import java.util.Arrays;
import java.util.Collections;

public class P08_MinMaxArray {
    public static void main(String[] args) {
        Integer[] num = {3,6,9,4,-3,21,3,1};

        //Need to convert an array to arraylist to use Collections utility
        int min = Collections.min(Arrays.asList(num));
        int max = Collections.max((Arrays.asList(num)));

        System.out.println("Using Collections min value in array is "+min+" and max value is "+max);

        //using Arrays.sort method
        Integer[] num_arr = {3,7,9,5,6,-9,-4,61,-8};
        System.out.println("Before sorting: "+Arrays.toString(num_arr));

        Arrays.sort(num_arr);
        System.out.println("After sorting: "+Arrays.toString(num_arr));

        System.out.println("Using Arrays.sort min value in array is "+num_arr[0]+" and max value is "+num_arr[num_arr.length - 1]);
    }
}
