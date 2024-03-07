package lr13.example5;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int N = 10;
        int[] intArray = new int[N];
        Random random = new Random();

        for (int i = 0; i < N; i++){
            intArray[i] = random.nextInt(100);
            System.out.println(intArray[i]);
        }

        int max = findMaxArray(intArray);
        System.out.println("Max element: " + max);
    }

    public static int findMaxArray(int[] arr){
        return Arrays.stream(arr).parallel().max().getAsInt();
    }
}
