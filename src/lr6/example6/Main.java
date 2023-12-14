package lr6.example6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] subArray = Example.arraySub(intArray, 5);
        int[] subArray1 = Example.arraySub(subArray, 15);

        System.out.println(Arrays.toString(subArray));
        System.out.println(Arrays.toString(subArray1));

        System.out.println(Arrays.equals(subArray, subArray1));
        System.out.println(subArray.equals(subArray1));
    }
}
