package basicsPart_1;
import java.util.Scanner;
public class even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the value of number");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("The given number is a even number");
        }
        else{
            System.out.println("The given number is a odd number");
        }
    }
}
