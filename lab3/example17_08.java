import java.util.Arrays;


public class example17_08 {
    public static void main(String[] args) {
       /*
       //1st solution
        char[] arr = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M'};
        for (char a:arr) {
            System.out.print(a + "; ");
        }
        */
        //2nd solution
        char[] arr = new char[10];
        String exc = "EYUIOA";
        int s = 0;
        for (int i = 0; s < arr.length; i++) {

            if ((isVowels('A'+i, exc)) == false){
                arr[s] = (char) (i+'A');
                s++;
            }
        }


        System.out.println(Arrays.toString(arr));
    }

    static boolean isVowels (int ad, String excWord){
        return excWord.contains(Character.toString(ad));
    }
}
