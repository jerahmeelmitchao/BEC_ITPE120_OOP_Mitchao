public class StaticMethodMain{   
   public static void main(String[] args) {
        double[] numbers = { 1, 2, 3, 4, 5 };
        double average = StaticMethod.calculateAverage(numbers);
        System.out.println("Average: " + average);
    }
}
