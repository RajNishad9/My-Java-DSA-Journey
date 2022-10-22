package flow_of_program;
import java.util.Scanner;
public class rupees_to_dollars {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the currency in rupees");
        float rupees = input.nextInt();

        float dollars = rupees/82.1542f;
        System.out.println("The value of given currency in dollars is = " + dollars + " dollars ");
    }
}
