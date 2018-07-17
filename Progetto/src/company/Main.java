package company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ElemIniziali = new ArrayList<>();
        ArrayList<Integer> ElemFinali = new ArrayList<>();
        for(int i = 0; i < 5 ; i ++ ){
            ElemIniziali.add(i);
            ElemFinali.add(i);
        }
        NodeListInterface<Integer> lista = new NodeList<Integer>();
        lista.insertHead(0);
        lista.insertTail(2);
        lista.insertInside(1,1);
        //lista.printList();
        //System.out.println("\n");

        lista.insertAllInside(ElemIniziali,0);
        //lista.printList();
        //System.out.println("\n");

        lista.insertAllEnd(ElemFinali);
        //lista.printList();
        //System.out.println("\n");

        lista.insertAllStart(ElemIniziali);
        //lista.printList();
        //System.out.println("\n");

        lista.removeInside(3);
        //lista.printList();
        //System.out.println("\n");

        lista.setAllInside(2,4,1);
        //lista.printList();
        //System.out.println("\n");

        lista.printList();

        lista.sort();

        //System.out.println(lista.getSize());
        //lista.insertHead(2);
        //lista.printList();
        //System.out.println(lista.getSize());
    }
}
