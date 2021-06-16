import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class example10_task3 {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream("F:\\1fileTask3.txt"), "cp1251"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                "F:\\2fileTask3.txt", true));

        Integer countString = 1;
        String[] sogl = {"б", "в", "г", "д", "ж", "з", "й", "к", "л", "м", "н", "п", "р", "с", "т", "ф", "х", "ц", "ч", "ш", "щ"};

        while (true) {
            String s = bufferedReader.readLine();
            if (s == null) {
                bufferedWriter.close();
                return;
            }
            List<String> stringList = Arrays.stream(
                    s.split(" "))
                    .filter(a -> {
                        final char c = a.toLowerCase().charAt(0);
                        return Arrays.stream(sogl).anyMatch(v -> v.charAt(0) == c);
                    })
                    .collect(Collectors.toList());

            bufferedWriter.write(countString.toString());
            bufferedWriter.write(" ");
            for (int i = 0; i < stringList.size(); i++) {
            bufferedWriter.write(stringList.get(i).toString());
            bufferedWriter.write(" ");
            }
            bufferedWriter.write("count=");
            bufferedWriter.write(stringList.size());
            bufferedWriter.newLine();


            countString++;
        }

    }
}
