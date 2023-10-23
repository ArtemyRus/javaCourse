package lr3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example8 {
    static boolean isVowel(char a){
        Character[] vowelsArray = {'a', 'e', 'i', 'o', 'u', 'y'};
        List<Character> list = Arrays.asList(vowelsArray);
        return list.contains(Character.toLowerCase(a));
    }
    public static void main(String[] args) {
        int size = 10;
        char letter = 'A';
        char[] charArray = new char[size];
        for (int i = 0; i < charArray.length; letter++){
            if(!isVowel(letter)) {
                charArray[i] = letter;
                i++;
            }
        }
        System.out.println(Arrays.toString(charArray));
    }
}
