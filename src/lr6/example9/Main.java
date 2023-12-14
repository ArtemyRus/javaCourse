package lr6.example9;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        char[] chars  = {'h', 'e', 'l', 'l', 'o'};

        System.out.println(Arrays.toString(charArray));
        System.out.println(Arrays.toString(chars));

        Swap.changePos(chars);
        Swap.changePos(charArray);

        System.out.println(Arrays.toString(charArray));
        System.out.println(Arrays.toString(chars));
    }
}
