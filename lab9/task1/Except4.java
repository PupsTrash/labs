package task1;

public class Except4 {

    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" );
        }catch (Exception e) {
            System.out.println("2" ); //сработает только этот блок, это обусловлено характером ошибки и иерархией классов ошибки
        }catch (Error e) {
            System.out.println("3" );
        }
        System.out.println("4");
    }

}
