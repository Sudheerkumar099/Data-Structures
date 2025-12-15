public class MyStack <T>{
    private MyLinkedList<T> list ;
    int size;

    MyStack(){
        list= new MyLinkedList<T>();
        size=0;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void push(T data){
        list.addFirst(data);
        size++;
    }

    public T pop(){
        if(list.isEmpty()){
            System.out.println("MyStack is empty");
            return null;
        }
        size--;
        return list.removeFirst();

    }

    public T peek(){
        if(list.isEmpty()){
            System.out.println("MyStack is empty");
            return null;
        }
        return list.getFirst();
    }

    public void display(){
        list.display();
    }


    int size(){
        return size;
    }


}
