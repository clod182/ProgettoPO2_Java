package company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        NodeListInterface<Integer> lista = new NodeList<Integer>();
        lista.insertHead(0);
        lista.insertTail(2);
        lista.insertInside(1,1);
        lista.printList();
    }
}
