package practicejava;

import java.util.Scanner;

public class method 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(sum(a,b));
		System.out.println(diff(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
		System.out.println(rem(a,b));
	}
	public static int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static int diff(int a,int b)
	{
		int c=a-b;
		return c;
	}
	public static int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	public static int div(int a,int b)
	{
		int c=a/b;
		return c;
	}
	public static int rem(int a,int b)
	{
		int c=a%b;
		return c;
	}
}