import java.util.Scanner;
public class Exercise15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        for (int i = 1; i <= n-1; i++) {
            int symbol;
            if (i % 2 == 1) {
                symbol = n;
            } else {
                symbol = n - 1;
            }

            for (int j = 1; j <= n; j++) {

                if ((i+j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }


            }

            System.out.println();
        }


    }
}
