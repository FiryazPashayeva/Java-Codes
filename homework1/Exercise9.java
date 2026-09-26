import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (input.hasNextInt()) {
            int number = input.nextInt();
            sum = sum + number;
            count++;
        }

        if (count == 0) {
            System.out.println("Error: No input");
        } else {
            double average = (double) sum / count;
            System.out.println(average);
        }
    }
}