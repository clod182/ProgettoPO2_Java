package company;

import java.util.ArrayList;

public interface NodeListInterface <T> {
    //insert
    public void insertHead(T elem);
    public void insertTail(T elem);
    public void insertInside (T elem,int index);
    public void insertAllStart (NodeListInterface<T> lista);
    public void insertAllEnd (NodeListInterface<T> lista);
    public void insertAllInside (NodeListInterface<T> lista,int index);
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
    public int findIndex (T elem);
    public boolean find (T elem);
    public void printList();
}
