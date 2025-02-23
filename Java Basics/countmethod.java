package practicejava;

import java.util.Scanner;

public class countmethod
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(mul(n));
	}
	public static int mul(int n)
	{
		int m=n*7;
		return m;
	}

}
