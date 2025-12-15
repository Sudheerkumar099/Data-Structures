public class MyLinkedList<T> {
Node<T> head;
Node<T> last;
int size;

MyLinkedList(){
    this.head=null;
    this.last=null;
    size=0;
}

public boolean isEmpty() {
    if(head == null){
        return true;
    }
    return  false;
}

public T getFirst(){
    if(isEmpty()){
        System.out.println("Linked List is empty");
        return null;
    }
    return head.data;
}

public T getLast(){
        Node<T> temp=head;
        while(temp !=null){
            temp=temp.next;
        }
        return temp.data;
    }

public  void addFirst(T data){
    Node<T> newNode = new Node<T>(data);
    newNode.next=head;
    newNode.previous=newNode;
    head =newNode;
    size++;
}

public T removeFirst(){
    if(isEmpty()){
        System.out.println("The Linked List is Empty");
        return null;
    }
    T data = head.data;
    head = head.next;
    head.previous=null;
    size--;
    return data;
}

public T removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List is Empty");
            return null;
        }
        T data = last.data;
        if (head == last) {
            head = last = null;
        } else {
            last = last.previous;
            last.next = null;
        }
        size--;
        return data;
    }

public void add(T data){
    Node <T> newNode= new Node<T>(data);
    if(isEmpty()){
    head=newNode;
    }
    else{
       last.next=newNode;
       newNode.previous=last;
       last=newNode;
    }
    size++;
}

public void display(){
    if(isEmpty()){
        System.out.println("Linked List is Empty");
        return;
    }

    Node<T> temp=head;
    while(temp !=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}

public void displayInReverse() {
        Node<T> temp = last;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.previous;
        }
        System.out.println();
    }

public int size() {
        return size;
    }

}
