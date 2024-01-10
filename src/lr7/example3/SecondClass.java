package lr7.example3;

public class SecondClass extends FirstClass{
    public char symbol;

    SecondClass(){}

    SecondClass(int value, char symbol){
        super(value);
        this.symbol = symbol;
    }

    public void setValue(int value, char symbol){
        super.value = value;
        this.symbol = symbol;
    }

    public String toString(){
        return "Class name: " + getClass().getSimpleName() + '\n' +
                "Variables: " + value + '\t' + symbol;
    }
}
