public class example17_04 {
    char ch;
    int i;

    public void setAllField(double d) {
        this.ch = (char) Integer.parseInt(Double.toString(d).substring(0,Double.toString(d).indexOf('.')));
        this.i = Integer.parseInt(Double.toString(d).substring(Double.toString(d).indexOf('.')+1, Double.toString(d).indexOf('.')+3));
    }

    public void setAllField(char ch, int i) {
        this.ch = ch;
        this.i = i;
    }
}
