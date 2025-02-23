package stringconcept;
import java.util.*;
public class bubblesort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		arr=sort(arr,n);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static int[] sort(int []arr,int n)
	{
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[i]>arr[j])
			   {
				   int t=arr[i];
				   arr[i]=arr[j];
				   arr[j]=t;
			   }
		   }
	   }
	   return arr;
	}
}
