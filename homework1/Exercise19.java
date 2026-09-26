import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();

        System.out.print("Enter second number: ");
        int second = input.nextInt();

        for (int n = first; n <= second; n++) {

            int a = n;
            double sum = 0;

            while (a > 0) {
                int last = a % 10;

                double b = Math.pow(last, 3);
                sum = sum + b;

                a = a / 10;
            }

            if (sum == n) {
                System.out.println(n);
            }
        }
    }
}