package company;

import java.util.ArrayList;

public interface NodeListInterface <T> {
    //MANCANO ECCEZIONI
    //insert
    public void insertHead(T elem);
    public void insertTail(T elem);
    public void insertInside (T elem,int index);
    public void insertAllStart (ArrayList<T> lista);
    public void insertAllEnd (ArrayList<T> lista);
    public void insertAllInside (ArrayList<T> lista,int index);
    //remove
    public void removeHead();
    public void removeTail();
    public void removeInside (int index);
    public void removeAllStart (int n);
    public void removeAllEnd (int n);
    public void removeAllInside (int start, int end);
    //getter
    public int getSize();
    public Node<T> getHead();
    public Node<T> getTail();
    public Node<T> getInside(int index);
    public NodeListInterface<T> getAllStart (int n);
    public NodeListInterface<T> getAllEnd (int n);
    public NodeListInterface<T> getAllInside (int start, int end);
    //setter
    public void setHead(T elem);
    public void setTail(T elem);
    public void setInside(int index, T elem);
    public void setAllStart (int n, T elem);
    public void setAllEnd (int n, T elem);
    public void setAllInside (int start, int end, T elem);
    public boolean IsFind (T elem);
    public int pos (T elem);
    public void printList();
    public void printArray(int array[]);
    //ORDINAMENTO
    public void sort();
    public void quickSort(int array[], int left, int right);
    public int partition(int arr[], int left, int right);
}
