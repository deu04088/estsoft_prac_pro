package prac_ch11_6;

import java.util.List;
import java.util.Arrays;

class AverageCalculator {
    public static <T extends Number> double average(List<T> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).doubleValue();
        }
        return sum / list.size();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(AverageCalculator.average(Arrays.asList(1, 2, 3, 4)));
        System.out.println(AverageCalculator.average(Arrays.asList(1.5, 2.5, 3.0)));
    }
}
