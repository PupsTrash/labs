import java.util.Arrays;

public class example17_08 {
    static double avrMass (int[] mass){
        return Arrays.stream(mass).average().getAsDouble();
    }

    public static void main(String[] args) {
        System.out.println(avrMass(new int[] {1,5,10}));
    }
}
