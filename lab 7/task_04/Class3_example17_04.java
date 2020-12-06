package task_04;

public class Class3_example17_04 extends Class2_example17_04 {
    public int intClass3;


    public Class3_example17_04(char charClass1, String stringClass2) {
        super(charClass1, stringClass2);
    }

    public Class3_example17_04(char charClass1, String stringClass2, int intClass3) {
        super(charClass1, stringClass2);
        this.intClass3 = intClass3;
    }

    public Class3_example17_04(Class3_example17_04 p){
        super(p.charClass1, p.stringClass2);
        this.intClass3 = p.intClass3;
    }
}
