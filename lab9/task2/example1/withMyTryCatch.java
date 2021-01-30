package task2.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class withMyTryCatch {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numb = new ArrayList<>();

        String s;

        try {
            while (!(s = bufferedReader.readLine()).equals("esc")) {
                try {
                    numb.add(Integer.parseInt(s));
                    System.out.println(numb.toString());
                }catch (NumberFormatException numberFormatException){
                    System.out.println("неверный тип данных или ты не ввел ничего, попробуй ввести еще раз");
                    continue;
                }

            }
        } catch (IOException ioException){
            ioException.printStackTrace();
        }


        try {
            System.out.println("test = " + numb.stream().mapToInt(Integer::intValue)
                    .filter((q) -> q > 0).average().getAsDouble());
        } catch (NoSuchElementException e){
            System.out.println("!!!!!!dlksfjls;a@@@@");
            e.printStackTrace();
        }

    }
}
