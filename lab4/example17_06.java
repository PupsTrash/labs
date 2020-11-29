import java.util.*;


public class example17_06 {
    public static void main(String[] args) {
        Integer[][] arr = new Integer[3][5];
        System.out.println("before restore: arr[" + arr.length +"][" + arr[0].length + "]" );

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = new Random().nextInt(5);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        int randomRow = new Random().nextInt(arr.length);
        int randomColumn = new Random().nextInt(arr[0].length);

        Integer[][] arr2 = del(arr, randomRow, randomColumn);
        System.out.println("delete row " + randomRow + "\ndelete column " + randomColumn);
        System.out.println("after delete: arr[" + arr.length +"][" + arr[0].length + "]");
        for (Integer[] r : arr2) {
            System.out.println(Arrays.toString(r));
        }
    }

    static Integer[][] del (Integer[][] beforeArr, int row, int column) {
       Integer[][] tArr = new Integer[beforeArr.length-1][beforeArr[0].length-1];
       int tI = 0;
        for (int i = 0; i < beforeArr.length; i++) {
            int tJ = 0;
            for (int j = 0; j < beforeArr[0].length; j++) {
                if (j != column-1){
                    tArr[tI][tJ] = beforeArr[i][j];
                    tJ++;
                }
            }
            if (i != row-1){
                tI++;
            }
        }
        return tArr;
    }

}
