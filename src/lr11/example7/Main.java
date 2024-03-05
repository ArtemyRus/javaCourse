package lr11.example7;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        final int N = 100000;
        ArrayList<Integer> arrayList = new ArrayList<>(N);
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            arrayList.add(i + 1);
            linkedList.add(i + 1);
        }

        long start = System.currentTimeMillis();
        while (linkedList.size() != 1){
            for (int i = 1; i < linkedList.size(); i++) {
                linkedList.remove(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения в Linked List: " + (end - start) + " мс");

        start = System.currentTimeMillis();
        while (arrayList.size() != 1){
            for (int i = 1; i < arrayList.size(); i++) {
                arrayList.remove(i);
            }
        }
        end = System.currentTimeMillis();
        System.out.println("Время выполнения в Array List: " + (end - start) + " мс");
    }
}
