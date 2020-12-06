package task_05;

public class Class1_example17_05 {
    private String stringClass1;

    public Class1_example17_05(String stringClass1) {
        this.stringClass1 = stringClass1;
    }

    public void showVar() {
        System.out.println(getClass().getSimpleName() +
                " stringClass1 = " +
                stringClass1);
    }
}
