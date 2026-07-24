import java.util.*;
class Main 
{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int s=obj.nextInt(); 
        int e=obj.nextInt();
        int c,i,j;
       for(i=s;i<=e;i++)
        {
           c=0;
           for(j=2;j<=i/2;j++)
           {
               if(i%j==0)
               {
                   c++;
                   break;
               }
           }
           if(c==0)
           System.out.print(i+" ");
        }
       
    }
}