package task_04;

public class Class2_example17_04 extends Class1_example17_04 {
    public String stringClass2;

    public Class2_example17_04(char charClass1) {
        super(charClass1);
    }
    public Class2_example17_04(Class2_example17_04 p) {
        super(p.charClass1);
        this.stringClass2 = p.stringClass2;
    }

    public Class2_example17_04(char charClass1, String stringClass2) {
        super(charClass1);
        this.stringClass2 = stringClass2;
    }
}
