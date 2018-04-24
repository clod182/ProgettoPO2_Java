package company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        NodeListInterface<Integer> lista = new NodeList<Integer>();
        NodeListInterface<Integer> ris = new NodeList<>();
        NodeListInterface<Integer> elementiDaAggiungere = new NodeList<>();

        lista.insertHead(0);
        lista.insertTail(2);
        lista.insertInside(1,1);
        System.out.println("INSERT");
        System.out.println("Expected: 0 - 1 - 2");
        System.out.print("Print: ");
        lista.printList();
        lista.removeHead();
        lista.removeInside(1);
        System.out.println("REMOVE");
        System.out.println("Expected: 1");
        System.out.print("Print: ");
        lista.printList();
        lista.insertHead(0);
        lista.insertHead(2);
        System.out.println("GET ALL START");
        System.out.println("Expected: 2 - 0 - 1");
        System.out.print("Print: ");
        ris = lista.getAllStart(2);
        ris.printList();
        /*for(int i = 0; i < 10; i ++){
            elementiDaAggiungere.insertHead(0);
        }
        elementiDaAggiungere.printList();
        lista.insertAllInside(elementiDaAggiungere,0);
        System.out.println("INSERT ALL START");
        System.out.println("Expected: dieci zeri - 2 - 0 - 1");
        System.out.print("Print: ");
        lista.printList();*/
    }
}
