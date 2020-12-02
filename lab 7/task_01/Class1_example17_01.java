package task_01;

public class Class1_example17_01 {
    private String s;

    public Class1_example17_01(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return (getClass().getSimpleName() + " string field = " + this.s);
    }
}
