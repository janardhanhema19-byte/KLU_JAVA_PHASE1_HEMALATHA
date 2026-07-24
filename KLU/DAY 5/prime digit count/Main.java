import java.util.*;
class Main 
{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int d,c=0;
        while(n!=0)
        {
            d=n%10;
            if(d==2||d==3||d==5||d==7)
            c++;
            n=n/10;
        }
        System.out.print(c+" ");
        
    }
}