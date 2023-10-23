package lr3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Example6 {
    static int[] CreateArray(int count){
        int [] arrayInt;
        try{
            arrayInt = new int[count];
        }
        catch (NegativeArraySizeException e){
            System.out.println("Размер массива меньше нуля");
            return new int[]{};
        }
        for (int i = 0, number = 1; i < count; number++){
            if (number % 5 == 2){
                arrayInt[i] = number;
                i++;
            }
        }
        return arrayInt;
    }
    static void PrintArray(int[] array){
        for (int i :
                array) {
            System.out.printf(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        PrintArray(CreateArray(size));
    }
}
