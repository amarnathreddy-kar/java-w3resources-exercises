package w3resources.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P05_RemoveElement {
    //naive/ basic approach
    public static int[] removeTheElement(int[] arr, int index) {
        //if the array is empty or the index is not in array range return the original array
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        //create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        //copy the elements except the index from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++ ){
            //if the index is removal element index
            if(i == index){
                continue;
            }
            //if the indes is not the removal element index
            anotherArray[k++] = arr[i];
        }
    return anotherArray;
    }

    //using java built-in function: System.arraycopy() method
    public static int[] removeTheElementWithBuiltInMethod(int[] arr, int index){

        if(arr == null || index < 0 || index > arr.length){
            return arr;
        }

        //creating another array
        int[] anotherArray = new int[arr.length - 1];

        //copy the elements from starting till index, from original array to the other array
        System.arraycopy(arr,0,anotherArray,0,index);

        //copy the elements from index + 1 till end, from original array to the other array
        System.arraycopy(arr,index+1, anotherArray, index, arr.length-index-1);

        return anotherArray;
    }
    //driver code
    public static void main(String[] args) {
        //get the array
        int [] arr = {1,98,56,24,35};
        System.out.println("Original Array: "+ Arrays.toString(arr));

        int [] arr1 = {1,98,56,24,35};
        System.out.println("Original Array (Built-In): "+ Arrays.toString(arr1));

        //get the specific index
        int index = 1;

        //print the index
        System.out.println("Index to be removed: "+index);

        //remove the element
        arr = removeTheElement(arr,index);
        arr1 = removeTheElementWithBuiltInMethod(arr1,index);

        //print the resultant array
        System.out.println("Resultant Array: "+ Arrays.toString(arr));
        System.out.println("Resultant Array (Built-In): "+ Arrays.toString(arr1));
    }
}

