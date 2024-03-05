package lr11.example8;

public class LinkList {
    private Node head;
    public LinkList(){}
    public void createHead(int ... params){
        if(params.length == 0) return;

        Node t;
        Node n = new Node(params[0], null);
        head = n;
        for (int i = 1; i < params.length; i++){
            t = n;
            n = new Node(params[i], null);
            t.setNext(n);
        }
    }

    public void createTail(int ... params){
        Node n = null;
        for (int i = params.length - 1; i >= 0; i--){
            n = new Node(params[i], n);
        }
        head = n;
    }

    public void addFirst(int val){
        head = new Node(val, head);
    }

    public void addLast(int val) {
        Node ref = head;
        while (ref.getNext() != null) {
            ref = ref.getNext();
        }
        ref.setNext(new Node(val, null));
    }

    public void insert(int index, int val){
        Node newNode = new Node(val, null);
        Node ref = head;
        int k = 1;
        while(ref.getNext() != null && k < index){
            ref = ref.getNext();
            k++;
        }
        newNode.setNext(ref.getNext());
        ref.setNext(newNode);
    }

    public int removeFirst(){
        Node ref = head;
        head = head.getNext();
        return ref.getValue();
    }

    public int removeLast(){
        Node ref = head;
        while(ref.getNext().getNext() != null){
            ref = ref.getNext();
        }
        Node last = ref.getNext();
        ref.setNext(null);
        return last.getValue();
    }

    public int remove(int index){
        Node ref = head;
        int k = 1;
        while(ref.getNext() != null && k < index){
            ref = ref.getNext();
            k++;
        }
        Node removedNode = ref.getNext();
        ref.setNext(ref.getNext().getNext());
        return removedNode.getValue();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node ref = head;
        while (ref != null){
            sb.append(" ").append(ref.getValue());
            ref = ref.getNext();
        }
        return sb.toString();
    }

    public Node getHead() {
        return head;
    }
}
