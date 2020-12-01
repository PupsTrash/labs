public class example17_04 {
    static int fact2x (int a){
        int i;
        int res = a;
        if (a%2 == 0){
            i = 2;
        }else {
            i = 1;
        }
        for (int j = a -2; j >= i;) {
            res = res * j;
            j -= 2;
        }
        return res;
    }

    static int fact2xRecur(int a){
        if ((a == 1)||(a == 2)){
            return a;
        }else {
            int res = a*fact2xRecur(a-2);
            return res;
        }
    }


    public static void main(String[] args) {
        System.out.println(fact2x(15));
        System.out.println(fact2xRecur(15));
    }
}
