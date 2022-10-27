package basicsPart_1;
import java.util.Scanner;
public class fibonacci_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value! ");

        int value = input.nextInt();

        int firstNum = 0;
        int secondNum = 1;
        int nextNum;

        for(int i = 1; i <= value; i++){
            System.out.print(firstNum + ", ");
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }

    }
}


