import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example17_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer n1 = Integer.parseInt(bufferedReader.readLine());
        Integer n2 = Integer.parseInt(bufferedReader.readLine());

        //1st solution

        if (n1<n2){
            met(n1, n2);
        }else if (n2<n1){
            met(n2,n1);
        }



        // 2nd solution
        /*if (n1<n2){
            for (int i = n1; i <= n2; i++) {
                System.out.print(i + "; ");
            }
        }else if (n2<n1){
            for (int i = n2; i <= n1; i++) {
                System.out.print(i + "; ");
            }
        }

         */
    }

    private static void met(int min, int max) {
        if (min <= max){
            System.out.print(min + "; ");
            met(min+1, max);
        }
    }
}
