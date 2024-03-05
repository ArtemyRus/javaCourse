package lr11.example4_5;

public class FirstLinkList {
    public static void main(String[] args) {
        Node n1 = new Node(1, null);
        Node n2 = new Node(2, null);
        Node n3 = new Node(3, null);

        n1.setNext(n2);
        n2.setNext(n3);

        Node ref = n1;
        while (ref != null){
            System.out.println(" " + ref.getValue());
            ref = ref.getNext();
        }
    }
}
