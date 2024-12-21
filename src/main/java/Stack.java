public interface Stack<T> {
    boolean empty();
    T peek();
    T pop();
    T push(T item);
    int search(Object o);
}