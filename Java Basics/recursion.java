package practicejava;
import java.util.Scanner;
public class recursion {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		rec(n,m);	
		
	}
	public static int rec(int n,int m)
	{
		if(n<=m)
		{
			System.out.print(n+" ");
		    rec(n+1,m);
		}
		return 0;
	}
}
