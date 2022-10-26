package basicsPart_1;
import java.util.Scanner;
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the value of number ");
        int num = input.nextInt();
        int temp1 = num;
        int temp2 = num;
        int sum = 0;
        int digits = 0;

        while(temp1 != 0){
            temp1 = temp1 / 10;
            digits++;
        }

        while(temp2 != 0){
            int remainder = temp2%10;
            sum += Math.pow(remainder,digits);
            temp2 = temp2/10;
        }

        if(sum == num){
            System.out.println("The given number is an armstrong number ");
        }
        else{
            System.out.println("The given number is not an armstrong number ");
        }
    }
}