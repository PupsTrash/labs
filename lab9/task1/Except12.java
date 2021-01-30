package task1;

public class Except12 {

    public static void m(String str, double chislo){
        if (str==null) {
            throw new IllegalArgumentException("Строка введена неверно"); //код упадет на этом месте
        }
        if (chislo>0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }
    public static void main(String[] args) {
        m(null,0.0000001);
    }

}
