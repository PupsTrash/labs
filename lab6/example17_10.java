import java.util.Arrays;


public class example17_10 {
    static int[] minMax(int ... v){
        return new int[] {Arrays.stream(v).max().getAsInt(), Arrays.stream(v).min().getAsInt()};
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(1,2,10,-20,5000)));
    }
}
