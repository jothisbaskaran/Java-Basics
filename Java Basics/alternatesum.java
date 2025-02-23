package practicejava;
import java.util.Scanner;
public class alternatesum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=n+"";
		char[]ch=s.toCharArray();
		int sum=0;
		int sum1=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i%2==0)
			{
				int a=Character.getNumericValue(ch[i]);
				sum=sum+a;
			}
     		else
			{
     			int b=Character.getNumericValue(ch[i]);
				sum1=sum1+b;
			}
		}
		int res=sum-sum1;
		System.out.println(res);
	}
}
