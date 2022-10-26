package basicsPart_1;
import java.util.Scanner;
public class isString_Palindrome {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);

       System.out.println("Enter the string value! ");

       String name = input.nextLine();
       String reverseName = "";

       for(int i = name.length()-1; i >= 0; i--){
           reverseName = reverseName + name.charAt(i);
       }

       if(name.toLowerCase().equals(reverseName.toLowerCase())){
           System.out.println(name + " is a palindrome string. ");
       }
       else{
           System.out.println(name + " is not a palindrome string. ");
       }

    }
}
