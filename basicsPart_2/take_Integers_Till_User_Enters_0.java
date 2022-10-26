package basicsPart_2;
import java.util.Scanner;
public class take_Integers_Till_User_Enters_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int number = 1;
        int sum = 0;
        int largest = 0;
        while(number != 0){

            int num = input.nextInt();
            sum += num;
            largest = Math.max(largest,num);

            if(num == 0){
                System.out.println("The sum of all the numbers is " + sum);
                System.out.println("The largest number among all of them is " + largest);
                number = 0;
            }

        }

    }
}
