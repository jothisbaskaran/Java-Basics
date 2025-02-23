package practicejava;
import java.util.Scanner;
public class numberpresent 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[10];
		arr[0]=1;
		while(n>0)
		{
			int d=n%10;
			arr[d]=d;
			n=n/10;
		}
		System.out.print("Missing no:");
		for(int i=0;i<10;i++)
		{
			if(i!=arr[i])
			{
				System.out.print(i+" ");
			}
		}
	}
}
