import java.util.Scanner;
public class Exercise12 {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int sum=0;
        int count=0;
        double average=0;
        int product=1;
        while(n>0) {
            int last=n%10;
            sum=sum+last;
            product=product*last;
            count=count+1;
            average=sum/count;
            n=n/10;

        }

        System.out.println(sum);
        System.out.println(average);
        System.out.println(product);





}

    }


