package task2.example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class withoutMyTryCatch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Byte> list = new ArrayList<>();

        String s;
        while (!(s = bufferedReader.readLine()).equals("esc"))
        {
            list.add(Byte.parseByte(s));
            System.out.println(list.toString());
        }
        byte temp = 0;
        for (byte a: list) {
            temp += a;
        }

        System.out.println(temp);
    }
}
