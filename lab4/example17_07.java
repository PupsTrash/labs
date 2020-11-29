import java.util.Arrays;

public class example17_07 {
    public static void main(String[] args) {
        int[][] arr = new int[5][4];



        int itt = 0;


        while (itt < arr.length/1.5){
            int row = 0 + itt;
            int column = 0 + itt;
            for (int j = column; j < arr[0].length - itt; j++) {
                arr[row][j] = 8;
                column++;
            }
            column--;
            for (int[] a : arr) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println();


            for (int j = row; j < arr.length - itt; j++) {
                arr[j][column] = 8;
                row++;
            }
            row--;
            for (int[] a : arr) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println();

            for (int j = column; j > 0; j--) {
                arr[row][j] = 8;
                column--;
            }
            for (int[] a : arr) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println();

            for (int j = row; j > 0; j--) {
                arr[j][column] = 8;
            }
            itt++;
            for (int[] a : arr) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println();
        }
    }
}
