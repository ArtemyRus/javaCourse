package lr6.example8;

public class Average {
    public static int averageIntArray(int[] array){
        int result = 0;
        for (int num : array) {
            result += num;
        }
        return result / array.length;
    }
}
