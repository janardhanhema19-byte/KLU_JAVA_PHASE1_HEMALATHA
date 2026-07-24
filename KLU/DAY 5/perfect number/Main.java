import java.util.*;
class Main 
{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt(); //6
        int sum =0,i;
        for(i=1;i<=n/2;i++) //i=4 4<=3
        {
           
            if(n%i==0)
           sum=sum+i;
        }
        if(sum==n)
        System.out.print("Perfect Number");
        else
        System.out.print("Not a Perfect Number");
        
    }
}