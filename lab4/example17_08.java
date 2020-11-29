import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;


public class example17_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите текст для шифрования");
        String inputText = bufferedReader.readLine();

        System.out.println("Введите ключ");
        int key = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Текст после преобразования :  \n"
                + crypt(inputText, key)
                + "\nВыполнить обратное преобразование? (y/n)");

        while (true) {
                switch (bufferedReader.readLine()) {
                    case ("n"):
                        System.out.println("До свидания!");
                        return;
                    case ("y"):
                        System.out.println("Текст после преобразования :  \n"
                                + encrypt(inputText, key));
                        return;
                    default:
                        System.out.println("Введите корректный ответ");
                        continue;
                }
            }
    }

    static String crypt(String sourceText, int key){
        return sourceText.chars().map((s) -> (s + key)).mapToObj(Character::toString).collect(Collectors.joining());
    }
    static String encrypt(String sourceText, int key){
        return sourceText.chars().map((s) -> (s - key)).mapToObj(Character::toString).collect(Collectors.joining());
    }
}
