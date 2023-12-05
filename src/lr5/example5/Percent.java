package lr5.example5;

public class Percent {
    private int percentValue;

    Percent(){
        setPercentValue();
    }
    Percent(int value){
        setPercentValue(value);
    }
    public void setPercentValue() {
        percentValue = 0;
    }

    public void setPercentValue(int value){
        percentValue = Math.min(value, 100);
    }

    public void printPercentValue(){
        System.out.println(percentValue);
    }
}
