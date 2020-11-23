import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double numb = Double.parseDouble(bufferedReader.readLine());

        if (numb > 7){
            System.out.println("2-ая цифра справа, в 8-миричной записи числа " + numb
                    + " является:    "
                    + (Math.floor(numb / 8) % 8));
        }
        else {
            System.out.println("2-ая цифра справа, в 8-миричной записи числа " + numb
                    + " является:     0");
        }
    }
}