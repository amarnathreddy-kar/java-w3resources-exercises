package w3resources;

public class P02_ArrayExercise {
    //Sum and Average values of an array

    public static void main(String[] args) {
        int[] num_arr = {1,3,4,6,7,8,9,21,56};
        int count = num_arr.length;
        int sum = 0;
        float avg = 0;

        //for sum of array elements
        for (int i: num_arr){
            sum = sum + i;
        }
        System.out.println("Sum is: "+sum);

        System.out.println("Total number of elements: "+count);
        //to find average
        avg = (float) sum/count;
        System.out.println("Average is: "+avg);
    }
}
