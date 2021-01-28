package task6;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        NodeList list = new NodeList();

        try {
            list.createTailRec();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.out.println(list.toString());
        }
        System.out.println(list.toString());

        list.removeLast();
        System.out.println("remove last: " + list.toString());

        list.removeFirst();
        System.out.println("remove first: " + list.toString());
    }
}
