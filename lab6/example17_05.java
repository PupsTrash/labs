public class example17_05 {
    static int sum2(int a){
        int res = 0;

        for (int j = 0 ; j <= a; j++) {
            res = res + j^2;
        }
        return res;
    }

    static int sum2Recur(int a){
        if (a == 1){
            return a;
        }else {
            int res = a + sum2Recur(a-1)^2;
            return res;
        }
    }


    public static void main(String[] args) {
        System.out.println(sum2(6));
        System.out.println(sum2Recur(6));
    }
}
