package company;

import java.util.ArrayList;


//lista, nodi sono definiti nella classe Node
public class NodeList <T> implements NodeListInterface <T>{

    private Node<T> node;
    private int size; //aggiorno size ogni volta che inserisco un elemento

    //COSTRUTTORE
    public NodeList(){
        node = null;
        size = 0;
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
    //inserisce in un indice
    public void insertInside (T elem,int index){
        int count = 0;
        Node prev = null;
        while(count != index){
            count++;
            prev = node;
            node = node.getNext();
        }

        Node<T> newNode = new Node<T>(elem,node);
        newNode.setElem(elem);

        newNode.setNext(node);
        if(count == 0){
            node = newNode;
        }else {
            prev.setNext(newNode);
        }
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
            insertHead(lista.get(i));
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
        node.setElem(elem);
    }
    //modifica la coda
    public void setTail(T elem){

    }
    //modifica l'elemento specificato dall'indice
    public void setInside(int index, T elem){

    }
    //modifica tutti i primi n valori con lo stesso valore elem
    public void setAllStart (int n, T elem){

    }
    //modifica tutti gli n ultimi valori con lo stesso valore elem
    public void setAllEnd (int n, T elem) {

    }
    //modifica tutti i valori tra i due indici con lo stesso valore elem
    public void setAllInside (int start, int end, T elem){

    }



    public /*boolean/int*/ find (T elem){

    }

    /*vedere perchè non stampa*/
    public void printList (){
        Node<T> n = node;
        for(int i = 0; i < size; i ++){
            System.out.println(n.getElem());
            n = n.getNext();
        }
    }


    //ORDINAMENTO
}
