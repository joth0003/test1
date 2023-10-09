import java.text.DecimalFormat;

public class RandomNumberSumAverage {
    public static void main(String[] args) {
        // Generate three random numbers between 0 and 1
        double number1 = Math.random();
        double number2 = Math.random();
        double number3 = Math.random();

        // Calculate the sum
        double sum = number1 + number2 + number3;

        // Calculate the average
        double average = sum / 3;

        // Format the sum and average to two decimal places
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedSum = decimalFormat.format(sum);
        String formattedAverage = decimalFormat.format(average);

        // Display the results
        System.out.println("Random Numbers: " + number1 + ", " + number2 + ", " + number3);
        System.out.println("Sum: " + formattedSum);
        System.out.println("Average: " + formattedAverage);
    }
}