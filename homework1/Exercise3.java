import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input seconds: ");
        float a = input.nextFloat();

        System.out.println( a+ " seconds" + " = "+ a/60 + " minutes ");
        System.out.println( a+ " seconds"+ " = "+ a/3600 + " hours ");

    }
}
