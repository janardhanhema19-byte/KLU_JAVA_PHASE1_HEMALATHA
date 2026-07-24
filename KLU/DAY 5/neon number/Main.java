import java.util.*;
class Main 
{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sr=n*n;
        int sum=0;
        while(sr!=0)
        {
            sum=n%10;
            sr/=10;
        }
        if(n==sum)
        System.out.print("Neon Number");
        else 
        System.out.print("Not a Neon Number");
    }
}