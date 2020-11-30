public class example17_01 {
    private char ch;

    public void setCh(char ch) {
        this.ch = ch;
    }

    public int getChCode() {
        return ch;
    }

    public void outInfo() {
        System.out.println("char = " + ch
                + "\ncode char = " + (int) ch);
    }
}
