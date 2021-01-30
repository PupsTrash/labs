package task1;

public class Except3 {

    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка"); //генерация ошибки
        } catch (NullPointerException e) { // перехват NPE
            System.out.println("1" );
        }catch (RuntimeException e) { // перехват ранее сгенерированной ошибки
            System.out.println("2" ); // обрабока ошибки
        }catch (Exception e) {      //перехват любого Exception, кроме NPE и последующая ее обработка
            System.out.println("3" );
        }
        System.out.println("4");
    }

}
