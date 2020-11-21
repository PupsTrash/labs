import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_16 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(bufferedReader.readLine());
        System.out.println(d - 1.0);
        System.out.println(d);
        System.out.println(d + 1.0);
        System.out.println(Math.pow((d-1.0+d+d+1.0), 2.0));
    }
}



