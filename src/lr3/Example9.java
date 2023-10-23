package lr3;

import java.util.*;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Количество элементов массива:");
        int size = in.nextInt();
        Random random = new Random();
        int[] intArray = new int[size];
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(intArray));

        System.out.print("Минимальный элемент: ");
        int min = Arrays.stream(intArray).min().getAsInt();
        System.out.println(min);

        System.out.printf("Индексы минимального элемента: ");
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == min)
                System.out.printf(i + " ");
        }
        System.out.println();
        in.close();
    }
}
