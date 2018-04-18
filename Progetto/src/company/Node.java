package company;

/*OGGETTO NODE*/

public class Node <T> {
    private T elem;
    private Node <T> next;

    //costruttore

    public Node (T elem, Node<T> next){
        this.elem = elem;
        this.next = next;
    }

    //metodi d'accesso

    //getter
    public Node<T> getNext() {
        return next;
    }

    public T getElem() {
        return elem;
    }

    //setter
    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }
}
