/*WAP to check if two numbers are twin prime or not*/
import java.util.*;

class TwinPrime
{
    public static void main(String args[])
    {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        a = sc.nextInt();
        System.out.println("Enter second number : ");
        b = sc.nextInt();
        int i = 2;
        boolean isAprime=true, isBprime=true;
        for(i = 2; i <= a / 2; i ++){
            if(a % i == 0){
                isAprime = false;
                break;
            }
        }
        for(i = 2; i <= b/2; i ++){
            if(b % i == 0){
                isBprime = false;
                break;
            }
        }
        if(isAprime == true && isBprime == true)
        {
            if(a - b == 2 || b - a == 2)
            {
                System.out.println("The numbers are twin prime. ");
            }
            else
            {
                System.out.println("The numbers are not twin prime. ");
            }
        }
        else
        {
            System.out.println("The numbers are not twin prime. ");
        }
    }
}