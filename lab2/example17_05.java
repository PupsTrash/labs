import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        if (n.length() > 3) {
            System.out.println(n.charAt(n.length() - 4));
        } else {
            System.out.println("error");
        }
    }
}
