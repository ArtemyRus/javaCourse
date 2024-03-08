package lr11.example8;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.createHead(1,4,7,8,4,6,8);
        list.createTail(1,2,3,4,5,6,7);
        list.addFirst(0);
        list.addLast(1);
        list.insert(1,10);
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.remove(5));
        System.out.println(list);
    }
}
