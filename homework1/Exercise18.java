import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count = count + 1;
                }
            }
            if (count==2 || count<2){
                System.out.println("Its a prime number");
            }
            else{
                System.out.println("Its not a prime number");

            }




        }

    }