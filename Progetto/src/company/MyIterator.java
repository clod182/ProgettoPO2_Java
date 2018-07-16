package company;

public class MyIterator <T> implements MyIteratorInterface <T> {
    private int pos = 0;
    private NodeList<T> nodo;

    MyIterator(NodeList<T> nodo) {
        this.nodo = nodo;
    }

    //ritorna true se esiste un elemento successivo, false altrimenti
    public boolean hasNext() {
        return (pos < nodo.getSize()) ? true : false;
    }

    //ritorna l'elemento, se non viene lanciata l'eccezione
    public Node<T> next() throws IndexOutException{
        try {
            return nodo.getInside(pos++);
        } catch (IndexOutException exception) {
            throw new RuntimeException("MyIterator.next() ha fallito");
        }
    }
}
