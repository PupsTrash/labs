import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_17 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Double d1 = Double.parseDouble(bufferedReader.readLine());
        Double d2 = Double.parseDouble(bufferedReader.readLine());

        System.out.println("сумма: " + (d1+d2));
        System.out.println("разность: "+ (d1-d2));
    }
}



