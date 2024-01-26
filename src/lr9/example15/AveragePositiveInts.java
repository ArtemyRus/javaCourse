package lr9.example15;


public class AveragePositiveInts {
    private int[] intArray;
    AveragePositiveInts(String str){
        String[] strArray = str.split(" ");
        intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++){
            try{
                intArray[i] = Integer.parseInt(strArray[i]);
            } catch (NumberFormatException ex){
                throw ex;
            }
        }
    }

    public double getAverage() throws Exception{
        double result = 0;
        int count = 0;
        for (int value : intArray){
            if(value > 0){
                result += value;
                count++;
            }
        }
            if(count == 0)
                throw new Exception();
        return result / count;
    }
}
