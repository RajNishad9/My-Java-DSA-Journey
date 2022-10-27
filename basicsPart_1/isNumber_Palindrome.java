package basicsPart_1;
import java.util.Scanner;
public class isNumber_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the value of number! ");

        int number = input.nextInt(), reverse = 0, remainder;
        int tempNum = number;

        while(tempNum != 0){
            remainder = tempNum % 10;
            reverse = reverse * 10 + remainder;
            tempNum = tempNum/10;
        }

        if(reverse == number){
            System.out.println(number + " is a palindrome. ");
        }
        else{
            System.out.println(number + " is not a palindrome. ");
        }
    }
}
