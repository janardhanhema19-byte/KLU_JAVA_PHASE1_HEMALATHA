import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	
	{
	Scanner obj = new Scanner(System.in);
	int n = obj.nextInt();
	int i;
	int arr[] =new int[n];
	for(i=0;i<n;i++)
	arr[i]=obj.nextInt();
	int ind = obj.nextInt();
	int val = obj.nextInt();
	arr[ind]=val;
	for(i=0;i<n;i++)
	System.out.print(arr[i]+" ");
	}
}
