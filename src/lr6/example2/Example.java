package lr6.example2;

public class Example {
    private static int count;
    Example(){
        count = 0;
    }

    public static void printAndIncreaseByOne(){
        System.out.println(count++);
    }
}
