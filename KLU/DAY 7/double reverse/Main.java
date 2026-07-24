import java.util.*;
class Main 
{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int ans = doublerev(n);
        if(ans==n)
        System.out.print(true);
        else 
        System.out.print(false);
        
    }
  static int doublerev(int n)
    {
        int d,rev1=0,rev2=0;
        while(n!=0)
        {
            d=n%10;
            rev1=rev1*10+d;
            n=n/10;
        }
        while(rev1!=0)
        {
            d=rev1%10;
            rev2=rev2*10+d;
            rev1=rev1/10;
        }
        return rev2;
    }
}
        
