package lr12.example2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        int[] intArray1 = new int[size];
        int[] intArray2 = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++){
            intArray1[i] = random.nextInt(100);
            intArray2[i] = random.nextInt(100);
        }

        System.out.println("Массив intArray1:");
        System.out.println(Arrays.toString(intArray1));
        System.out.println("Массив intArray2:");
        System.out.println(Arrays.toString(intArray2));

        int[] resultArray = findEqualElements(intArray1, intArray2);

        System.out.println("Массив resultArray:");
        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] findEqualElements(int[] arr1, int[] arr2){
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2).
                        anyMatch(y -> y == x))
                .toArray();
    }
}
