public class example17_02 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20-i ; j++) {
                System.out.print('=');
            }
            System.out.println();
        }
    }
}
