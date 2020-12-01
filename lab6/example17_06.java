import java.lang.reflect.Array;
import java.util.Arrays;

public class example17_06 {
    static int[] newmass (int[] sourceMass, int i){
        if (i < sourceMass.length){
            return Arrays.copyOfRange(sourceMass, 0, i);
        }else {
            return sourceMass.clone();
        }
    }

    public static void main(String[] args) {
        Arrays.stream(newmass(new int[]{1, 2, 3, 4, 5}, 10)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(newmass(new int[]{1, 2, 3, 4, 5}, 1)).forEach(System.out::print);
    }
}
