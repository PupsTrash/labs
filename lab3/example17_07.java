import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer n1 = Integer.parseInt(bufferedReader.readLine());

        char[] arr = new char[n1];

        arr[0] = 97;
        System.out.print(arr[0] + "; ");
        for (int i = 1; i < arr.length; i++) {
            arr[i] = (char) (arr[i-1]+2);
            System.out.print(arr[i] + "; ");
        }
        System.out.println();
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print( arr[i] + "; ");
        }
    }
}
