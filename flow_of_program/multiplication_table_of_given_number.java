package flow_of_program;
import java.util.Scanner;

public class multiplication_table_of_given_number {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the value of number");
        int num = input.nextInt();

        for(int i = 1; i<=10; i++){

            System.out.println(num + " * " + i + " = " + num*i);

        }





    }
}
