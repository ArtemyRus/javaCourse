package lr7.example4;

public class First {
    public char symbol;

    First(){
        symbol = ' ';
    }

    First(char symbol){
        this.symbol = symbol;
    }

    First(First ob){
        symbol = ob.symbol;
    }

    public String toString(){
        return "Class name: " + getClass().getSimpleName() + '\n' +
                "Variables: " + symbol;
    }
}
