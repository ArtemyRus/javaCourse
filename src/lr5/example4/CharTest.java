package lr5.example4;



public class CharTest {
    char symbol;
    int number;
    CharTest(char symbol, int number){
        this.symbol = symbol;
        this.number = number;
    }

    CharTest(double number){
        symbol = (char)Math.floor(number);
        this.number = (int)Math.floor(((number - Math.floor(number)) * 100));
    }
}
