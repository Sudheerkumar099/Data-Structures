//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addFirst(10);
        list.add(20);
        list.add(30);
        list.display();
        System.out.println();
        list.displayInReverse();
        System.out.println(list.isEmpty());
    }
}