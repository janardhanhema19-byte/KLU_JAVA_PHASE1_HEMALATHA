import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        int n = obj.nextInt();
        int i,j;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
        arr[i]=obj.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<n-1;j++)
            {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    for(i=0;i<n;i++)
    System.out.print(arr[i]+" ");
}
}