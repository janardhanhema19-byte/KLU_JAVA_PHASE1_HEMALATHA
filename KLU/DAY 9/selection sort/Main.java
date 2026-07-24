import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[]=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        arr[i]=obj.nextInt();
        for(i=0;i<n;i++)
        {
            int minind=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minind])
                {
                    minind=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minind];
            arr[minind]=temp;
        }
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}