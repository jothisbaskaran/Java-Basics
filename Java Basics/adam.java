package practicejava;

import java.util.Scanner;

public class adam
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n*n;
        int sum=0;
        int res=0;
        while(n>0)
        {
        	int d=n%10;
        	sum=(sum*10+d);
        	n=n/10;
        }
        sum=sum*sum;
        while(m>0)
        {
        	int d=m%10;
            res=(res*10+d);
            m=m/10;
        }
        if(sum==res)
        {
        	System.out.println("adam no");
        }
        else
        {
        	System.out.println("not");
        }
	}
}
