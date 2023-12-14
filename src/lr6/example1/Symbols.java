package lr6.example1;

public class Symbols {
    private char symbol;
    private String text;

    public void write(char symbol){
        this.symbol = symbol;
    }

    public void write(String text){
        this.text = text;
    }

    public void write(char[] symbols){
        if(symbols.length == 1)
            write(symbols[0]);
        else
            text = new String(symbols);
    }

    public void printSymbol(){
        System.out.println(symbol);
    }

    public void printText(){
        System.out.println(text);
    }
}
