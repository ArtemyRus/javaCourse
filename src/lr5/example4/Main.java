package lr5.example4;

public class Main {
    public static void main(String[] args) {
        CharTest firstChar = new CharTest('@', 27);
        CharTest secondChar = new CharTest(109.1870234);
        System.out.println(firstChar.number + " " + firstChar.symbol);
        System.out.println(secondChar.number + " " + secondChar.symbol);
    }
}
