package practicejava;

import java.util.Scanner;

public class removingelement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		int key=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i==key)
			{
				continue;
			}
		System.out.print(arr[i]+" ");
	    }
	}

}
