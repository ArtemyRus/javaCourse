package lr6.example3;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[] {10, 1000, 100, 1};
        System.out.println(MinMaxAverage.Min(intArray));
        System.out.println(MinMaxAverage.Max(intArray));
        System.out.println(MinMaxAverage.Average(intArray));
    }
}
