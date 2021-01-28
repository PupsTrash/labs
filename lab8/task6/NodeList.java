package task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NodeList {
    private NodeItem head;
    private NodeItem tail;


    public boolean isEmpty(){
        return head == null;
    }

    public void addLast(int data) {
        NodeItem newItem = new NodeItem();
        newItem.dataInNode = data;
        newItem.nextNodeItem = null;
        //newItem.nextNodeItem = null;
        if (isEmpty()){
            head = newItem;
            tail = newItem;
        } else {
            tail.nextNodeItem = newItem;
            tail = newItem;
        }
    }

    public void addFirst(int data){
        NodeItem newItem = new NodeItem();
        newItem.dataInNode = data;

        if (isEmpty()){
            head = newItem;
            tail = newItem;
        } else {
            newItem.nextNodeItem = head;
            head = newItem;
        }
    }

    public void removeFirst(){
        if (!isEmpty()){
            head = head.nextNodeItem;
        }
    }
    public void removeLast(){
        if (!isEmpty()){
            NodeItem tempItem = this.head;
            int count = 0;
            while (tempItem != null){
                if (count == size()-2){
                    tempItem.nextNodeItem = null;
                    this.tail = tempItem;
                    return;
                } else if (size() == 1){ removeFirst();}
                count++;
                tempItem = tempItem.nextNodeItem;
            }
        }
    }

    public void remove(int place){
        if (place == 0) {
            removeFirst();
        } else if (place == size()) {
            removeLast();
        } else if (place < 0 || place > size()) {
            System.out.println("invalid place, abort");
            return;

        } else {
            NodeItem tempItem2;
            NodeItem tempItem = head;

            for (int i = 0; i <= place; i++) {
                if (i == place-1) {
                    tempItem2 = tempItem.nextNodeItem;
                    tempItem.nextNodeItem = tempItem2.nextNodeItem;
                    return;
                } else {
                    tempItem = tempItem.nextNodeItem;
                }
            }
        }
    }

    public void insert(int place, int data) {
        if (place == 0) {
            addFirst(data);
        } else if (place == size()) {
            addLast(data);
        } else if (place < 0 || place > size()) {
            System.out.println("invalid place, abort");
            return;

        } else {
            NodeItem newItem = new NodeItem();
            newItem.dataInNode = data;
            NodeItem tempItem = head;

            for (int i = 1; i <= place; i++) {
                if (i == place) {
                    newItem.nextNodeItem = tempItem.nextNodeItem;
                    tempItem.nextNodeItem = newItem;
                    return;
                } else {
                    tempItem = tempItem.nextNodeItem;
                }
            }
        }
    }

    @Override
    public String toString() {
        if (isEmpty()){
            return "is Empty";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            NodeItem tempItem = this.head;
            while (tempItem != null){
                stringBuilder.append(tempItem.dataInNode);
                stringBuilder.append("; ");
                tempItem = tempItem.nextNodeItem;

            }
            return stringBuilder.toString();
        }
    }
    private StringBuilder stringBuilder = new StringBuilder();
    private NodeItem headRec;
    private String string;
    public String toStringRec() {

        if (stringBuilder.toString().isEmpty()){headRec = this.head;}
            NodeItem tempItem = headRec;
            if (tempItem != null){
                stringBuilder.append(tempItem.dataInNode);
                stringBuilder.append("; ");

                headRec = tempItem.nextNodeItem;
                toStringRec();

        }else {string = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                return string;}
        return string;

    }

    public int size(){
        NodeItem tempItem = this.head;
        int count = 0;
        while (tempItem != null){
            count++;
            tempItem = tempItem.nextNodeItem;
        }
        return count;
    }

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public void createHead() throws IOException, NumberFormatException {

         String s;
        while (!(s=bufferedReader.readLine()).isEmpty()){
            addFirst(Integer.parseInt(s));
        }
        System.out.println(toString());
    }

    public void createTail() throws IOException, NumberFormatException {
        String s;
        while (!(s=bufferedReader.readLine()).isEmpty()){
            addLast(Integer.parseInt(s));
        }
    }

    public void createHeadRec() throws IOException, NumberFormatException {
        String s = bufferedReader.readLine();
        if (s.isEmpty()){
            return;
        }else {
            addFirst(Integer.parseInt(s));
            createHeadRec();
        }
    }

    public void createTailRec() throws IOException, NumberFormatException {
        String s = bufferedReader.readLine();
        if (s.isEmpty()){
            return;
        }else {
            addLast(Integer.parseInt(s));
            createTailRec();
        }
    }








}