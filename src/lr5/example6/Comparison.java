package lr5.example6;

public class Comparison {
    private int min;
    private int max;

    Comparison(){
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
    }

    Comparison(int first, int second){
        setValue(first, second);
    }

    public void setValue(int firstInt, int secondInt){
        max = Math.max(firstInt, secondInt);
        min = Math.min(firstInt,secondInt);
    }

    public void printValue(){
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
