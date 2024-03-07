package lr13.example6;

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

        int value = sumElementsArray(intArray);
        System.out.println("Sum of elements: " + value);
    }

    public static int sumElementsArray(int[] arr){
        return (int)Arrays.stream(arr).parallel().summaryStatistics().getSum();
    }
}
