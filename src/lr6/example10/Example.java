package lr6.example10;

import java.util.Arrays;

public class Example {
    public static int[] MinMax(int ... nums){
        return new int[] {Arrays.stream(nums).min().getAsInt(),
                Arrays.stream(nums).max().getAsInt()};
    }
}
