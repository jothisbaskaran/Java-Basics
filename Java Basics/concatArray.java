package practicejava;
import java.util.Scanner;
public class concatArray 
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
		int []arr1=new int[arr.length*2];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
			arr1[k+arr.length]=arr[i];
			k++;
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
}
