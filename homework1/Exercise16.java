import java.util.Scanner;
public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = input.nextDouble();

        System.out.print("Enter y: ");
        double y = input.nextDouble();

        if (x * x + y * y <= 1) {

            System.out.println("(" + x + ", " + y + ")");
        } else {
            System.out.println("Point is outside the circle");
        }
    }
}