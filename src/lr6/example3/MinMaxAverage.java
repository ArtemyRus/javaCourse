package lr6.example3;

import java.util.Arrays;

public class MinMaxAverage {
    public static int Min(int ... values){
        Arrays.sort(values);
        return values[0];
    }

    public static int Max(int ... values){
        Arrays.sort(values);
        return values[values.length - 1];
    }

    public static int Average(int ... values){
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}
