package task_04;

public class MainExample17_04 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Class3_example17_04 test = new Class3_example17_04('b',"check", 123 );
        Class3_example17_04 testClone = new Class3_example17_04(test);
        System.out.println(testClone.intClass3 + " " +
                testClone.charClass1 + " " +
                testClone.stringClass2);
    }
}
