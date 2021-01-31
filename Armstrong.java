import java.util.*;

class Armstrong{
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        int q=num, r=0, ans=0, nd=0;
        int rt=1;
        while(q!=0){
            q=q/10;
            nd+=1;
        }
        q=num;
        while(q!=0){
            r=q%10;
            q=q/10;
            for(int i=0; i<nd;i++){
                rt=rt*r;
            }
            ans+=rt;
            rt=1;
        }
        if(ans==num){
            System.out.println("The number is Armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }
    }
}