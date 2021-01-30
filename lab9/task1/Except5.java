package task1;

public class Except5 {

    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) { //не сработает, т.к. не совпадают классы ошибок, программа после запуска упадет с ошибкой
            System.out.println("1" );
        }
        System.out.println("2");
    }
}
