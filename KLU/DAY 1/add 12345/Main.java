import java.util.*;
class Main 
{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt(); //7213
        int d, sum=0;
        while(n!=0)//7!=0 
        {
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
        System.out.print("adding number "+sum);
    }
}