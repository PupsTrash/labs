import java.util.Arrays;


public class example17_03 {
    public static int min(int ... v){
        return Arrays.stream(v).min().getAsInt();
    }
    public static int max(int ... v) {
        return Arrays.stream(v).max().getAsInt();
    }

    public static double avr(int ... v) {
        return Arrays.stream(v).average().getAsDouble();
    }
}
