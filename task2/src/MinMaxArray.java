import java.util.Random;

public class MinMaxArray {
    public static void main(String[] args) {
        int min = 1000; // Set min to a high value initially
        int max = 0;
        Random r = new Random();
        int nums[] = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(100) + 1; // Generate random numbers between 1 and 100
            System.out.print(nums[i] + " "); // Print the numbers

            if (nums[i] < min) {
                min = nums[i]; // Update min if a smaller number is found
            }
            if (nums[i] > max) {
                max = nums[i]; // Update max if a larger number is found
            }
        }

        System.out.println();

        System.out.println("The smallest value is: " + min);
        System.out.println("The greatest value is: " + max);
    }
}