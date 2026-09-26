import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int max = number;
        int min = number;

        while (input.hasNextInt()) {
            number = input.nextInt();
            if (number >= max) {
                max = number;
            }
            if (number <= min) {
                min = number;
            }
        }
        System.out.println("Maximum is: " + max);
        System.out.println("Minimum is: " + min);
    }
}