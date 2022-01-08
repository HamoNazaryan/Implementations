package Implementation.LinkedList;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }


    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;

        if(list.head == null){
            list.head = new_node;
        } else {
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(LinkedList list){
        Node currNode = list.head;
        System.out.print("linkedList : ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static LinkedList deleteByKey(LinkedList list,int key){
        Node currNode = list.head;
        Node prevNode = null;

        // if node what to need delete  is head node
        if(currNode != null && currNode.data == key){
            list.head = currNode.next;
            System.out.println(key + " deleted");
            return list;
        }

        // if node what to need delete is somewhere
        while(currNode != null && currNode.data != key) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        if (currNode != null){
            prevNode.next = currNode.next;
            System.out.println(key + " deleted");
        }
        if (currNode == null){
            System.out.println(key + " not found");
        }

        return list;

    }

    public static LinkedList deleteAtPosition(LinkedList list, int index){
        Node currNode = list.head;
        Node prevNode = null;

        if (index == 0 && currNode != null){
            list.head = currNode.next;
            System.out.println(index + " position element deleted");
            return list;
        }

        int counter = 0;
        while(currNode != null){
            if (counter == index) {
                prevNode.next = currNode.next;
                System.out.println(index + " position element deleted");
                break;
            } else {
                prevNode = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        return list;
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);


        printList(list);
        deleteByKey(list, 4);
        printList(list);
        deleteByKey(list, 15);

        deleteAtPosition(list, 2);
        printList(list);
    }

}
