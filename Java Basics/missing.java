package stringconcept;
import java.util.*;
public class missing 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int i=arr[arr.length-1];
		int sum=(i*(i+1))/2;
	    for(int j=0;j<arr.length;j++)
	    {
	    	sum=sum-arr[j];
	    }
		System.out.println(sum);
	}
}
