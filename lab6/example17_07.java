import java.util.Arrays;

public class example17_07 {
    static int[] charToInt(char[] chars){
        int[] out = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            out[i] = chars[i];
        }
       return out;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(charToInt(new char[] {'a', 'b', 'c'})));
    }
}
