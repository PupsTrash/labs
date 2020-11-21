public class example17_19 {
    static double a =10.0, b=4.0, c;
    public static double hyp(){
        return c = Math.sqrt(a*a + b*b);
    }
    public static double hyp(double a, double b){
        return c = Math.sqrt(a*a + b*b);
    }

    public static double aB(){
        return Math.exp(b*Math.log(a));}


    public static void main(String[] args) {
        System.out.println("katet а=" + a);
        System.out.println("katet b=" + b);
        System.out.println("hypotenuse с=" + hyp());
        System.out.println("a^b=" + aB());
        System.out.println("hypotenuse2 с=" + hyp(5.0, 8.0));
    }

}
