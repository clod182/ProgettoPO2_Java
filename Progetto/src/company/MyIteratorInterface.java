package company;

public interface MyIteratorInterface <T> {
    boolean hasNext();
    Node<T> next() throws IndexOutException;
}
