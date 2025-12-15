public class Main {
    public static void main(String[] args) {
//        MyStack<Integer> stack = new MyStack<>();
//        System.out.println(stack.isEmpty());
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack.peek());
//        System.out.println( stack.pop());
//        stack.display();
//        stack.size();
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.searchObject(3);

    }
}