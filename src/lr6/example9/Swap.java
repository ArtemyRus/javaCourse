package lr6.example9;

public class Swap {
    public static void changePos(char[] array){
        char temp;
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
