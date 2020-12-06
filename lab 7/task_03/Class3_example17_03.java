package task_03;

public class Class3_example17_03 extends Class2_example17_03 {
    public String stringClass3;

    public Class3_example17_03(int intClass1, char charClass2, String stringClass3) {
        super(intClass1, charClass2);
        setStringClass3(stringClass3);
    }

    public void setStringClass3(String stringClass3) {
        this.stringClass3 = stringClass3;
    }

    @Override
    public String toString() {
        return "Class3_example17_03{" +
                "stringClass3=" + stringClass3 +
                '}' + "\n" + super.toString();
    }
}
