import java.io.*;
import java.util.regex.Pattern;

public class example10_task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream("F:\\1fileTask2.txt"), "cp1251"));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                "F:\\2fileTask2.txt", true));
        int countString = 0;

        while (true) {
            String s = bufferedReader.readLine();
            if (s == null) {
                bufferedWriter.close();
                return;
            }


            if (isNumeric(s)) {
                if (Double.parseDouble(s) > 0) {
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                    continue;
                }
                continue;
            }
            if (countString == 1) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                continue;
            }
            countString++;
        }

    }


    public static boolean isNumeric(String strNum) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}
