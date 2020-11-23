import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        if (Integer.parseInt(bufferedReader.readLine()) % 3 == 0) {
            System.out.println("введеное число делится на 3 без остатка");
        } else {
            System.out.println("введеное число не делится на 3 без остатка");
        }
    }
}
