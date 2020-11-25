import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class example17_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[Integer.parseInt(bufferedReader.readLine())];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
            System.out.print(arr[i] + "; ");
        }
        System.out.println();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
                if (arr[0] == arr[i]){
                    System.out.println("min: " + arr[i] + " ind = " + i);
            }
        }
    }
}
