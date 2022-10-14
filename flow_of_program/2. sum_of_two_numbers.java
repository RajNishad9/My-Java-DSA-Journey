package flow_of_program;

import java.util.Scanner;

public class sum_of_two_numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of num1");
        int num1 = input.nextInt();

        System.out.println("Enter the value of num2");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of the given two numbers is = " + sum);
    }



}
