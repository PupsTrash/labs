package task_05;

public class Class2_example17_05 extends Class1_example17_05{
    private int intClass2;

    public Class2_example17_05(String stringClass1, int intClass2) {
        super(stringClass1);
        this.intClass2 = intClass2;
    }

    @Override
    public void showVar() {
        super.showVar();
        System.out.println(getClass().getSimpleName() +
                " intClass2 = " +
                intClass2);
    }
}
