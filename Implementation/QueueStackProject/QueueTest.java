package Implementation.QueueStackProject;


public class QueueTest {
    public static void main(String[] args) {
        QueueEx<Integer> que = new QueueEx<>();

        que.add(8);
        que.add(9);
        que.add(25);

        System.out.println(que.print());
        System.out.println(que.poll());
        System.out.println(que.peek());
        System.out.println(que.size());

        StackEx st = new StackEx();

        st.push(15);
        st.push("text");
        st.push(57);
        st.push(87);

        System.out.println(st.peek());
        System.out.println(st.search(57));


//       Queue<Integer> q = new LinkedList<>();
//
//        // add ing element
//        q.add(1);
//        q.add(2);
//        q.add(3);
//
//        //view queue
//        System.out.println(q);
//
//        //view head
//        System.out.println(q.peek());
//
//        //remove head of que
//        System.out.println(q.poll());
//        //or
//        q.remove(3);
//        System.out.println(q);
//
//        //view size
//        System.out.println(q.size());


        /************** Stack *******************/
//        Stack stack = new Stack();
//
//        stack.push(15);
//        stack.push(18);
//        stack.push(47);
//        stack.push("text");

//        System.out.println(stack);
//        System.out.println(stack.search(47));

//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack);





    }
}
