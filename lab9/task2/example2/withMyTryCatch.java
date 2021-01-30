package task2.example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class withMyTryCatch {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));



        int[][] arr = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = new Random().nextInt(9);
            }
        }
        printArr(arr);

        System.out.println("введите какой столбец хотите отобразить");

        int[] stl = new int[10];
        try {
            int temp = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < 10; i++) {
                stl[i] = arr[i][temp];
                System.out.println("столбец temp:");
                System.out.println(Arrays.toString(stl));
            }
        }catch (NumberFormatException numberFormatException){
            System.out.println("this's not numb");
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("нет такого столбца");
        }







    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}


