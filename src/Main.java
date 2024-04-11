import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Double,Double> square1 = new Function<Double, Double>() {
            @Override
            public Double apply(Double value) {
                return value * value;
            }
        };
        Double apply = square1.apply(5.0);
        System.out.println(apply);
    }
    }

