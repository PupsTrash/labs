import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class example11_task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream("F:\\1fileTask3.txt"), "cp1251"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                "F:\\2fileTask3.txt"));

        Integer countString = 1;
        Character sogl = null;

        while (true) {
            String s = bufferedReader.readLine();
            if (s == null) {
                bufferedWriter.close();
                return;
            }

            if (countString == 1){
                sogl = s.toLowerCase().charAt(0);
            }
            Character finalSogl = sogl;
            List<String> stringList = Arrays.stream(
                    s.split(" "))
                    .filter(a -> finalSogl.equals(a.toLowerCase().charAt(0)))
                    .collect(Collectors.toList());

            if (stringList.size() > 0) {
                bufferedWriter.write(countString.toString());
                bufferedWriter.write(" ");
                for (int i = 0; i < stringList.size(); i++) {
                    bufferedWriter.write(stringList.get(i).toString());
                    bufferedWriter.write(" ");
                }
                bufferedWriter.write("count=");
                bufferedWriter.write(Integer.toString(stringList.size()));
                bufferedWriter.newLine();
            }

            countString++;
        }

    }
}
