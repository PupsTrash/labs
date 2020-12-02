package task_02;

public class Class2_example17_02 extends Class1_example17_02 {
    public Class2_example17_02(String s) {
        super(s);
    }

    public int i;

    public Class2_example17_02(String s, int i) {
        super(s);
        this.i = i;
    }

    @Override
    public void setS(String s) {
        super.setS(s);
    }

    @Override
    public void setS() {
        super.setS();
    }

    public void setS(int i) {
        super.setS();
        this.i = i;
    }
    public void setS(String s, int i) {
        super.setS(s);
        this.i = i;
    }
}
