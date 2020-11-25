import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class example17_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer n1 = Integer.parseInt(bufferedReader.readLine());


        int res = 0;
        //1st solution
        /*
        for (int i = 0; i < n1; i++) {
            if ((i % 5 == 2) || (i % 3 == 1)){
                res =+ i;
            }
        }
        */

        //2nd solution
        int i = 0;
        while (i < n1) {
            if ((i % 5 == 2) || (i % 3 == 1)) {
                res =+ i;
            }
            i++;
        } //end 2nd solution


        System.out.println(res);
    }
}
