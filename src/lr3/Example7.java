package lr3;

import java.util.*;

public class Example7 {

    public static void main(String[] args) {
        int size = 10;
        char letter = 'a';
        char[] charArray = new char[size];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = letter;
            letter += 2;
        }
        System.out.println(Arrays.toString(charArray));

        for (int i = charArray.length - 1; i >= 0; i--){
            System.out.printf(charArray[i] + " ");
        }
        System.out.println();
    }
}
