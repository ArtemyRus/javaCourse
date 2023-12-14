package lr6.example1;

public class Main {
    public static void main(String[] args) {
        Symbols symb = new Symbols();
        symb.write(new char[] {'h', 'e', 'l', 'l', 'o'});
        symb.write(new char[] {'a'});
        symb.printSymbol();
        symb.printText();
    }
}
