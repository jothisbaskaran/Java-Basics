package practicejava;

import java.util.Scanner;

public class withreturn 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=reverse(n);
		int ans=m-n;
		System.out.println(ans);
	}
	public static int reverse(int n)
	{
		int res=0;
		while(n>0)
		{
			int d=n%10;
			res=res*10+d;
			n=n/10;
		}
		return res;
	}
}


