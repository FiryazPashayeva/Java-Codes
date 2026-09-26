import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();

        int sum = 0;

        if (number1 > number2) {

            for (int i = number2; i <= number1; i++) {
                if (i % 2 == 1) {
                    sum = sum + i;
                }
            }

        } else {

            for (int i = number1; i <= number2; i++) {
                if (i % 2 == 1) {
                    sum = sum + i;
                }
            }
        }

        System.out.println(sum);
    }
}