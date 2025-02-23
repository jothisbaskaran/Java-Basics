package stringconcept;
import java.util.*;
public class delete
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
		System.out.println(Arrays.toString(arr));	
		int pos=sc.nextInt();
		arr=delete(arr,pos);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] delete(int[]arr,int pos)
	{
		int[] array=new int[arr.length-1];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i!=pos)
			{
				array[j]=arr[i];
				j++;
			}
		}
		return array;
	}
}