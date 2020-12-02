package task_01;

public class Class2_example17_01 extends Class1_example17_01{
    public Class2_example17_01(String s) {
        super(s);
    }

    private String s;

    public Class2_example17_01(String s1, String s2) {
        super(s1);
        this.s = s2;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n" + getClass().getSimpleName() + " string field = " + this.s;
    }
}
