import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String dayOfWeek = bufferedReader.readLine();
        String month = bufferedReader.readLine();
        String date = bufferedReader.readLine();
        System.out.println("сегодня " + dayOfWeek + " " + date + " " + month );

    }
}
