package lr6.example7;

public class Example {
    public static int[] charToInt(char[] charArray){
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < intArray.length; i++)
            intArray[i] = charArray[i];
        return intArray;
    }
}
