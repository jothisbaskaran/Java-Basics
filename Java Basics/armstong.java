package practicejava;
import java.util.Scanner;
public class armstong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int num =n;
		int res=arm(m,num);
		if(n==res) 
		{
		  System.out.println("Armstrong");	
		}
		else
		{
			System.out.println("Not an Armstrong");
		}
	}
	public static int arm(int m,int num)
	{
		int c=0;
		while(m>0)
		{
			c++;
			m=m/10;
		}
		
		int result=0;
		while(num>0)
		{
			int d=num%10;
			result = (int) (result+Math.pow(d, c));
			num=num/10;
		}
		return result;
	}
}
