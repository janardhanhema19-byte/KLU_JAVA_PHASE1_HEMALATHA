import java.util.*;
class Main 
{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int row,col;
        for(row=0;row<n;row++,System.out.println())
        {
            for(col=0;col<n;col++)
            {
                if((col+row)%2==0)
                System.out.print("1");
                else 
                System.out.print("0");
            }
        }
    }
}