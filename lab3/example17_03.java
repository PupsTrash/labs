import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(bufferedReader.readLine());

        int[] mass = new int[n];
        mass[0] = 1;
        mass[1] = 1;

        //1st solution

        for (int i = 2; i < mass.length; i++) {
            mass[i] = mass[i-1] + mass[i-2];
        }
        


        /*//2nd solution
        int i = 2;
        while ( i < mass.length){
            mass[i] = mass[i-1] + mass[i-2];
            i++;
        }
*/

        for (int j = 0; j < mass.length; j++) {
            System.out.print(mass[j] + "; ");
        }
    }
}
