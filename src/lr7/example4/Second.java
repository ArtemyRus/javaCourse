package lr7.example4;

public class Second extends First{
    public String str;

    Second(){
        super();
        str = "";
    }

    Second(char symbol, String str){
        super(symbol);
        this.str = str;
    }

    Second(Second ob){
        super(ob);
        str = ob.str;
    }

    public String toString(){
        return "Class name: " + getClass().getSimpleName() + '\n' +
                "Variables: " + symbol + '\t' + str;
    }
}
