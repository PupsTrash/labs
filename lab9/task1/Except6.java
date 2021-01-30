package task1;

public class Except6 {

    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1" );
        }catch (Exception e) {
            System.out.println("2" );
        } /*catch (RuntimeException e) { //никогда не достигнем этого блока, т.к. суперкласс уже обработает любое исключение  RuntimeException. Как вариант решения можно поменять их местами
            System.out.println("3" );
        }*/
        System.out.println("4");
    }
}
