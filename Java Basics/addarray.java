package practicejava;
import java.util.Arrays;
import java.util.Scanner;
public class addarray 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		int d=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		    d=d*10+arr[i];
		}
		d=d+1;
		String s=d+"";
		int[]arr1=new int[s.length()];
		for(int i=s.length()-1;i>=0;i--)
		{
			arr1[i]=d%10;
			d=d/10;
		}
		for(int i=0;i<s.length();i++)
		{
		System.out.print(arr1[i]+" ");
		}
	}
}
