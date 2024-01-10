package lr7.example3;

public class ThirdClass extends SecondClass{
    public String str;

    ThirdClass(){}

    ThirdClass(int value, char symbol, String str){
        super(value, symbol);
        this.str = str;
    }

    public void setValue(int value, char symbol, String str){
        super.setValue(value, symbol);
        this.str = str;
    }

    public String toString(){
        return "Class name: " + getClass().getSimpleName() + '\n' +
                "Variables: " + value + '\t' + symbol + '\t' + str;
    }
}
