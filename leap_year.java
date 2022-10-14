package flow_of_program;
import java.util.Scanner;
public class leap_year{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the year");

        int year = input.nextInt();

        if(year%4==0) {
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("No its not a leap year");
        }

    }

}
