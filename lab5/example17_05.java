public class example17_05 {
    private int a;

    public example17_05() {
        setA();
    }
    public example17_05(int a) {
        setA(a);
    }

    public void setA() {
        setA(0);
    }

    public void setA(int a) {
        this.a = Math.min(a, 100);
    }

    public int getA() {
        return a;
    }
}
