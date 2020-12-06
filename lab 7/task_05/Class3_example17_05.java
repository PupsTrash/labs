package task_05;

public class Class3_example17_05 extends Class1_example17_05{
    private char charClass3;

    public Class3_example17_05(String stringClass1, char charClass3) {
        super(stringClass1);
        this.charClass3 = charClass3;
    }

    @Override
    public void showVar() {
        super.showVar();
        System.out.println(getClass().getSimpleName() +
                " charClass3 = " +
                charClass3);
    }
}
