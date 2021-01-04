import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_01 {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            switch (bufferedReader.readLine()){
                case ("1"):
                    System.out.println("понедельник");
                    break;
                case ("2"):
                    System.out.println("вторник");
                    break;
                case ("3"):
                    System.out.println("среда");
                    break;
                case ("4"):
                    System.out.println("четверг");
                    break;
                case ("5"):
                    System.out.println("пятница");
                    break;
                case ("6"):
                    System.out.println("суббота");
                    break;
                case ("7"):
                    System.out.println("воскресенье");
                    break;
                default:
                    System.out.println("такого дня нет");
                    break;
            }
        }
    }
