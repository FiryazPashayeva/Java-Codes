import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;

        while (true) {
            System.out.print("Enter your number: ");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (number>=2 && number<=12){
                int dice1 = (int)(Math.random() * 6) + 1;
                int dice2 = (int)(Math.random() * 6) + 1;
                sum=dice1+dice2;
                if (number==sum){
                    System.out.println("Dice 1: " + dice1);
                    System.out.println("Dice 2: " + dice2);
                    System.out.println("Player wins!");
                }
                else{
                    System.out.println("Dice 1: " + dice1);
                    System.out.println("Dice 2: " + dice2);
                    System.out.println("Computer wins!");
                }
            }
        }
    }
}
