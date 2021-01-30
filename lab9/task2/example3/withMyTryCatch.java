package task2.example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class withMyTryCatch {
        public static void main (String[]args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            List<Byte> list = new ArrayList<>();

            String s;
            try {
                while (!(s = bufferedReader.readLine()).equals("esc")) {
                    list.add(Byte.parseByte(s));
                    System.out.println(list.toString());
                }
            }catch (IOException | NumberFormatException exception){
                System.out.println("ooops");
            }

            try {
                if (-128 < list.stream().mapToInt(Byte::intValue).sum() || list.stream().mapToInt(Byte::intValue).sum() > 127){
                    throw new IndexOutOfBoundsException();
                }
            }catch (IndexOutOfBoundsException indexOutOfBoundsException){
                System.out.println("переполнение типа");
            }
            finally {
                System.out.println(list.stream().mapToInt(Byte::intValue).sum());
            }


        }

}
