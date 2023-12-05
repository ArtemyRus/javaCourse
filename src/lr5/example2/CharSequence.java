package lr5.example2;

public class CharSequence {
    public char firstChar;
    public char secondChar;
    public void createAndPrintSequence(){
        for (int i = this.firstChar; i <= this.secondChar; i++)
            System.out.print((char)i + " ");
    }
}
