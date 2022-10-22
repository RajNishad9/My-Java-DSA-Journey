package flow_of_program;
import java.util.Scanner;
public class name_greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Hello! " + name);
    }
}
