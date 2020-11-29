import java.util.Arrays;
import java.util.Random;

public class example17_05 {
    public static void main(String[] args) {
        Integer[][] arr = new Integer[3][5];

        System.out.println("before restore:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = new Random().nextInt(5);
            }
            System.out.println(Arrays.toString(arr[i]));
        }

        Integer[][] arrAfterRestore = restore(arr);
        System.out.printf("after restore: \n");
        for (int i = 0; i < arrAfterRestore.length; i++) {
            System.out.println(Arrays.toString(arrAfterRestore[i]));
        }
    }

    static Integer[][] restore (Integer[][] inArray ){
        Integer[][] restoreInt = new Integer[inArray[0].length][inArray.length];
        for (int i = 0; i < restoreInt.length; i++) {
            for (int j = 0; j < restoreInt[0].length; j++) {
                restoreInt[i][j] = inArray[j][i];
            }
        }
        return restoreInt;
    }
}
