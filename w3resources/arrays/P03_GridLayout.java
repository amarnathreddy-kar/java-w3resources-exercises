package w3resources.arrays;

public class P03_GridLayout {
    public static void main(String[] args) {
        int[][]array = new int[8][8];
        System.out.println(array.length);
        for (int i=0;i<array.length; i++){
            for(int j=0;j<array.length;j++) {
                System.out.printf("%2d", array[i][j]);
            }
            System.out.println();
        }
    }
}
