/*WAP to check if a number is palindrome or not*/
import java.util.*;

class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a Number to check if palindrome or not");
        num = sc.nextInt();
        int rev = 0, q = num, r = 0; 
        while(q != 0)
        {
            r = q % 10;
            q = q / 10;
            rev = rev * 10 + r;
        }
        if(rev == num){
            System.out.println("The number : "+ num +" is Palindrome");
        }
        else{
            System.out.println("The number : "+ num +" is not Palindrome");
        }
    }
}