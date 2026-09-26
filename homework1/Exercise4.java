import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        double number = input.nextDouble();

        if (number > 0) {
            System.out.print(number+" is a postive number!");
        }
        else if (number<0 ){
            System.out.print(number+" is a negative number!");
        }
        else {
            System.out.print(number+" is zero!");

        }
        }

    }
