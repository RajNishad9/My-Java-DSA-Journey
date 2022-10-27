package basicsPart_1;
import java.util.Scanner;
public class Simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the principal amount = ");
        int p = input.nextInt();

        System.out.println("Enter the interest rate = ");
        int r = input.nextInt();

        System.out.println("Enter the time = ");
        int t = input.nextInt();

        int simpleInterest = (p*r*t)/100;
        System.out.println("Simple interest is " + simpleInterest + " Rs ");








    }
}
