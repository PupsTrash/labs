import java.util.Arrays;

public class example17_09 {
    static void changer(char[] chars){
        char tempCh;
        for (int i = 0; i < chars.length/2; i++) {
            int a = chars.length-i-1;
            tempCh = chars[i];
            chars[i] = chars[a];
            chars[a] = tempCh;
        }
    }

    public static void main(String[] args) {
        char[] c = {'a', 'b', 'c'};
        changer(c);
        System.out.println(Arrays.toString(c));
    }
}
