import java.util.Date;

public class MyLinkedList<T> {
Node<T> head;
MyLinkedList(){
    this.head=null;
}

public boolean isEmpty() {
    if(head == null){
        return true;
    }else{
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
    head =newNode;
}

public T removeFirst(){
    if(isEmpty()){
        System.out.println("The Linked List is Empty");
        return null;
    }
    T data = head.data;
    head = head.next;
    return data;

}

public T removeLast(){
        if(isEmpty()){
            System.out.println("Linked List is Empty");
            return null;
        }
        if(head.next==null){
            T data=head.data;
            head=null;
            return data;
        }

        Node<T> temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        T data = temp.next.data;
        temp.next=null;
        return data;



    }
    public void add(T data){
    Node <T> newNode= new Node<T>(data);
    if(isEmpty()){
    head=newNode;
    return;
    }

    Node<T> temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newNode;
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

public void displayInReverse(){
    reverseDisplayHelper(head);
    System.out.println();
}

public void reverseDisplayHelper(Node <T> node){
    if(node==null){
        return;
    }
    reverseDisplayHelper(node.next);
    System.out.print(node.data+" ");

}







}
