public class StaticMethod {
    
    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

}