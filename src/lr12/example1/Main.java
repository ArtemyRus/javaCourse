package lr12.example1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        int[] intArray = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++){
            intArray[i] = random.nextInt(100);
        }

        System.out.println("Массив intArray:");
        System.out.println(Arrays.toString(intArray));

        int[] resultArray = filterEvenNumbers(intArray);

        System.out.println("Массив resultArray:");
        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] filterEvenNumbers(int[] arr){
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}
