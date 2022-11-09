package ba.unsa.etf.rpr;

import java.util.List;

public class MathUtil {
    public static Double min(List<Double> numbers){
        Double min = Double.MAX_VALUE;
        for(Double n:numbers){
            if(min > n.doubleValue()) min = n.doubleValue();
        }
        return min;
    }
    public static Double max(List<Double> numbers){
        Double max = Double.MIN_NORMAL;
        for(Double n : numbers){
            if(max < n.doubleValue()) max = n.doubleValue();
        }
        return max;
    }
    public static Double mean(List<Double> numbers){
        Double sumOfNumbers = 0.;
        for( Double n : numbers)sumOfNumbers = sumOfNumbers + n.doubleValue();
        return sumOfNumbers / numbers.size();

    }
    public static Double stdev(List<Double> numbers){
        Double mean = MathUtil.mean(numbers);
        float standardDeviation = 0;
        for(Double num: numbers) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation/numbers.size());
    }
}
