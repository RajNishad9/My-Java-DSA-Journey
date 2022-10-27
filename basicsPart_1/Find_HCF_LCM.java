package basicsPart_1;
import java.util.Scanner;
public class Find_HCF_LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of first number");
        int num1 = input.nextInt();

        System.out.println("Enter the value of second number");
        int num2 = input.nextInt();

        int biggest = Math.min(num1,num2);

//            for (int i = biggest; true; i--) {
//                 int hcf = i;
//                if (num1 % hcf == 0 & num2 % hcf == 0) {
//                    System.out.println("hcf is "+hcf);
//                    return;
//                }




                for (int i = 2; i<biggest; i++) {
                    int hcf = i;
                    if (num1 % hcf == 0 & num2 % hcf == 0) {
                        System.out.println("hcf is "+hcf);

                    }
                //System.out.println("hcf is "+hcf);
int lcm = (num1*num2)/hcf;
                    System.out.println("lcm is "+lcm);
            }
        }
    }

