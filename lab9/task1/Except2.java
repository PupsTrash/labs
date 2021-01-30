package task1;

public class Except2 {

    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка"); //генерация ошибки
            //System.out.println("1");
        } catch (Exception e) {         // перехват ошибки
            System.out.println("2 "+ e ); //обработка ошибки
        }
        System.out.println("3");
    }

}
