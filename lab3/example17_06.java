import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer n1 = Integer.parseInt(bufferedReader.readLine());
        if (n1 < 1){
            System.out.println("некоректное значение");
        }else {
            int[] arr = new int[n1];

            int ind = 0;
                for (int i = 0; i < arr.length; i++) {
                if (i%5 ==2) {
                    arr[ind] = i;
                    System.out.print(arr[ind] + "; ");
                    ind++;
                    }
                }
            }
        }
}
