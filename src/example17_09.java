import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_09 {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("имя и возраст: " + bufferedReader.readLine() + " " + bufferedReader.readLine());

        }
    }


