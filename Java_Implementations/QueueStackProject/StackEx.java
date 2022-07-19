package Implementation.QueueStackProject;

import java.util.ArrayList;

public class StackEx<T> {
    private final ArrayList<T> list = new ArrayList<>();

//    @Override
    public void push(T item) {
        list.add(item);
    }

//    @Override
    public T pop() {
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        } else {
            return null;
        }
    }

    public T peek() {
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        } else {
            return null;
        }
    }

    public int search(T item){
        if (!list.isEmpty()) {
            return (list.size() - list.indexOf(item));
        }else {
            return -1;
        }
    }
}
