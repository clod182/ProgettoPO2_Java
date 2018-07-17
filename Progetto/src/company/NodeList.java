package company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


//lista, nodi sono definiti nella classe Node
public class NodeList <T> implements NodeListInterface <T>{

    private Node<T> node;
    private int size; //aggiorno size ogni volta che inserisco un elemento
    private int[] array;

    //COSTRUTTORE
    public NodeList(){
        node = null;
        size = 0;
        array = new int[size];
    }

    //METODI


    //INSERT

    //inserisce testa
    public void insertHead(T elem){
        insertInside(elem,0);
    }
    //inserisce coda
    public void insertTail(T elem){
        insertInside(elem,size);
    }

    //ECCEZIONE:
    //inserisce in un indice
    public void insertInside (T elem,int index) {
        if (index == 0) {
            node = new Node<T>(elem, node);
        } else {
            Node<T> n = node;
            while (index-- > 1) {
                n = n.getNext();
            }
            n.setNext(new Node<T>(elem, n.getNext()));
        }
        size++;
    }

    //inserisce tutti gli elementi passati all'inizio
    public void insertAllStart (ArrayList<T> lista){
        insertAllInside(lista,0);
    }
    //inserisce tutti gli elementi passati alla fine
    public void insertAllEnd (ArrayList<T> lista){
        insertAllInside(lista,size);
    }
    //inserisce tutti gli elementi passati dall'indice spostando i successivi ( quindi inserisco i nodi e si spostano di conseguenza)
    public void insertAllInside (ArrayList<T> lista,int index){
        for(int i = 0; i < lista.size(); i ++){
            insertInside(lista.get(i),index);
            index++;
        }
    }

    //REMOVE

    //rimuove testa
    public void removeHead(){
        removeInside(0);
    }
    //rimuove coda
    public void removeTail(){
        removeInside(size);
    }
    //rimuove in un indice
    public void removeInside (int index){
        if(index == 0){
            //la nuova testa sarà la successiva
            node = node.getNext();
        }
        else{
            Node<T> n = node;
            while (index-- > 1) {
                //scorro
                n = n.getNext();
            }
            //elimino il nodo, quindi setto next (setNext()) al successivo nodo(che prendo con getNext())
            n.setNext(n.getNext().getNext());
        }
        size--;
    }
    //rimuove tutti i primi n elementi
    public void removeAllStart (int n){
        for(int i = 0; i < n; i++){
            removeHead();
        }
    }
    //rimuove tutti gli ultimi n elementi
    public void removeAllEnd (int n){
        for(int i = 0; i < n; i++){
            removeTail();
        }
    }
    //rimuove tutti gli elementi tra i due indici compresi
    public void removeAllInside (int start, int end){
        int count = 0;
        while(count < start ){
            count++;
        }
        for(int i = start; i <= end; i++){
            removeInside(i);
        }
    }


    //GETTER

    //ritorna size
    public int getSize() {
        return size;
    }
    //ritorna la testa
    public Node<T> getHead(){
        return getInside(0);
    }
    //ritorna la coda
    public Node<T> getTail(){
        return getInside(getSize());
    }
    //ritorna l'elemento specificato dall'indice
    public Node<T> getInside(int index){
        int count = 0;
        Node<T> n = node;
        while(count < index){
            count++;
            n = n.getNext();
        }
        return n;
    }
    //restituisce tutti i primi n valori
    public NodeListInterface<T> getAllStart (int n){
        NodeListInterface<T> ris = new NodeList<T>();
        Node<T> nodo = node;
        for(int i = 0; i < n; i++){
            ris.insertTail(nodo.getElem());
            nodo = nodo.getNext();
        }
        return ris;
    }
    //restituisce tutti gli n ultimi valori
    public NodeListInterface<T> getAllEnd (int n) {
        int count = 0;
        NodeListInterface<T> ris = new NodeList<T>();
        Node<T> nodo = node;
        while(count < (size - n)){
            count++;
            nodo = nodo.getNext();
        }
        for(int i = 0; i < (size - n); i++){
            ris.insertTail(nodo.getElem());
        }
        return ris;
    }
    //restituisce tutti i valori tra i due indici
    public NodeListInterface<T> getAllInside (int start, int end){
        int count = 0;
        NodeListInterface<T> ris = new NodeList<T>();
        Node<T> nodo = node;
        while(count < start ){
            count++;
            nodo = nodo.getNext();
        }
        for(int i = start; i <= end; i++){
            ris.insertTail(nodo.getElem());
        }
        return ris;
    }


    //SETTER

    //modifica la testa
    public void setHead(T elem){
        setInside(0,elem);
    }
    //modifica la coda
    public void setTail(T elem){
        setInside(size,elem);
    }
    //modifica l'elemento specificato dall'indice
    public void setInside(int index, T elem){
        getInside(index).setElem(elem);
    }
    //modifica tutti i primi n valori con lo stesso valore elem

    //ECCEZIONE: N NON PUO ESSERE MAGGIORE DI SIZE
    public void setAllStart (int n, T elem){
        for(int i = 0; i < n; i ++){
            setInside(i,elem);
        }
    }
    //modifica tutti gli n ultimi valori con lo stesso valore elem

    //ECCEZIONE: I NON PUO ESSERE MINORE DI N, N NON PUO ESSERE > DI SIZE
    public void setAllEnd (int n, T elem) {
        for(int i = n; i > 0; i ++){
            setInside(i,elem);
        }
    }
    //modifica tutti i valori tra i due indici con lo stesso valore elem

    //ECCEZIONE:
    public void setAllInside (int start, int end, T elem){
        for(int i = start; i < end; i++){
            getInside(i).setElem(elem);
        }
    }

    public boolean IsFind (T elem){
        Node n = node;
        boolean flag = false;
        for(int i = 0; i < size && flag == false; i ++){
            flag = (getInside(i).equals(elem)) ? true : false;
        }
        return flag;
    }

    public int pos (T elem){
        Node n = node;
        for(int i = 0; i < size; i ++){
            if(getInside(i).equals(elem)){
                return i;
            }
        }
        return -1;
    }
    public void printList (){
        Node<T> n = node;
        for(int i = 0; i < size -1; i ++){
            System.out.print(n.getElem());
            System.out.print(" - ");
            n = n.getNext();
        }
        System.out.print(n.getElem() + "\n");
    }

    public void printArray(int array[]){
        for(int i = 0; i < size -1; i ++){
            System.out.print(array[i]);
            System.out.print(" - ");
        }
        System.out.print(array[size-1] + "\n");
    }

    //ORDINAMENTO

    public void sort(){
        array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = (int) node.getElem(); //si puo non castare?
            node = node.getNext();
        }
        quickSort(array,0,size-1);
        printArray(array);
    }

    //quicksort
    //caso migliore : O(n log n)
    //caso peggiore: O(n^2)
    public void quickSort(int array[], int left, int right) {
        int index = partition(array, left, right);
        if (left < index - 1)
            quickSort(array, left, index - 1);
        if (index < right)
            quickSort(array, index, right);
    }

    public int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }
}
