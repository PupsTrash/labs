package task1;

public class Except8 {

    public static int m(){
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1"); //всегда отработает
        } }
    public static void main(String[] args) {
        System.out.println(m());
    }
}
