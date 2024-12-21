import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListStack<T> implements Stack<T> {

    private List<T> stack;

    public ListStack() {
        stack = new ArrayList<>();
    }

    @Override
    public boolean empty() {
        return stack.isEmpty();
    }

    @Override
    public T peek() {
        if (empty()) {
            throw new EmptyStackException("Stack is empty.");
        }
        return stack.get(stack.size() - 1);
    }

    @Override
    public T pop() {
        if (empty()) {
            throw new EmptyStackException("Stack is empty.");
        }
        return stack.remove(stack.size() - 1);
    }

    @Override
    public T push(T item) {
        stack.add(item);
        return item;
    }

    @Override
    public int search(Object o) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (Objects.equals(stack.get(i), o)) { // Use Objects.equals for null-safety
                return stack.size() - 1 - i;
            }
        }
        return -1;
    }

}