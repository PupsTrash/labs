
public class example17_01 {
    char ch;
    String s;

    public void set(char ch) {
        this.ch = ch;
    }
    public void set(char[] ch) {
        if (ch.length == 1){
            this.ch = ch[0];
        }
        else if (ch.length > 1){
            this.s = String.copyValueOf(ch);
        }
    }

    public void set(String s) {
        this.s = s;
    }
}
