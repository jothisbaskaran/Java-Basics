package practicejava;
import java.util.*;
public class recSum {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(rec(n));
	}
	public static int rec(int n)
	{
		if(n==0)
		{
			return n;
		}
		return n+rec(n-1);
	}
}