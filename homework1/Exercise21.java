import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your max number: ");
        int number = input.nextInt();
        int n = (int)(Math.random() * number) + 1;
        int attempt=0;
        System.out.print("Guess the number: ");
        while (true) {
            int guess = input.nextInt();
            attempt++;

            if (n==guess){
                System.out.print("Correct!");
                System.out.println("Attempts: " + attempt);
                break;
            }
            else if (guess>n){
                System.out.println("Your guess is higher than the number!");
                System.out.print("Try again:");
            }
            else{
                System.out.println("Your guess is lower than the number!");
                System.out.print("Try again:");
            }
        }
    }
}

