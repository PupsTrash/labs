import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double numb = Double.parseDouble(bufferedReader.readLine());

        if ((numb % 5.0 ==2) && (numb % 7.0 == 1)){
            System.out.println(numb + " удволетворяет условию");
        }else {
            System.out.println(numb + " не удволетворяет условию");
        }
    }
}
