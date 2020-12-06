package task_05;

public class MainExample17_05 {
    public static void main(String[] args) {
        Class1_example17_05 testClass1 = new Class1_example17_05("testClass1");
        testClass1.showVar();

        Class2_example17_05 testClass2 = new Class2_example17_05("testClass2", 2);
        testClass2.showVar();

        Class3_example17_05 testClass3 = new Class3_example17_05("testClass3", 'b');
        testClass3.showVar();

        System.out.println("вызов метода через объектную переменную суперкласса на объект подкласса \"testClass2\"");
        Class1_example17_05 objA;
        objA = testClass2;
        objA.showVar();
    }
}
