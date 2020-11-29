public class example17_04 {
    public static void main(String[] args) {
        Integer[][] arr = new Integer[5][10];

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                System.out.printf("=");
            }
            System.out.println();
        }

    }
}
