import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("введи название месяца");
        String month = bufferedReader.readLine();
        System.out.println("введи количество дней месяце " + month);
        String days = bufferedReader.readLine();
        System.out.println("месяц " + month + " содержит дней: " + days);
    }
}
