import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        double sum=0;


            for (int i = 0; i < n; i++) {

                int exponent = 2 * i + 1;

                if (i == 0) {
                    System.out.print("x");
                } else if (i % 2 == 1) {
                    System.out.print(" - x^" + exponent + "/" + exponent + "!");
                } else {
                    System.out.print(" + x^" + exponent + "/" + exponent + "!");
                }
            }

        }

    }

