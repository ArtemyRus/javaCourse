package lr7.example4;

public class Third extends Second{
    public int value;

    Third(){
        super();
        value = 0;
    }

    Third(char symbol, String str, int value){
        super(symbol,str);
        this.value = value;
    }

    Third(Third ob){
        super(ob);
        value = ob.value;
    }

    public String toString(){
        return "Class name: " + getClass().getSimpleName() + '\n' +
                "Variables: " + symbol + '\t' + str + '\t' + value;
    }
}
