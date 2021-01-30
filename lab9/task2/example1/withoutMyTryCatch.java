package task2.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class withoutMyTryCatch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numb = new ArrayList<>();

        String s;
        while (!(s = bufferedReader.readLine()).equals("esc"))
        {
            numb.add(Integer.parseInt(s));
            System.out.println(numb.toString());
        }


    }
}
