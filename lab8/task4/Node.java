package task4;

public class Node { // КЛАСС – СТРУКТУРА ЭЛЕМЕНТА СПИСКА
    public int value; // значение
    public Node next; // поле – ссылка (указатель) на следующий узел

    public Node(int value, Node next) { // конструктор класса
        this.value = value;
        this.next = next;
    }
}
