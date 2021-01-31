import java.util.*;

class MagicNumber{
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        int q=num, r=0, ans=0;
        while(ans>9){
            while(q>=0){
                r=q%10;
                q=q/10;
                ans+=r;
            }
            q=ans;
        }
        if(ans==1){
            System.out.println("The number is a magic number.");
        }
        else{
            System.out.println("The number is not a magic number. ");
        }
    }
}