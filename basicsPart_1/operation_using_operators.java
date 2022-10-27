package basicsPart_1;
import java.util.Scanner;
public class operation_using_operators {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the value of first number = ");
        int num1 = input.nextInt();

        System.out.println("Enter the value of second number = ");
        int num2 = input.nextInt();

        int answer;

        System.out.println("Enter the operation which you want to perform ");
        char op = input.next().charAt(0);

// +, -, *, %, /.

        if(op == '+'){
            answer = num1 + num2;
            System.out.println("the sum of the given two numbers is " + answer);
        }

        if(op == '-'){
            answer = num1 - num2;
            System.out.println("the minus of the given two numbers is " + answer);
        }

        if(op == '*'){
            answer = num1 * num2;
            System.out.println("the multiplication of the given two numbers is " + answer);
        }

        if(op == '%'){
            answer = num1 % num2;
            System.out.println("the modulo of the given two numbers is " + answer);
        }

        if(op == '/'){
            answer = num1 / num2;
            System.out.println("the division of the given two numbers is " + answer);
        }

    }
}
