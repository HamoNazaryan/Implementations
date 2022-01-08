package Implementation.List;

import java.util.Arrays;

public class List<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public List() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }


    public static void main(String[] args) {
        List<Integer> list = new List<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        for(int i=0; i<list.size; i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
        System.out.println(4 == list.get(4));
        System.out.println(2 == list.get(1));
        System.out.println(3 == list.get(2));


        System.out.println(list.get(6));
    }

}