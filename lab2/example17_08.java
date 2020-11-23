import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double numb = Double.parseDouble(bufferedReader.readLine());

        if ((numb % 4.0 == 0) && (numb >= 10.0 )){
            System.out.println(numb + " удволетворяет условию");
        }else {
            System.out.println(numb + " не удволетворяет условию");
        }
    }
}

