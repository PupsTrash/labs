package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AddArrRec {
    int[] arr = new int[0];

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public void recForAdd() throws IOException {

        String temp = bufferedReader.readLine();

        if (temp.equals("")) {
            return;
        } else {
            int[] tempArr = Arrays.copyOf(arr, arr.length +5 );
            tempArr[tempArr.length -1] = Integer.parseInt(temp);
            arr = tempArr;
            recForAdd();
        }
        return;
    }

    int i = 0;
    StringBuilder stringBuilder = new StringBuilder();

    public void outArr(){

        if (i < arr.length){
            stringBuilder.append(arr[i]);
            stringBuilder.append(" ");
            i++;
            outArr();
        } else {
            System.out.println(stringBuilder.toString());

            return;
        }
    }
}

