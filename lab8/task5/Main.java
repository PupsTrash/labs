package task5;
import task4.Node;

public class Main {
    public static void main(String[] args) {
        //с головы
        Node head=null; // начальное значение ссылки на голову
        for (int i =9; i>=0; i--) {
            head = new Node(i, head);
        }
// вывод элементов на экран
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }


// добавление в хвост
// создается новый элемент со значением 123 – будущий хвост
        Node newtail = new Node(123, null);
// для перемещения по списку используется вспомогательная переменная ref,
// которой в качестве начальной ссылки передается указатель на «голову»
        ref = head;
        while (ref.next != null) { // пока не последний элемент
            //System.out.println(ref.value);
            ref = ref.next;
        }
// указателю последнего элемента присваиваем новый «хвост» (элемент)
        ref.next=newtail;


        // создается новый элемент со значением 44 – для вставки
        Node newNode = new Node(44, null);
        ref = head; // используем временную переменную
        int k = 1; // счетчик элементов
// поиск нужного положения узла для вставки
        while (ref.next!= null && (k<2 )) {
            ref = ref.next;
            k++;
        }
// переброска ссылок при вставке элемента
        newNode.next = ref.next.next;
        ref.next = newNode;
        head = head.next;



        // создаем вспомогательную переменную
                ref = head;
// перемещаемся на предпоследний элемент
        while (ref.next.next != null) {
            ref = ref.next;
        }
// полю next предпоследнего элемента присваиваем null
        ref.next = null;
        ref = head; // создаем вспомогательную переменную
        k=1;
// поиск положения узла, предшествующего удаляемому
        while (ref.next != null && (k < 2)) {
            ref = ref.next;
            k++;
        }
// переброска ссылки для исключения ненужного элемента из списка

    }
}
