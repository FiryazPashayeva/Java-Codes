import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();

        if(year % 4==0){
            System.out.print("Its a leap year!");
        }
        else {
            System.out.print("Its not a leap year!");
        }
    }

}
