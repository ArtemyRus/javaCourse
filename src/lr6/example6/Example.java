package lr6.example6;

import java.util.Arrays;

public class Example {
    public static int[] arraySub(int[] array, int n){
        return (n > array.length)
                ? Arrays.copyOf(array, array.length)
                : Arrays.copyOf(array, n);
    }
}
