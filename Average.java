public class Average {

    // adds up all the numbers and divides by how many there are
    public double findAverage(double[] numbers) {
        double sum = 0;

        for (double num : numbers) {
            sum = sum + num;
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        Average avg = new Average();
        double[] nums = {1, 77, 23, 444};

        System.out.println("The average is: " + avg.findAverage(nums));
    }
}
