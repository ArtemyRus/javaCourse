package lr11.example3;

import java.util.Random;

public class Main {
    static int[] intArray;
    public static void main(String[] args) {
        int i = 0;
        intArray = new int[10];
        setArray(i);
        getArray(i);
    }

    public static void setArray(int i){
        Random rnd = new Random();
        intArray[i] = rnd.nextInt(10);
        if(i < intArray.length - 1){
            setArray(i + 1);
        }
    }

    public static void getArray(int i){
        System.out.print(intArray[i] + " ");
        if (i < intArray.length - 1)
            getArray(i + 1);
    }
}
