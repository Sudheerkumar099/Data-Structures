public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> q= new MyQueue<>();
        q.enqueue(10);
        q.addLast(20);
        q.addLast(30);
        System.out.println(q.size());
        System.out.println(q.peek());
        q.dispaly();
        q.dequeue();
        System.out.println();
        q.dispalyInReverse();
    }
}