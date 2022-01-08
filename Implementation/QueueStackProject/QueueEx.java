package Implementation.QueueStackProject;

import java.util.ArrayList;

public class QueueEx<T> {
    private final ArrayList<T> list = new ArrayList<>();
    public void add(T item) {
        list.add(item);
    }

    public T poll() {
        if(!list.isEmpty()) {
            return list.remove(0);
        } else {
            return null;
        }
    }

    public T remove(int i) {
        if(!list.isEmpty()) {
            return list.remove(i);
        } else {
            return null;
        }
    }

    public T peek() {
        if(!list.isEmpty()) {
            return list.get(0);
        } else {
            return null;
        }
    }

    public int size(){
        return  list.size();
    }
    public ArrayList<T> print (){
        return list;
    }
}