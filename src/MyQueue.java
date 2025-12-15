public class MyQueue<T> {

    private MyLinkedList<T> list;
    private int size;

    MyQueue() {
        list = new MyLinkedList<T>();
        size = 0;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void addLast(T data) {
        list.add(data);
        size++;
    }

    public void addfirst(T data) {
        size++;
        list.add(data);
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        size--;
        list.removeFirst();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        size--;
        list.removeLast();
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return list.getFirst();
    }

    public void dispaly(){
        list.display();
    }
    public void dispalyInReverse(){
        list.displayInReverse();
    }


    public int size() {
        return size;
    }


}
