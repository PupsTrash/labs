package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DecToBinRec {
    static StringBuilder stringBuilder = new StringBuilder();

    public static String conv(int i) {
        if (i / 2 >= 1) {
            stringBuilder.append(i % 2);
            conv(i / 2);
        } else {
            stringBuilder.append(i % 2);
            stringBuilder.reverse();
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(conv(Integer.parseInt(bufferedReader.readLine())));
    }
}
