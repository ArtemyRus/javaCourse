package lr5.example1;

public class Symbol {
    private char symbol;

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getCodeSymbol(){
        return symbol;
    }

    public void printSymbol(){
        System.out.println(symbol + " " + (int)symbol);
    }
}
