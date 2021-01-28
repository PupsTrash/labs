package task3;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        AddArrRec test = new AddArrRec();
        System.out.println("введите число и нажмите Enter, для завершения ввода нажмите Enter с пустым полем");
        test.recForAdd();

        test.outArr();
    }
}
