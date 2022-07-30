package w3resources.arrays;

import java.util.Arrays;

public class P07_CopyArray {
    public static void main(String[] args) {
        int a[] = {3,4,9,10,23};
        int z[] = {8,4,5,3,21,65};

        //using clone() method
        int b[] = a.clone();
        System.out.println("Cloned Array b[] = "+ Arrays.toString(b));

        int c [] = new int[z.length];
        //using arraycopy() method
        System.arraycopy(z,0,c,0,6);
        //source array, source index, destination array, dest. index and resultant array length
        System.out.println("Using arraycopy method = "+Arrays.toString(c));

    }
}
