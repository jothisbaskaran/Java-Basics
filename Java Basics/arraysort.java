package practicejava;

import java.util.Arrays;

public class arraysort 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,8,3,6,4};
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
