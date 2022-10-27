package basicsPart_1;
import java.util.Scanner;
public class largest_number {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the value of first number = ");
        int num1 = input.nextInt();

        System.out.println("Enter the value of second number = ");
        int num2 = input.nextInt();

        if(num1>num2){
            System.out.println("The largest number is " + num1);
        }
        else{
            System.out.println("The largest number is " + num2);
        }
    }
}
