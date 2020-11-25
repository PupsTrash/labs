import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        switch (bufferedReader.readLine()){
            case ("понедельник"):
                System.out.println("1");
                break;
            case ("вторник"):
                System.out.println("2");
                break;
            case ("среда"):
                System.out.println("3");
                break;
            case ("четверг"):
                System.out.println("4");
                break;
            case ("пятница"):
                System.out.println("5");
                break;
            case ("суббота"):
                System.out.println("6");
                break;
            case ("воскресенье"):
                System.out.println("7");
                break;
            default:
                System.out.println("такого дня нет");
                break;
        }
    }
}

