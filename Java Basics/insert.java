package stringconcept;
import java.util.*;
public class insert
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
		int ele=sc.nextInt();
		arr=insert(arr,pos,ele);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] insert(int[]arr,int pos,int ele)
	{
		int[] array=new int[arr.length+1];
		int j=0;
		for(int i=0;i<array.length;i++)
		{
			if(i==pos)
			{
				array[i]=ele;
			}
			else
			{
				array[i]=arr[j];
				j++;
			}
		}
		return array;
	}
}