package practicejava;

import java.util.Scanner;

public class diomond 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	    	for(int j=i;j<n;j++)
	    	{
	    	  System.out.print(" ");
	    	}
	    	for(int j=1;j<=2*i-1;j++)
	    	{
	    		if(j==1||j==2*i-1||j==n||j==i) 
	    		{
	    		System.out.print("*");
	    	    }
	    		else 
	    		{
	    			System.out.print(" ");
	    		}
	    	}
	    	System.out.println();
	    }
	    for(int i=n;i>=1;i--)
	    {
	    	for(int j=i;j<n;j++)
	    	{
	    	  System.out.print(" ");
	    	}
	    	for(int j=1;j<=2*i-1;j++)
	    	{
	    		if(j==1||j==2*i-1||j==n||j==i) 
	    		{
		    		System.out.print("*");
		    	}
		    		else 
		    		{
		    			System.out.print(" ");
		    		}
	    	}
	    	System.out.println();
	    }
	}
}

