import java.util.*;
class Main 
{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt(); 
        int temp=n,d,rev=0;
        while(n!=0) 
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(temp==rev)
        System.out.print("polindrome number");
        else
        System.out.print("Not a polindrome number");
    }
}