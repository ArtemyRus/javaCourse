package lr5.example1;

public class Main {
    public static void main(String[] args) {
        Symbol symbol = new Symbol();
        symbol.setSymbol('Y');
        int value = symbol.getCodeSymbol();
        System.out.println(value);
        symbol.printSymbol();
    }
}
