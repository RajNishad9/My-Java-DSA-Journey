package basicsPart_2;
import java.util.Scanner;
public class all_Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the value of number! ");
        int number = input.nextInt();

        System.out.println("The factors of " + number + " are :");
        for(int i = 1; i<number; i++){
            if(number % i == 0){
                System.out.println(i);
            }

        }
    }
}
