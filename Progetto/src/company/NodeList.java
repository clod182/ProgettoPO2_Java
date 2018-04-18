package company;

import java.util.ArrayList;

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
    public void insertHead(T elem){}
    //inserisce coda
    public void insertTail(T elem){}
    //inserisce in un indice
    public void insertInside (T elem,int index){}
    //inserisce tutti gli elementi passati all'inizio
    public void insertAllStart (ArrayList<T> lista){ }
    //inserisce tutti gli elementi passati alla fine
    public void insertAllEnd (ArrayList<T> lista){ }
    //inserisce tutti gli elementi passati dall'indice spostando i successivi
    public void insertAllInside (ArrayList<T> lista,int index){}

    //REMOVE

    //rimuove testa
    public void removeHead(){}
    //rimuove coda
    public void removeTail(){}
    //rimuove in un indice
    public void removeInside (int index){}
    //rimuove tutti i primi n elementi
    public void removeAllStart (int n){ }
    //rimuove tutti gli ultimi n elementi
    public void removeAllEnd (int n){ }
    //rimuove tutti gli elementi tra i due indici compresi
    public void removeAllInside (int start, int end){}


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
        return getInside(getSize()-1); //o getSize() ?
    }
    //ritorna l'elemento specificato dall'indice
    public Node<T> getInside(int index){

    }
    //restituisce tutti i primi n valori
    public ArrayList<T> getAllStart (int n){

    }
    //restituisce tutti gli n ultimi valori
    public ArrayList<T> getAllEnd (int n) {

    }
    //restituisce tutti i valori tra i due indici
    public ArrayList<T> getAllInside (int start, int end){

    }


    //SETTER

    //modifica la testa
    public void setHead(T elem){

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
}
