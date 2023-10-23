package lr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Количество элементов массива: ");
        int size = in.nextInt();
        Integer[] intArray = new Integer[size];
        Random random = new Random();

        for (int i = 0; i < intArray.length; i++)
            intArray[i] = random.nextInt(100);
        System.out.println(Arrays.toString(intArray));

        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(intArray));
        in.close();
    }
}
