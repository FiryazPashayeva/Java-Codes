import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);

            if (i < n) {
                System.out.print(" + ");
            }


        }
    }
}